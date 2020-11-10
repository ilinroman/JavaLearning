package day2;

import java.util.Scanner;
import static java.lang.Math.pow;

/**
 * Задача 4
 * @author rilin
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Введите вещественное число x: ");
        double x = s.nextDouble();
        double y;

        if (x >= 5) {
            y = (pow(x,2) -10) / (x + 7);
        }
        else if (x > -3 && x < 5) {
            y = (x + 3) * (pow(x,2) - 2);
        }
        else {
            y = 420;
        }

        System.out.print("Результат: " + y);
    }
}