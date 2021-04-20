package Hotel.entity;

public class Bill {
    private int amount;

    public Bill(int sum) {
        this.amount = sum;
    }

    public int getSum() {
        return amount;
    }

    public void setSum(int sum) {
        this.amount = sum;
    }
}
