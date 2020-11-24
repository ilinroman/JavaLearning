package Day11;

class Warehouse {
    private int countOrder; //количество собранных заказов
    private int balance; //доход от доставленных заказов

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder += countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance += balance;
    }
}
