package Multithreading.AddreSubtractor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter(0);
        Lock lock = new ReentrantLock();

        Adder adder = new Adder(counter, lock);
        Subtractor subtractor = new Subtractor(counter, lock);

        Thread adderTherad = new Thread(adder);
        Thread subtractorThread = new Thread(subtractor);

        adderTherad.start();
        subtractorThread.start();

        adderTherad.join();
        subtractorThread.join();

        System.out.println("Counter value is : " + counter.getValue());

    }
}
