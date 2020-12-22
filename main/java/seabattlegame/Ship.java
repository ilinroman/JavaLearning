package main.java.seabattlegame;

import java.util.Arrays;

/**
 * Корабль
 */
class Ship {

    /** Глобальный счетчик кол-ва кораблей */
    private static int sequence = 0;

    /** Уникальный ID */
    private int id;

    /** Имя */
    private String name;

    /** Список палуб */
    private Deck[] decks;

    /** Ориентация корабля */
    private Orientation orientation;

    public Ship(String coordinates) throws CustomException {
        //парсинг строки координат + валидацией
        GPS[] gpsArray = parseCoordinatesString(coordinates);

        //вычисление и установка параметра ориентации корабля + валидация
        setOrientation(gpsArray);

        //сборка корабля + валидация
        setDecks(gpsArray);

        this.id = ++Ship.sequence;
        this.name = "Default Name";
    }

    private GPS[] parseCoordinatesString(String coordinates) throws CustomException {
        String[] strArray = coordinates.split(";");

        GPS[] gpsArray = new GPS[strArray.length];
        //int[] intArray;

        for (int i = 0; i < strArray.length; i++) {
            //intArray = Arrays.stream(strArray[i].split(",")).mapToInt(Integer::parseInt).toArray();
            gpsArray[i] = new GPS(strArray[i]);
        }

        return gpsArray;
    }

    private void setDecks(GPS[] gpsArray) throws CustomException {
        decks = new Deck[gpsArray.length];

        //создание главной палубы
        decks[0] = new Deck(gpsArray[0], this);

        //создание остальных палуб
        int delta;
        for (int i = 1; i < gpsArray.length; i++) {
            //дельта между палубами, заданными координатами, должны быть сдвинуты на 1 клетку, иначе ошибка
            if(this.orientation == Orientation.HORIZONTAL)
                delta = gpsArray[i].getY() - decks[i - 1].getGps().getY();
            else if(this.orientation == Orientation.VERTICAL)
                delta = gpsArray[i].getX() - decks[i-1].getGps().getX();
            else
                delta = 0;
            if(delta != 1)
                throw new CustomException();

            decks[i] = new Deck(gpsArray[i], this);
        }
    }

    /**
     * Вычисление и установка ориентации корабля
     * @param gpsArray массив координат
     */
    private void setOrientation(GPS[] gpsArray) throws CustomException {
        if(gpsArray.length == 1) //одиночный
            this.orientation = Orientation.SINGLE;
        else if(GPS.equalsX(gpsArray)) //горизонтальный
            this.orientation = Orientation.HORIZONTAL;
        else if(GPS.equalsY(gpsArray)) //вретикальный
            this.orientation = Orientation.VERTICAL;
        else
            throw new CustomException();
    }

    /**
     * Размер корабля
     * TODO можно доработать, возвращать какое-то осмысленное название типа
     * @return кол-во палуб
     */
    public int getSize() {
        return this.decks.length;
    }

    public String getOrientation() {
        return orientation.toString();
    }

    public Deck[] getDecks() {
        return decks;
    }

    public int getId() {
        return id;
    }

    public boolean isActive() {
        for (Deck deck : decks)
            if(deck.isActive())
                return true;
        return false;
    }
}
