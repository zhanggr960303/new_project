package chapter7.homework.homework13;

public class Teacher extends Person{

    private int work_age;

    public Teacher(String name, char gender, int age, int work_age) {
        super(name, gender, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void teach() {
        System.out.println("我承诺，我会认真教学");
    }

    @Override
    public String play() {
        return super.play() + "象棋";
    }

    public void printInfo() {
        System.out.println("老师信息:");
        System.out.print(super.basicInfo());
        System.out.println("工龄: " + work_age);
        this.teach();
        System.out.println(this.play());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "work_age=" + work_age +
                '}' + super.toString();
    }
}
