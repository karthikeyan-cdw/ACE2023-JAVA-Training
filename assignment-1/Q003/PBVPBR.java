package Q003;

public class PBVPBR {
    public static void newMethodForPrimitive(int number) {
        number=10;
    }
    public static void newMethodForArray(int []arr) {
        arr[0]=10;
    }
    public static void newMethodForObject(NewClass newClass) {
        newClass.a=20;
    }
    public static void main(String[] args) {
        int number=0;
        System.out.println("Value Before Passing:" + number);
        newMethodForPrimitive(number);
        System.out.println("Value After Passing:" + number);
        int []arr={1,2,3};
        System.out.println("Value Before Passing:" + arr[0]);
        newMethodForArray(arr);
        System.out.println("Value After Passing:" + arr[0]);
        NewClass newclass = new NewClass();
        System.out.println("Value Before Passing:" + newclass.a);
        newMethodForObject(newclass);
        System.out.println("Value After Passing:" + newclass.a);
    }
}
class NewClass{
    int a=10;
    public static void main(String[] args) {
        System.out.println("New Class");
    }
}