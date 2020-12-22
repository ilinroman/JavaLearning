package main.java.seabattlegame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws CustomException {

//        System.out.println("\u200B⬜"); //пустая ячейка
//        System.out.println("\uD83D\uDEE5 \uD83D\uDEE5"); //Ячейки с кораблями
//        System.out.println("\uD83D\uDFE6 "); //Ореол кораблей
//        System.out.println("\uD83D\uDFE5 "); //Подбитую ячейку

        // Agenda
        /*System.out.printf("%s%s\n", CellType.EMPTY, CellType.DECK_TRUE);
        System.out.printf("%s%s\n", CellType.DECK_TRUE, CellType.EMPTY);
        System.out.println(CellType.DECK_FALSE);
        System.out.println(CellType.SHIP_ZONE);*/

        String coordinates = "1,1;1,2;1,3;1,4";

        /*Ship ship = new Ship(coordinates);
        System.out.println(Arrays.toString(ship.getDecks()));
        System.out.println(ship.getOrientation());
        System.out.println(ship.getSize());*/


        /*BattleMap map = new BattleMap();
        Ship ship = new Ship("1,1;1,2;1,3;1,4");
        map.addShip(ship);
        map.addShip(new Ship("3,1;3,2;3,3"));
        ship.getDecks()[0].killMe();
        map.show();*/

        Random r = new Random();
        System.out.println(r.nextInt(1));

        //Регистрация игрока

    }

    public static void printMatrix (int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
