package Multithreading.MergeSort;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class client {
    public static void main(String[] args) throws Exception{
        List<Integer> data = List.of(5, 4, 3, 2, 1, 9, 6, 8, 7);


        /*
        List<Integer> sortedData = null;
        try {
            sortedData = mergeSorter.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
         */
        ExecutorService executorService = Executors.newCachedThreadPool();
        MergeSorter mergeSorter = new MergeSorter(data, executorService);
        Future<List<Integer>> sortedDataFuture = executorService.submit(mergeSorter);

        List<Integer> sortedData =  sortedDataFuture.get(); //Blocking cal --> thread waits until the results are ready.
        System.out.println("sorted Array: " + sortedData);
        executorService.shutdown();


    }
}
