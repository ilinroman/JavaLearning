package Day9;

public class Task2 {
    public static void main(String[] args) {
        //Тест-кейс 1
        /*Circle circle = new Circle("red", 10);
        Rectangle rectangle = new Rectangle("red", 10, 10);
        Triangle triangle = new Triangle("red", 10, 10, 10);
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(triangle);*/

        //Тест-кейс 2
        Figure[] figs = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("green", 10, 20, 30),
                new Triangle("reD", 10, 20, 15),
                new Rectangle("rEd", 5, 10),
                new Rectangle("orange", 40, 15),
                new Circle("red", 4),
                new Circle("red", 10),
                new Circle("blue", 5)
        };

        System.out.println("Сумма периметров красных: " + calculateRedPerimeter(figs));
        System.out.println("------------------------");
        System.out.println("Сумма площадей красных: " + calculateRedArea(figs));
    }

    public static double calculateRedPerimeter(Figure[] figs){
        double sum = 0.0;
        for (Figure f: figs) {
            if(f.getColor().equalsIgnoreCase("red")) {
                System.out.println(f);
                sum += f.perimeter();
            }
        }
        return sum;
    }

    public static double calculateRedArea(Figure[] figs){
        double sum = 0.0;
        for (Figure f: figs) {
            if(f.getColor().equalsIgnoreCase("red")) {
                System.out.println(f);
                sum += f.area();
            }
        }
        return sum;
    }
}
