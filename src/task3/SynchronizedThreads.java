package src.task3;

public class SynchronizedThreads {
    private static int counter;

    public static void test() {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    counter = 0;
                    for (int i = 0; i < 10; i++) {
                        counter++;
                        System.out.println(Thread.currentThread().getName() + ": " + counter);
                    }
                }
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

    /*         Не обязательно:
        try {
            thread1.join();
           thread2.join();
       } catch (InterruptedException e) {
            e.printStackTrace();
        }
    */
    }
}
