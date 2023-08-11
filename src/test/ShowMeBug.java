package test;

public class ShowMeBug {

    public static void main(String[] args) throws InterruptedException {
        final Counter c = new Counter();


        // Sample s = new Sapmle(1);
//        Semaphore semaphore = new Semaphore(1);


        Thread t1 = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    synchronized (Counter.class) {
                        c.wait();
                        c.set();
                        c.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        Thread t2 = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    synchronized (Counter.class) {
                        c.wait();
                        c.set();
                        c.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();

        Thread.sleep(1000);
        System.out.println(c.getI());
    }
}
