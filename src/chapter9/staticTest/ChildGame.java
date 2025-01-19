package chapter9.staticTest;

public class ChildGame {
    public static void main(String[] args) {

        Child child_1 = new Child("张一");
        child_1.join();
        child_1.childNum++;

        Child child_2 = new Child("张二");
        child_2.join();
        child_2.childNum++;

        System.out.println(Child.childNum);

    }
}

class Child {
    private String name;

    public static int childNum;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(this.name + "加入了该游戏!");
    }
}