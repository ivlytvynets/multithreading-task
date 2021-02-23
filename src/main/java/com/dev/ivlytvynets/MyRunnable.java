package com.dev.ivlytvynets;

import org.apache.log4j.Logger;

public class MyRunnable implements Runnable {
    private static final int LIMIT = 100;
    private static final Logger logger = Logger.getLogger(MyRunnable.class);
    private Counter counter;

    public MyRunnable(Counter counter) {
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
