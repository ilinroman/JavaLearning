package Day5;

/**
 * Создать класс Автомобиль (англ. ​Car​ ), с полями “Год выпуска”, “Цвет”, “Модель”.
 * Создать ​get​и ​set​методы для каждого поля. Создать экземпляр класса Автомобиль,
 * задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
 * Созданный вами класс должен отвечать принципам инкапсуляции.
 */
public class Task1 {
    public static void main(String[] args) {
        Car ff = new Car();
        ff.setModel("Focus");
        ff.setColor("Silver");
        ff.setYear(2007);

        System.out.printf("%s\t%s\t%s", ff.getModel(), ff.getColor(), ff.getYear());
    }
}
