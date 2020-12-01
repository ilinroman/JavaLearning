package Day11;

public class Picker implements Worker {
    private static final int RATE = 80;

    private int salary;
    Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += RATE;
        warehouse.setCountOrder(1);
    }

    @Override
    public void bonus() {
        salary *= 3;
    }

    public Picker(Warehouse warehouse) {
        this.salary = 0;
        this.warehouse = warehouse;
    }
}
