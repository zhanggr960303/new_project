package concurrency.base;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest {
    //1.继承Thread类，重写run方法
    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("I am a child thread for succeed!");
        }
    }

    //2.实现Runable接口,实现run方法;
    //创建任务类后作为参数初始化Thread对象
    public static class RunableTest implements Runnable {
        @Override
        public void run() {
            System.out.println("I am a child thread for implements!");
        }
    }

    //3.使用FutureTask方式
    //任务类实现Callable接口，将其作为FutureTask的构造参数进行初始化

    public static class CallTask implements Callable <String> {
        @Override
        public String call() throws Exception {
            return "I am a child thread for callable!";
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //1.继承
        MyThread myThread = new MyThread();
        myThread.start();

        //2.实现Runable
        RunableTest runableTest = new RunableTest();
        Thread thread = new Thread(runableTest);
        thread.start();

        //3.利用FutureTask
        FutureTask <String> futureTask = new FutureTask<String>(new CallTask());
        Thread threadForCall = new Thread(futureTask);
        threadForCall.start();

        try {
            String result = futureTask.get();
            System.out.println(result);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}