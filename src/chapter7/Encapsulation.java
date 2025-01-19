package chapter7;

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person("jackqwer", 999, 1200.0);
        System.out.println(person.info());
        person.setName("jack");
        person.setAge(20);
        person.setSalary(1200.0);
        System.out.println(person.info());
    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    public Person() {

    }

    ;

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        setName(name);
        setSalary(salary);
        setAge(age);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字设置不合理！");
            this.name = "张伟";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄设置不合理！");
            this.age = 18;
        }

    }

    public double getSalary() {
        //可以增加对当前对象的权限判断
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "信息为: name = " + name + " age = " + age + " salary = " + salary;
    }
}