package chapter7.homework;

public class HomeWork01 {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("jack", 10, "JavaEE工程师");
        persons[1] = new Person("tom", 50, "大数据工程师");
        persons[2] = new Person("mary", 30, "PHP工程师");

        for(int i = 0; i < persons.length - 1; i++ ) {
            for(int j = 0; j < persons.length - i - 1; j++ ) {
                if(persons[i].getAge() < persons[i + 1].getAge() ) {
                    Person temp = persons[i];
                    persons[i] = persons[i + 1];
                    persons[i + 1] = temp;
                }
            }
        }

        for(Person person : persons) {
            System.out.println(person.toString());
        }
    }


}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name = " + name + "\'" +
                ", age = " + age + "\'" +
                ", job = " + job + "\'" +
                "}";
    }
}