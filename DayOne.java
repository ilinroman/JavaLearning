/**
 * День 1. Практика
 */
public class DayOne {
    public static void main(String[] args){
        Task1(10);
        Task2(10);
        Task3(10);
        Task4();
        Task5();
        Task6(9);
    }

    private static void Task6(int k) {
        System.out.println("Result of Task 6:");
        for(int i = 1; i <= 9; i++){
            System.out.println(i + " x " + k + " = " + i*k);
        }
    }

    private static void Task5() {
        System.out.println("Result of Task 5:");
        for(int year = 1980; year <= 2020; year += 4){
            System.out.println("Олимпиада " + year + " года");
        }
    }

    private static void Task4() {
        System.out.println("Result of Task 4:");
        int year = 1980;
        while(year <= 2020){
            System.out.println("Олимпиада " + year + " года");
            year += 4;
        }
    }

    private static void Task3(int cnt) {
        System.out.println("Result of Task 3:");
        for(int i = 0; i < cnt; i++) {
            System.out.println("JAVA");
        }
    }

    private static void Task2(int cnt) {
        System.out.println("Result of Task 2:");
        for(int i = 0; i < cnt; i++) {
            System.out.print("JAVA ");
        }
        System.out.println();
    }

    private static void Task1(int cnt) {
        System.out.println("Result of Task 1:");
        while((cnt--) > 0){
            System.out.print("JAVA ");
            //cnt--;
        }
        System.out.println();
    }

}
