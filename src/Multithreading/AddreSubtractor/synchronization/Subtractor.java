package Multithreading.AddreSubtractor.synchronization;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {
    private Counter counter;


    public Subtractor(Counter counter) {
        this.counter = counter;

    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            counter.decrementValue(i);
            /*
            synchronized (counter) {
                counter.setValue(counter.getValue() - i);
            }
             */
        }
    }
}
