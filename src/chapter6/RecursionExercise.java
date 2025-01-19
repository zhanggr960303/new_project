package chapter6;

public class RecursionExercise {

    public static void main(String [] args) {
        TEST mytest = new TEST();
        System.out.println(mytest.peach(8));
    }


}


class TEST {

    public int fibonacci (int n) {
        if( n == 1 || n == 2) {
            return 1;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public int peach(int day) {
        if(day == 10) {
            return 1;
        } else if(day >= 1 && day <= 9) {
            return (peach(day + 1) +1) * 2;
        }else {
            System.out.println("天数输入有误！");
            return -1;
        }
    }
}