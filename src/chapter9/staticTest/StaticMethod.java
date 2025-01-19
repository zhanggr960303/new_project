package chapter9.staticTest;

public class StaticMethod {
    public static void main(String[] args) {
        Student tom = new Student("tom");
        tom.payFee(100);

        Student mary = new Student("mary");
        mary.payFee(200);

        Student.showFee();

    }

}


class Student {
    private String name;
    private static double fee = 0;

    public Student(String name) {
        this.name = name;
    }

    public static void payFee(double fee) {
        Student.fee += fee;
    }

    public static void showFee() {
        System.out.println("总学费有:" + Student.fee );
    }
}