package main.java.seabattlegame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Командный пункт игры
 */
public class Game {

    private static final boolean isTest = true;

    private static final String[] testCoordinatesArray = {
        "0,0;0,1;0,2;0,3",
        "2,6;2,7;2,8",
        "3,2;4,2;5,2",
        "4,4;4,5",
        "7,2;7,3",
        "9,8;9,9",
        "2,0",
        "9,0",
        "7,6",
        "4,8"
    };

    private static final String[] testShotArray = {
        "0,0","0,1","0,2","0,3",
        "2,6","2,7","2,8",
        "3,2","4,2","5,2",
        "4,4","4,5",
        "7,2","7,3",
        "9,8","9,9",
        "2,0",
        "9,0",
        "7,6",
        "4,8"
    };

    public static void main(String[] args) {

        Player player1;
        Player player2;

        System.out.println("Регистрация 1-го игрока...");
        player1 = (isTest ? registerPlayerBot("Игрок 1") : registerPlayer());
        player1.getBattleMap().show();

        System.out.println("Регистрация 2-го игрока...");
        player2 = (isTest ? registerPlayerBot("Игрок 2") : registerPlayer());
        player2.getBattleMap().show();

        Player winner = gameStart(player1, player2);

        gameOver(winner);
    }


    public static Player registerPlayer() {
        Scanner sc = new Scanner(System.in);

        //Создание игрока
        System.out.println("Введите свое имя:");
        Player player = new Player(sc.nextLine());

        //Создание игрового поля
        System.out.println("Создание поля битвы...");
        BattleMap battleMap = new BattleMap();
        String coordinates;
        int maxShipsCount = BattleMap.maxShipsCount();
        int counter = 0;
        System.out.printf("Допустимое кол-во кораблей: %d\n", maxShipsCount);
        while (counter < maxShipsCount) {
            System.out.println("Введите координаты корабля:");
            coordinates = sc.nextLine();

            try {
                battleMap.addShip(coordinates);
                counter++;
            } catch (CustomException e) {
                System.out.println("Ошибка ввода! Повторите попытку");
            }
        }

        player.setBattleMap(battleMap);

        return player;
    }

    public static Player registerPlayerBot(String playerName) {
        Scanner sc = new Scanner(System.in);

        //Создание игрока
        System.out.println("Введите свое имя:");
        System.out.println(playerName);
        Player player = new Player(playerName);

        //Создание игрового поля
        System.out.println("Создание поля битвы...");
        BattleMap battleMap = new BattleMap();
        int maxShipsCount = BattleMap.maxShipsCount();
        int counter = 0;
        System.out.printf("Допустимое кол-во кораблей: %d\n", maxShipsCount);

        for (String coordinates: testCoordinatesArray) {
            System.out.println("Введите координаты корабля:");
            System.out.println(coordinates);

            try {
                battleMap.addShip(coordinates);
                counter++;
            } catch (CustomException e) {
                System.out.println("Ошибка ввода! Повторите попытку");
            }
        }
        player.setBattleMap(battleMap);
        return player;
    }

    public static Player gameStart(Player player1, Player player2) {
        List<Player> players = new ArrayList<>();

        //Жеребьевка
        //TODO упрощенный алгоритм - только для 2-х участников
        if (Math.random() > 0.5) {
            players.add(player1);
            players.add(player2);
        } else {
            players.add(player2);
            players.add(player1);
        }
        player1.setOpponent(player2);
        player2.setOpponent(player1);
        System.out.println("Кол-во игроков: " + players.size());

        System.out.println("Поединок надачался...");

        int counter = 1;
        while (players.size() > 1) {
            System.out.println("Раунд " + counter++);
            for (Player currentPlayer: players) {
                if(shooting(currentPlayer, currentPlayer.getOpponent().getBattleMap())) {
                    players.remove(currentPlayer.getOpponent());
                    break;
                }
            }
        }
        return players.get(0);
    }

    public static boolean shooting(Player player, BattleMap map) {
        Scanner sc = new Scanner(System.in);
        System.out.println(player.getName() + " атакует игрока " + player.getOpponent().getName());
        GPS shootingCoordinate;
        Point point;
        Ship ship;
        while(true) {
            try {
                shootingCoordinate = new GPS(sc.nextLine());
                player.addShotToHistory(shootingCoordinate);
                point = map.shot(shootingCoordinate.getX(), shootingCoordinate.getY());
                if(point instanceof FreeWater || point instanceof ShipOreol){
                    System.out.println("Мимо!");
                    break;
                }
                if(point instanceof Deck){
                    ship = ((Deck) point).getShip();
                    if(ship.isActive()) {
                        System.out.println("Попадание в корабль " + ship.getId());
                    } else {
                        System.out.println("Корабль " + ship.getId() + " уничтожен");
                        map.removeShip(ship);
                        if (map.countActiveShips() == 0)
                            return true;
                    }
                }
            } catch (Exception e) {
                System.out.println("Ошибка ввода! Повторите попытку");
                continue;
            }
        }
        return false;
    }

    public static void gameOver(Player player) {
        System.out.println("Победил игрок " + player);
    }
}
