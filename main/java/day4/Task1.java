package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * С клавиатуры вводится число ​n​- размер массива. Необходимо создать массив
 * указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
 * содержимое массива в консоль, а также вывести в консоль информацию о:
 * а) Длине массива
 * б) Количестве чисел больше 8
 * в) Количестве чисел равных 1
 * г) Количестве четных чисел
 * д) Количестве нечетных чисел
 * е) Сумме всех элементов массива
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = s.nextInt();
        if (n < 1) {
            System.out.println("Неверный ввод!");
            return;
        }
        int[] intArr = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            intArr[i] = r.nextInt(10);
        }

        int cnt8 = 0;       //кол-во чисел > 8
        int cnt1 = 0;       //кол-во чисел = 1
        int cntEven = 0;    //кол-во четных
        int cntOdd = 0;     //кол-во нечетных
        int sum = 0;        //сумма
        for (int i = 0; i < n; i++) {
            if (intArr[i] > 8)
                cnt8++;
            if (intArr[i] == 1)
                cnt1++;
            if (intArr[i] != 0)
                if (intArr[i]%2 > 0)
                    cntOdd++;
                else
                    cntEven++;

            sum += intArr[i];
        }

        System.out.println("Резульатат: " + Arrays.toString(intArr));
        System.out.println("Длина массива: " + intArr.length);
        System.out.println("Кол-во чисел больше 8: " + cnt8);
        System.out.println("Кол-во чисел равных 1: " + cnt1);
        System.out.println("Кол-во четных чисел: " + cntEven);
        System.out.println("Кол-во нечетных чисел: " + cntOdd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
