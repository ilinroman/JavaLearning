package day4;

import java.util.Arrays;
import java.util.Random;

/**
 * Создать новый массив размера 100 и заполнить его случайными числами из
 * диапазона от 0 до 10000.
 * Найти максимум среди сумм трех соседних элементов. Для найденной тройки с
 * максимальной суммой выведите значение суммы и индекс первого элемента тройки.
 */
public class Task4 {
    public static void main(String[] args) {
        int dem = 100; //размерность массива
        Random r = new Random();
        int[] arr = new int[dem];

        //Запоняем массив
        for (int i = 0; i < dem; i++)
            arr[i] = r.nextInt(10000);

        //Расчет
        int maxSum = 0;
        int ind = 0;
        for (int i = 0; i < dem - 2; i++) {
            if (arr[i] + arr[i+1] + arr[i+2] >= maxSum) {
                maxSum = arr[i] + arr[i + 1] + arr[i + 2];
                ind = i;
            }
        }

        //Вывод
        System.out.println("Массив: " + Arrays.toString(arr));
        System.out.println("Сумма: " + maxSum);
        System.out.println("Индекс: " + ind);
    }
}
