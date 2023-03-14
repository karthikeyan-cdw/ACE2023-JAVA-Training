package Q202;

class Sample {
    public void mth1() {
        mth2();
        System.out.println("caller");
    }

    public void mth2() {
        try {
            // Trying with statement throwing some exception
            // int number = 10 / 0;
            return;
        } catch (Exception exception) {
            // Statements to be excecuted if any exception occurs
            System.out.println("catch-mth2");
        } finally {
            // Statements which always be excecuted
            System.out.println("finally-mth2");
        }
    }

    public static void main(String p[]) {
        // Creating instance for Sample
        Sample s = new Sample();
        s.mth1();
    }
}
