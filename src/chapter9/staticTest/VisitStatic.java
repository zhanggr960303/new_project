package chapter9.staticTest;

public class VisitStatic {
    public static void main(String[] args) {
        System.out.println(A.name);
    }
}


class A {
    public static String name = "测试";
}