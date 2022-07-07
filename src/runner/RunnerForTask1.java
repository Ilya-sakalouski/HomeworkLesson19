package src.runner;

import src.task1.MyThread1;
import src.task1.MyThread2;
import src.task1.MyThread3;

public class RunnerForTask1 {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new MyThread1());
        Thread thread2 = new Thread(new MyThread2());
        Thread thread3 = new Thread(new MyThread3());

        thread3.start();
        thread3.join();
        thread2.start();
        thread2.join();
        thread1.start();
        thread1.join();
    }
}
