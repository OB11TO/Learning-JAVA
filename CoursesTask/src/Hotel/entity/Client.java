package Hotel.entity;

public class Client {
    private String firstName;
    private String lastName;
    private String  number;
    private Bill bill;

    public Client(String firstName, String lastName, String number, Bill bill) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.bill = bill;
    }

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
