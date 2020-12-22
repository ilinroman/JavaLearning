package main.java.seabattlegame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BattleMap {

    /** Размерность поля битвы */
    private static final int MAP_SIZE = 10;

    /** Максимальное кол-во кораблей на поле битвы */
    private static final int[] MAX_SHIP_SIZE = {4, 3, 2, 1};

    /** Список "живых" кораблей на поле */
    private List<Ship> ships;

    private Point[][] map;

    public BattleMap() {
        this.ships = new ArrayList<>();
        this.map = new Point[MAP_SIZE][MAP_SIZE];
        for (int i = 0; i < MAP_SIZE; i++)
            for (int j = 0; j < MAP_SIZE; j++)
                map[i][j] = new FreeWater();
    }

    /**
     * Расположение корабля на поле битвы
     * @param coordinates
     * @throws CustomException
     */
    public void addShip(String coordinates) throws CustomException {
        Ship ship = new Ship(coordinates);

        for (Deck deck: ship.getDecks()) {
            map[deck.getGps().getX()][deck.getGps().getY()] = deck;
        }
    }

    public void addShip(Ship ship) throws CustomException {
        //проверки корабля
        if (!checkShipSize(ship))
            throw new CustomException();
        if (!checkDecksMapping(ship))
            throw new CustomException();

        //установка корабля на карте
        int x;
        int y;
        for (Deck deck: ship.getDecks()) {
            x = deck.getGps().getX();
            y = deck.getGps().getY();
            //Корабль
            map[x][y] = deck;
            //Ореол
            //TODO оптимизировать алгоритм создания ореола
            if (!(map[x-1][y-1] instanceof Deck)) map[x-1][y-1] = new ShipOreol();
            if (!(map[x-1][y]   instanceof Deck)) map[x-1][y] = new ShipOreol();
            if (!(map[x-1][y+1] instanceof Deck)) map[x-1][y+1] = new ShipOreol();
            if (!(map[x][y-1]   instanceof Deck)) map[x][y-1] = new ShipOreol();
            if (!(map[x][y+1]   instanceof Deck)) map[x][y+1] = new ShipOreol();
            if (!(map[x+1][y-1] instanceof Deck)) map[x+1][y-1] = new ShipOreol();
            if (!(map[x+1][y]   instanceof Deck)) map[x+1][y] = new ShipOreol();
            if (!(map[x+1][y+1] instanceof Deck)) map[x+1][y+1] = new ShipOreol();
        }
        this.ships.add(ship);
    }

    public boolean checkShipSize(Ship ship) {
        int shipSize = ship.getSize();
        int count = 0;
        for (Ship s: this.ships)
            if (s.getSize() == shipSize)
                count++;
        return (count < MAX_SHIP_SIZE[shipSize-1] ? true : false);
    }

    public boolean checkDecksMapping(Ship ship) {
        int x;
        int y;
        for (Deck deck: ship.getDecks()) {
            x = deck.getGps().getX();
            y = deck.getGps().getY();
            if (!(map[x][y] instanceof FreeWater) || x >= MAP_SIZE || y >= MAP_SIZE)
                return false;
        }

        return true;
    }

    public void show() {
        for (int i = 0; i < MAP_SIZE; i++) {
            System.out.print(i);
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print(i);
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    public static int maxShipsCount () {
        int counter = 0;
        for (int i = 0; i < MAX_SHIP_SIZE.length; i++) {
            counter += MAX_SHIP_SIZE[i];
        }
        return counter;
    }

    public Point shot(int x, int y) {
        map[x][y].hit();
        return map[x][y];
    }

    public void removeShip(Ship ship) {
        if(ships.contains(ship))
            ships.remove(ship);
    }

    public int countActiveShips() {
        return ships.size();
    }

    @Override
    public String toString() {
        return Arrays.deepToString(map);
    }
}
