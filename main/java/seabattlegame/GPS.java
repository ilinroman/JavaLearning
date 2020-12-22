package main.java.seabattlegame;

import java.util.Arrays;

/**
 * Данные о позиции в системе координат XY
 */
class GPS {

    /** Разделитель */
    static String delimeter = ",";

    /** Размерность системы координат */
    static final int DIMENSION = 2;

    /** Позиция по оси X */
    private int x;

    /** Позиция по оси Y */
    private int y;

    /**
     * Проверка совпадения координаты по оси X
     * @param gpsArray массив координат
     * @return true - все координаты расположены в линию по оси X, false - инача
     */
    public static boolean equalsX(GPS[] gpsArray) {
        if(gpsArray.length < 2)
            return false;

        for (int i = 1; i < gpsArray.length; i++)
            if(gpsArray[i].getX() != gpsArray[i-1].getX())
                return false;

        return true;
    }

    /**
     * Проверка совпадения координаты по оси Y
     * @param gpsArray массив координат
     * @return true - все координаты расположены в линию по оси Y, false - инача
     */
    public static boolean equalsY(GPS[] gpsArray) {
        if(gpsArray.length < 2)
            return false;

        for (int i = 1; i < gpsArray.length; i++)
            if(gpsArray[i].getY() != gpsArray[i-1].getY())
                return false;

        return true;
    }

    /**
     * Конструктор 1
     * @param x по оси X
     * @param y по оси Y
     */
    public GPS(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Конструктор 2 - более гибкий
     * @param coordinateString строка с координатами
     * @throws CustomException кол-во переданных координат не соответсвует размерности системы координат
     */
    public GPS(String coordinateString) throws CustomException {
        int[] intArray = Arrays.stream(coordinateString.split(GPS.delimeter)).mapToInt(Integer::parseInt).toArray();

        //проверка переданных координат на соответствие с размерностью
        if(intArray.length != GPS.DIMENSION)
            throw new CustomException();

        this.x = intArray[0];
        this.y = intArray[1];
    }



    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("%d:%d", x, y);
    }

    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof GPS)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        GPS gps = (GPS) o;

        // Compare the data members and return accordingly
        return this.x == gps.x && this.y == gps.y;
    }

}
