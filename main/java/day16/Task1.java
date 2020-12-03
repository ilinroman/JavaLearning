package main.java.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File(String.format("files%sDay14.txt", File.separator));
        try {
            printResult(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        String[] str = sc.nextLine().split(" ");
        Double sum = 0.0;
        int i = 0;
        for (String s: str) {
            sum += Integer.parseInt(s);
            i++;
        }
        sum = sum/i;
        System.out.printf("%s --> %.3f", sum, sum);
    }
}
