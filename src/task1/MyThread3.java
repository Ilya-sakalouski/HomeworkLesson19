package src.task1;

public class MyThread3 implements Runnable {
    @Override
    public void run() {
        for (int i = 100; i < 150; i++) {
            System.out.println("Value 3 = " + i);
        }
    }
}
