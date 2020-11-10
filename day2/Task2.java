package day2;

import java.util.Scanner;

/**
 * Задача 2
 * @author rilin
 */
public class Task2 {
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
        for (int i = a; i < b; i++) {
            if ((i % 5 == 0) && (i % 10 != 0)) {
                System.out.print(i + " ");
            }
        }
    }
}