package day3;

import java.util.Scanner;

/**
 * Реализовать программу, которая 5 раз запрашивает от пользователя два числа -
 * делимое и делитель. Для этих двух чисел программа рассчитывает результат деления
 * и выводит его в консоль. Если пользователь вводит 0 в качестве делителя, вместо
 * того, чтобы останавливать работу цикла принудительно, мы пропускаем итерацию и
 * выводим в консоль сообщение “Деление на 0”
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = 0.0, b = 0.0;
        System.out.println("Введите делимое и делитель: ");
        for(int i = 0; i < 5; i++) {
            a = s.nextDouble();
            b = s.nextDouble();

            if (b == 0) {
                System.out.println("Деление на 0!");
                continue;
            }

            System.out.println(a + " / " + b + " = " + a/b);
        }
    }
}