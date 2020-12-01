package day6;

/**
 * В классах Автомобиль и Мотоцикл реализовать два метода:
 * info​ () - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
 * yearDifference​ () - принимает на вход число (год), и возвращает разницу между
 * переданным годом и годом выпуска транспортного средства
 */
public class Task1 {
    public static void main(String[] args) {
        Car ff = new Car();
        ff.setModel("Focus");
        ff.setColor("Silver");
        ff.setYear(2007);
        Motorbike mb = new Motorbike(2007, "black", "bmw");

        ff.info();
        System.out.println(ff.yearDifference(2020));

        mb.info();
        System.out.println(mb.yearDifference(2019));
    }
}
