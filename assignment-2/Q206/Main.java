package Q206;

public class Main {
    public static void main(String[] args) {
        Derived derivedClass = new Derived();

    }
}

class Base {
    Base() throws ArithmeticException {
        throw new ArithmeticException();
    }
}

class Derived extends Base {
    Derived() {
        try {
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Catched ArithmeticException");
        }
    }
}