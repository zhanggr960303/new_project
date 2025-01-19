package com.zgr.modifier;

public class B {
    //同一个包内不能访问private
    public void say() {
        A a = new A();
        System.out.println("n1=" + a.num1 + " n2=" + a.num2 + " n3=" + a.num3 );

    }
}
