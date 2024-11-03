package Multithreading.ThreadPools;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args){

        ExecutorService executorService = Executors.newCachedThreadPool();

        //ExecutorService executorService = Executors.newFixedThreadPool(10);

        for(int i=1;i<=100;i++){
            if(i == 5 || i == 11 || i == 20){
                System.out.println("DEBUG");
            }

            PrintOneToHundred printOneToHundred = new PrintOneToHundred(i);
            executorService.submit(printOneToHundred);

            //  Thread thread = new Thread(printOneToHundred);
            //thread.start();
        }

        executorService.shutdown();
    }
}
