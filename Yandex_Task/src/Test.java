import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        BlackBox box1 = new BlackBox(4,5);
        BlackBox box2 = new BlackBox(4,5);


    System.out.println(box1.hashCode());
    System.out.println(box2.hashCode());


    }
}
class BlackBox {
    int varA;
    int varB;

    BlackBox(int varA, int varB){
        this.varA = varA;
        this.varB = varB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlackBox blackBox = (BlackBox) o;
        return varA == blackBox.varA && varB == blackBox.varB;
    }

    @Override
    public int hashCode() {
        return Objects.hash(varA, varB);
    }
}

