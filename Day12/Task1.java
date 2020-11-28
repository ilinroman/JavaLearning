package Day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("ford");
        cars.add("audi");
        cars.add("bmw");
        cars.add("vw");
        cars.add("kia");
        System.out.println(cars);

        cars.add(3, "noname");
        cars.remove(0);
        System.out.println(cars);
    }
}
