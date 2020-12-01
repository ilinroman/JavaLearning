package Day11;

public class Courier implements Worker {
    private static final int RATE = 100;

    private int salary;
    Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += RATE;
        warehouse.setBalance(1000);
    }

    @Override
    public void bonus() {
        salary *= 2;
    }

    public Courier(Warehouse warehouse) {
        this.salary = 0;
        this.warehouse = warehouse;
    }
}
