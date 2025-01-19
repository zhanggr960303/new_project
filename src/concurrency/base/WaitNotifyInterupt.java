package concurrency.base;

public class WaitNotifyInterupt {
    static Object object = new Object();

    public static void main(String[] args) throws InterruptedException {

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("-----begin-----");

                    synchronized (object) {
                        object.wait();
                    }

                    System.out.println("-----end-----");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        threadA.start();

        Thread.sleep(1000);

        System.out.println("-----begin interrupt threadA-----");
        threadA.interrupt();
        System.out.println("-----end interrupt threadA-----");
    }

}
