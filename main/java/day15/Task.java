package main.java.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        File fileIn = new File("src\\main\\resources\\shoes.csv");
        File fileOut = new File("src\\main\\resources\\missing_shoes.txt");
        try {
            check(fileIn, fileOut);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void check(File fileIn, File fileOut) throws FileNotFoundException {
        Scanner scannerIn = new Scanner(fileIn);
        PrintWriter pw = new PrintWriter(fileOut);
        String[] str;
        while (scannerIn.hasNextLine()) {
            str = scannerIn.nextLine().split(";");
            if (Integer.parseInt(str[2]) == 0) {
                pw.printf("%s, %s, %s\n", str[0], str[1], str[2]);
            }
        }

        scannerIn.close();
        pw.close();
    }
}
