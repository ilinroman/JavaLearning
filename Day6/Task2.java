package Day6;

/**
 * Создать новый объект класса Самолет с произвольными данными.
 * Изменить год выпуска и длину с помощью сеттеров, вызвать метод ​ fillUp()​два
 * раза, передав разные значения. Вызвать метод ​ info()
 */
public class Task2 {
    public static void main(String[] args) {
        Airplane air = new Airplane("Air", 2020, 100, 1000);
        air.setYear(2019);
        air.setLength(50);
        air.fillUp(1);
        air.fillUp(2);
        air.info();
    }
}
