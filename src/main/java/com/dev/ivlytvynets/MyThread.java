package com.dev.ivlytvynets;

import org.apache.log4j.Logger;

public class MyThread extends Thread {
    private static final int LIMIT = 100;
    private static final Logger logger = Logger.getLogger(MyThread.class);
    private Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getCounter() <= 100) {
            counter.increment();
            logger.info(Thread.currentThread().getName() + " value=" + counter.getCounter());
        }
    }
}
