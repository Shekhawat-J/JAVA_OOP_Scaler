package Multithreading.AddreSubtractor.synchronization;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{

    private Counter counter;

    public Adder(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i=1;i<=1000;i++){
            counter.incrementValue(i);
            /*
            synchronized (counter) {
                counter.setValue(counter.getValue() + i);
            }

             */
        }

    }
}