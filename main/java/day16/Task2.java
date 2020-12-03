package main.java.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {

    /**
     * Точка входа
     * @param args
     */
    public static void main(String[] args) {
        //файл 1
        try {
            File file1 = writeToFile1(1000, 100);
            File file2 = writeToFile2(file1, 20);
            printResult(file2);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка при обработке файла");
        }
    }

    /**
     * Заполнение файла 1
     * @param count кол-во элементов для генерации
     * @param bound верхняя граница значений при генерации
     * @return File - итоговый файл 1
     * @throws FileNotFoundException
     */
    public static File writeToFile1(int count, int bound) throws FileNotFoundException {
        File file = new File(String.format("files%sfile1.txt", File.separator));
        PrintWriter pw = new PrintWriter(file);
        Random r = new Random();
        for (int i = 0; i < count; i++) {
            pw.print(r.nextInt(bound) + " ");
        }
        pw.close();
        return file;
    }

    /**
     * Заполнение файла 2
     * @param file1 файл 1 - источник данных
     * @param bulk размер для группировки
     * @return File - итоговый файл 2
     * @throws FileNotFoundException
     */
    public static File writeToFile2(File file1, int bulk) throws FileNotFoundException {
        Scanner sc = new Scanner(file1);
        File file2 = new File(String.format("files%sfile2.txt", File.separator));
        PrintWriter pw = new PrintWriter(file2);
        String[] str = sc.nextLine().split(" ");
        double calc = 0.0;
        int i = 0;
        for (String s: str) {
            calc += Integer.parseInt(s);
            i++;
            if (i == bulk) {
                pw.print(calc/i + " ");
                i = 0;
                calc = 0.0;
            }
        }
        pw.close();
        sc.close();
        return file2;
    }

    /**
     * Вывод в консоль результата суммы чисел из файла 2
     * @param file файл 2 - источник данных
     * @throws FileNotFoundException
     */
    public static void printResult(File file) throws FileNotFoundException {
        //Считывание файла
        Scanner sc = new Scanner(file);

        //Обработка
        String[] str = sc.nextLine().split(" ");
        double calc = 0.0;
        for (int i = 0; i < str.length; i++) {
            calc += Double.parseDouble(str[i]);
        }

        //Вывод результата
        System.out.println((int)calc);
    }
}
