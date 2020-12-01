package Day8;

/**
 * Внесите изменения в класс таким образом, чтобы следующий код выводил
 * информацию о самолете, аналогично вызову метода ​info()​:
 * Airplane airplane = ​new​Airplane (​"Boeing"​, ​2000​ , ​150​ , ​10000​ );
 * System.​out​.​println​(airplane);
 */
public class Task2 {
    public static void main(String[] args) {
        Airplane air = new Airplane("Boeing", 2000, 150, 10000);
        System.out.println(air);
    }
}
