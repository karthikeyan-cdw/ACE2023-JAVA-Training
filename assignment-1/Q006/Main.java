package Q006;
class Student {
    String name;
    int rollNo;
    Student(String name, int rollNo){
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
    Exam(String name, int rollNo){
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
        Result result = new Result("ABC", 123);
        result.setMarks(98,99,100);
        System.out.printf("The result of the student %s is %d", result.getName(), result.calculateTotalMark());
    }
}
