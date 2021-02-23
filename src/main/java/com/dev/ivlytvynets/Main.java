package com.dev.ivlytvynets;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread runnableThread = new Thread(new MyRunnable(counter));
        MyThread thread = new MyThread(counter);
        runnableThread.start();
        thread.start();
    }
}
