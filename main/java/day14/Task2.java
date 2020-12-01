package main.java.day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try {
            System.out.println(parseFileToStringList());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (CustomException e) {
            System.out.println("Некорректный файл");
        }
    }

    public static List<String> parseFileToStringList() throws FileNotFoundException, CustomException {
        File file = new File(String.format("files%speople.txt", File.separator));
        Scanner scanner = new Scanner(file);

        if (!scanner.hasNextLine())
            throw new CustomException();

        List<String> str = new ArrayList<>();
        do {
            str.add(scanner.nextLine());
        } while (scanner.hasNextLine());

        scanner.close();

        return str;
    }
}
