package day2;

import java.util.Scanner;

/**
 * Задача 3
 * @author rilin
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Пожалуйста, введите диапазон чисел: ");
        int a = s.nextInt();
        int b = s.nextInt();

        if (a >= b){
            System.out.println("Некорректный ввод");
            return;
        }

        System.out.printf("Результат для диапазона %d-%d: ", a, b);
        int div = 5;
        int i = a + (div - a % div);

        while (i < b) {
            if (i % 10 != 0) {
                System.out.print(i + " ");
            }
            i += div;
        }
    }
}