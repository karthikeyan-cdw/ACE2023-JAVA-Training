package Q005;

public class Main {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c);
    }
}

class A {
    A() {
        System.out.println("Constructor of A called");
    }
}

class B {
    B() {
        System.out.println("Constructor of B called");

    }
}

class C extends A {
    B b = new B();
}