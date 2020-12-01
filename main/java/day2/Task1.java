package day2;

import java.util.Scanner;

/**
 * Задача 1
 * @author rilin
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Посчитайте кол-во этажей:");
        int floor = s.nextInt();

        if(floor < 1){
            System.out.println("Такой дом еще не построен!");
            return;
        }

        String houseType = (floor <= 4 ? "Малоэтажный дом" : (floor <= 8 ? "Среднеэтажный дом" : "Многоэтажный дом"));

        System.out.println(houseType);
    }
}
