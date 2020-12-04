package main.java.day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(721453727907L));
    }

    /**
     * Посчет кол-во цифр 7 во входном числе
     * @param num входное число
     * @return результат подсчета
     */
    public static int count7(long num) {
        if (num > 0)
            if (num % 10 == 7)
                return 1 + count7(num / 10);
            else
                return count7(num / 10);

        return 0;
    }
}
