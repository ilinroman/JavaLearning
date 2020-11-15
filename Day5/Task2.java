package Day5;

/**
 * Создать класс Мотоцикл (англ. ​Motorbike​ ), с полями “Год выпуска”, “Цвет”,
 * “Модель”. Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не
 * использовать). Придерживаться принципов инкапсуляции и использовать ключевое
 * слово ​this​ . Геттером получить год выпуска, цвет, модель, вывести значения в
 * консоль
 */
public class Task2 {
    public static void main(String[] args) {
        Motorbike mb = new Motorbike(2020, "black", "bmv");
        System.out.printf("%s\t%s\t%s", mb.getModel(), mb.getColor(), mb.getYear());
    }
}
