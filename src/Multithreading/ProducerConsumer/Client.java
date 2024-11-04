package Multithreading.ProducerConsumer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Client {
    public static void main(String[] args){
        Queue<Shirt> queue = new ConcurrentLinkedQueue<>();
        int maxSizeOfStore = 6;

        Producer p1 = new Producer("P1", queue, maxSizeOfStore);
        Producer p2 = new Producer("P2", queue, maxSizeOfStore);
        Producer p3 = new Producer("P3", queue, maxSizeOfStore);

        Consumer c1 = new Consumer("C1", queue);
        Consumer c2 = new Consumer("C2", queue);
        Consumer c3 = new Consumer("C3", queue);
        Consumer c4 = new Consumer("C4", queue);
        Consumer c5 = new Consumer("C5", queue);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        Thread t4 = new Thread(c1);
        Thread t5 = new Thread(c2);
        Thread t6 = new Thread(c3);
        Thread t7 = new Thread(c4);
        Thread t8 = new Thread(c5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
    }
}
