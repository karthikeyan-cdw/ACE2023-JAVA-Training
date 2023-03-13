package Q006;

import java.util.Scanner;

class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    String getName() {
        return this.name;
    }
}

class Exam extends Student {
    int maths;
    int physics;
    int chemistry;

    Exam(String name, int rollNo) {
        super(name, rollNo);
    }

    public void setMarks(int maths, int physics, int chemistry) {
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;
    }
}

class Result extends Exam {
    int totalMark;

    Result(String name, int rollNo) {
        super(name, rollNo);
    }

    public int calculateTotalMark() {
        return this.maths + this.physics + this.chemistry;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Student Name:");
        String studentName = scanner.nextLine();
        System.out.println("Enter the Roll Number:");
        int rollNo = scanner.nextInt();
        Result result = new Result(studentName, rollNo);
        System.out.println("Enter the Maths mark:");
        int mathsMark = scanner.nextInt();
        System.out.println("Enter the Physics mark:");
        int physicsMark = scanner.nextInt();
        System.out.println("Enter the Chemistry mark:");
        int chemistryMark = scanner.nextInt();
        result.setMarks(mathsMark, physicsMark, chemistryMark);
        System.out.printf("The result of the student %s is %d", result.getName(), result.calculateTotalMark());
        scanner.close();
    }
}
