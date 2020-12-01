package Day11;

public class Task {
    public static void main(String[] args) {
        //Кейс 1
        Warehouse wh = new Warehouse();
        Picker p1 = new Picker(wh);
        Courier c1 = new Courier(wh);

        //Работает сборщик
        for (int i = 0; i < 1501; i++) {
            p1.doWork();
            if(wh.getCountOrder() == 1500){
                System.out.printf("Достигнуто кол-во заказов: %d. Бонус сборщику: %d => ", wh.getCountOrder(), p1.getSalary());
                p1.bonus();
                System.out.printf("%d\n", p1.getSalary());
            }
        }
        System.out.printf("Кол-во заказов на складе: %d. Текущая ЗП сборщика: %d\n", wh.getCountOrder(), p1.getSalary());

        System.out.println("- - - - -");

        //Работает курьер
        for (int j = 0; j < 1500; j++) {
            c1.doWork();
            if(wh.getBalance() == 1000000){
                System.out.printf("Склад заработал %d. Бонус курьеру: %d => ", wh.getBalance(), c1.getSalary());
                c1.bonus();
                System.out.printf("%d\n", c1.getSalary());
            }
        }
        System.out.printf("Склад заработал: %d. Текущая ЗП курьера: %d\n", wh.getBalance(), c1.getSalary());

        System.out.println("- - - - -");

        //Кейс 2
        Warehouse wh2 = new Warehouse();
        Picker p2 = new Picker(wh2);
        Courier c2 = new Courier(wh2);
        p2.doWork();
        c2.doWork();
        System.out.printf("Кол-во заказов на складе 2: %d. Текущая ЗП сборщика 2: %d\n", wh2.getCountOrder(), p2.getSalary());
        System.out.printf("Склад 2 заработал: %d. Текущая ЗП курьера 2: %d\n", wh2.getBalance(), c2.getSalary());
        System.out.printf("Кол-во заказов на складе: %d. Текущая ЗП сборщика: %d\n", wh.getCountOrder(), p1.getSalary());
        System.out.printf("Склад заработал: %d. Текущая ЗП курьера: %d\n", wh.getBalance(), c1.getSalary());
    }
}
