package Multithreading.ProducerConsumer;

import java.util.Queue;

public class Producer implements Runnable{

    private String name;
    private Queue<Shirt> store;
    private int maxSizeOfStore;

    Producer(String name, Queue<Shirt> store, int maxSizeOfStore){
        this.name = name;
        this.store = store;
        this.maxSizeOfStore = maxSizeOfStore;
    }

    @Override
    public void run() {

        //while loop because producer can produce infinite  time
        while(true){
            synchronized (store){
                if(store.size() < maxSizeOfStore) {
                    System.out.println("Producer " + name + " is producing.Current store size is : " + store.size());
                    store.add(new Shirt());
                }
            }
        }
    }
}
