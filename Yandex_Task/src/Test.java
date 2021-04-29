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
    private boolean booleanValue = true;
    private char charValue = 'd';
    private String stringValue = "TestClass";
    private long longValue = 34829245849498300l;
    private float floatValue = 345832400.93f;
    private double doubleValue = 98584292348454.9834;
    private byte[] arrayValue = {1, 2, 3};

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
        int result = 17;

        result = 37 * result + ( booleanValue ? 1 : 0 );
        result = 37 * result + (int) charValue;
        result = 37 * result + (stringValue == null ? 0 : stringValue.hashCode());
        result = 37 * result + (int)(longValue - (longValue >>> 32));
        result = 37 * result + Float.floatToIntBits(floatValue);
        long longBits = Double.doubleToLongBits(doubleValue);
        result = 37 * result + (int)(longBits - (longBits >>> 32));
        for( byte b : arrayValue )
            result = 37 * result + (int) b;

        return result;
    }
}

