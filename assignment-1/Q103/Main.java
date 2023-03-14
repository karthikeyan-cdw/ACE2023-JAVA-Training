package Q103;

// Program to demonstrate pass by value and pass by reference
public class Main {
    public static void changePrimitiveValue(int number) {
        number = 10;
    }

    public static void changeArrayValue(int[] arr) {
        arr[0] = 10;
    }

    public static void changeObjectValue(ClassReference classRef) {
        classRef.number = 20;
    }

    public static void main(String[] args) {
        int number = 0;
        System.out.println("Example for primitive type");
        System.out.println("Value Before Passing:" + number);
        changePrimitiveValue(number);
        System.out.println("Value After Passing:" + number);
        int[] arr = { 1, 2, 3 };
        System.out.println("\nExample for array type");
        System.out.println("Value Before Passing:" + arr[0]);
        changeArrayValue(arr);
        System.out.println("Value After Passing:" + arr[0]);
        ClassReference classRef = new ClassReference();
        System.out.println("\nExample for object type");
        System.out.println("Value Before Passing:" + classRef.number);
        changeObjectValue(classRef);
        System.out.println("Value After Passing:" + classRef.number);
    }
}

class ClassReference {
    int number = 10;
}
