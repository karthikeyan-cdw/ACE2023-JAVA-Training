package Q201;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
         * An exception is threw but not handled and the method is not informed that an
         * exception will be thrown
         */
        throw new IOException();
    }
}
