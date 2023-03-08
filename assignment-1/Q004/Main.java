package Q004;

class Singleton {
    private static Singleton singletonInstance = null;
    public String string = "Singleton Class";

    private Singleton() {
    }

    public static Singleton Singleton() {
        if (singletonInstance == null) {
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }
}

public class Main {
    public static void main(String[] args) {
        Singleton singleton_1 = Singleton.Singleton();
        Singleton singleton_2 = Singleton.Singleton();
        Singleton singleton_3 = Singleton.Singleton();
        singleton_2.string = "Modified through singleton_2";
        System.out.println(singleton_1.string);
        System.out.println(singleton_2.string);
        System.out.println(singleton_3.string);
        singleton_3.string = "Modified through singleton_3";
        System.out.println(singleton_1.string);
        System.out.println(singleton_2.string);
        System.out.println(singleton_3.string);
    }
}