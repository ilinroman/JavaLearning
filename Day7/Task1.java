package Day7;

/**
 * Выводит сообщение в консоль о том, какой из самолетов длиннее.
 */
public class Task1 {
    public static void main(String[] args) {
        Airplane air1 = new Airplane("Boeing", 2010, 10, 20);
        Airplane air2 = new Airplane("Airbus", 2020, 30, 40);

        Airplane.compareAirplanesfo(air1, air2);
    }
}
