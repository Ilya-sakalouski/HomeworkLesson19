package src.task1;

public class MyThread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Value 1 = " + i);
        }
    }
}
