package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File(String.format("files%sDay14.txt", File.separator));

        try {
            printSumDigits(file);
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        catch (CustomException e) {
            System.out.println("Некорректный файл");
        }
    }

    public static void printSumDigits(File file) throws FileNotFoundException, CustomException {
        Scanner scanner = new Scanner(file);

        if (!scanner.hasNextLine())
            return;

        String[] numsString = scanner.nextLine().split(";");

        if (numsString.length != 10) throw new CustomException();

        int sum = 0;
        for (int i = 0; i < numsString.length; i++) {
            sum += Integer.parseInt(numsString[i]);
        }
        System.out.println(sum);
    }
}
