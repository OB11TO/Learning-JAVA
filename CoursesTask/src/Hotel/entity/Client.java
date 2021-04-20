package Hotel.entity;

public class Client {
    private String firstName;
    private String lastName;
    private int number;

    public Client(String firstName, String lastName, int number, Bill bill) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.bill = bill;
    }

    private  Bill bill;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
