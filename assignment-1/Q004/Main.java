package Q004;

class Singleton {
    private static Singleton singletonInstance = null;
    public String string = "Singleton Class";

    private Singleton() {
    }

    public static Singleton createInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }
}

class SynchronizedSingleton {
    private static SynchronizedSingleton singletonObj = null;

    private SynchronizedSingleton() {
        System.out.println("Singleton Created");
    }

    synchronized public static SynchronizedSingleton createInstance() {
        if (singletonObj == null) {
            singletonObj = new SynchronizedSingleton();
        }
        return singletonObj;
    }
}

public class Main {
    public static void main(String[] args) {
        Singleton singleton_1 = Singleton.createInstance();
        Singleton singleton_2 = Singleton.createInstance();
        Singleton singleton_3 = Singleton.createInstance();
        singleton_2.string = "Modified through singleton_2";
        System.out.println(singleton_1.string);
        System.out.println(singleton_2.string);
        System.out.println(singleton_3.string);
        singleton_3.string = "Modified through singleton_3";
        System.out.println(singleton_1.string);
        System.out.println(singleton_2.string);
        System.out.println(singleton_3.string);

        // ThreadProofSingleton
        new Thread(new Runnable() {
            @Override
            public void run() {
                SynchronizedSingleton.createInstance();

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                SynchronizedSingleton.createInstance();

            }
        }).start();
    }
}