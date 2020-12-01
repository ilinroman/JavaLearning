package day4;

import java.util.Random;

/**
 * Создать новый массив размера 100 и заполнить его случайными числами из
 * диапазона от 0 до 10000.
 * Затем, используя циклы ​ for each​ вывести:
 * - наибольший элемент массива
 * - наименьший элемент массива
 * - количество элементов массива, оканчивающихся на 0
 * - сумму элементов массива, оканчивающихся на 0
 */
public class Task2 {
    public static void main(String[] args) {
        int[] intArr = new int[100];
        Random r = new Random();
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = r.nextInt(10000);
        }

        int max = intArr[0]; //наибольший элемент массива
        int min = intArr[0]; //наименьший элемент массива
        int cnt0 = 0; //количество элементов массива, оканчивающихся на 0
        int sum0 = 0; //сумму элементов массива, оканчивающихся на 0
        for (int el : intArr) {
            if (el > max)
                max = el;
            if (el < min)
                min = el;
            if (el%10 == 0) {
                cnt0++;
                sum0 += el;
            }
        }

        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + cnt0);
        System.out.println("сумму элементов массива, оканчивающихся на 0: " + sum0);
    }
}
