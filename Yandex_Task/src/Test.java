public class Test {
    public void perform() {
        this.perform(1);
        System.out.print("1");
    }
    public void perform(int val) {
        System.out.print(val);
    }
    public static void main(String[] args) {
        Test c = new SomeClass2();
        c.perform(4);
    }
}
class SomeClass2 extends Test {
    public void perform() {
        super.perform();
        System.out.print("3");
    }
    public void perform(int val) {
        super.perform();
        System.out.print(val);
    }
}
