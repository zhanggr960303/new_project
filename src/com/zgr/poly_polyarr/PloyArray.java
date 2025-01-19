package com.zgr.poly_polyarr;

public class PloyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("adam", 18, 100);
        persons[2] = new Student("smith", 19, 30.1);
        persons[3] = new Teacher("scoot", 30, 20000);
        persons[4] = new Teacher("king", 50, 25000);

        "1132".equals("1243");
        for (int i = 0; i < persons.length; i++) {
            if(persons[i] instanceof Student) {
                ((Student)persons[i]).study();
            } else if(persons[i] instanceof Teacher) {
                ((Teacher)persons[i]).teach();
            } else {
                System.out.println(persons[i].say());
            }
        }

    }
}
