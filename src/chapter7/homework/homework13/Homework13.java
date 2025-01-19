package chapter7.homework.homework13;

public class Homework13 {
    public static void main(String[] args) {

        Student student = new Student("小明", '男', 15, "00023102");
        Teacher teacher = new Teacher("张飞", '男', 30, 5);

        student.printInfo();
        System.out.println("------------------------------");
        teacher.printInfo();

        Person[] person = new Person[4];
        person[0] = new Student("jack", '男', 10, "0001");
        person[1] = new Student("mary", '女', 20, "0002");
        person[2] = new Teacher("smith", '男', 36, 5);
        person[3] = new Teacher("scott", '男', 26, 1);

        bubbleSort(person);
        for(Person itemPerson : person) {
            System.out.println("------------------------------");
            System.out.println(itemPerson.toString());
        }

        Person person1 = new Student("小明", '男', 15, "00023102");
    }

    public static void bubbleSort(Person[] person) {
        Person temp = null;
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - 1 - i; j++) {
                if (person[j].getAge() < person[j + 1].getAge()) {
                    temp = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = temp;
                }
            }
        }
    }

    public void test(Person person) {
        if(person instanceof Student) {
            Student student = (Student) person;
            student.study();
        } else if(person instanceof Teacher) {
            Teacher teacher = (Teacher) person;
            teacher.teach();
        } else {
            System.out.println("对象类型有误！");
        }
    }

}
