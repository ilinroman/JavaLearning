package day4;

import java.util.Arrays;
import java.util.Random;

/**
 * Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер
 * матрицы задать ​ m=12​ , ​ n=8​(​ m​- размерность по строкам, ​n​- размерность по колонкам).
 * В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких
 * строк несколько, вывести индекс последней из них.
 */
public class Task3 {
    public static void main(String[] args) {
        int[][] arr = new int[12][8];
        Random r = new Random();
        //Запоняем массив
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = r.nextInt(50);

        //Расчет
        int sum = 0;
        int maxSum = 0;
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (sum >= maxSum) {
                maxSum = sum;
                ind = i;
            }
            sum = 0;
        }

        //Вывод в консоль
        System.out.println("Массив:");
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Ответ: " + ind);
    }
}
