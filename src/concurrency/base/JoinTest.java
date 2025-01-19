package concurrency.base;

public class JoinTest {

    public static void main(String[] args) throws InterruptedException {

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch ( InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("child threadA is over");
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch ( InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("child threadB is over");
            }
        });

        threadA.start();
        threadB.start();

        System.out.println("wait all child thread over");

        threadA.join();
        threadB.join();

        System.out.println("all child thread is over");
        System.out.println("main is over");
    }
}
