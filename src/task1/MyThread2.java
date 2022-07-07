package src.task1;

public class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 50; i < 100; i++) {
            System.out.println("Value 2 = " + i);
        }
    }
}
