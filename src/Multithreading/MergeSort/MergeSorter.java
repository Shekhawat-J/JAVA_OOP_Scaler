package Multithreading.MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    private List<Integer> array = new ArrayList<>();
    private ExecutorService executorService;

    public MergeSorter(List<Integer> array, ExecutorService executorService){
        this.array = array;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws  Exception{

        if(array.size() <= 1){
            return array;
        }
        int mid = array.size() / 2;

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for(int i=0;i<mid;i++){
            leftArray.add(array.get(i));
        }

        for(int i=mid;i<array.size();i++){
            rightArray.add(array.get(i));
        }

        MergeSorter leftMergeSorter = new MergeSorter(leftArray, executorService);
        MergeSorter rightMergeSorter = new MergeSorter(rightArray, executorService);

        //ExecutorService executorService = Executors.newCachedThreadPool();
        Future<List<Integer>> leftSortedArrayFuture =  executorService.submit(leftMergeSorter);
        Future<List<Integer>> rightSortedArrayFuture = executorService.submit(rightMergeSorter);

        List<Integer> leftSortedArray = leftSortedArrayFuture.get();
        List<Integer> rightSortedArray = rightSortedArrayFuture.get();

        //executorService.shutdown();

        //List<Integer> leftSortedArray = leftMergeSorter.call();
        //List<Integer> rightSortedArray = rightMergeSorter.call();

        return merge(leftSortedArray, rightSortedArray);
    }

    public List<Integer> merge(List<Integer> leftSortedArray, List<Integer> rightSortedArray) {
        int i = 0;
        int j = 0;
        List<Integer> mergedArray = new ArrayList<>();

        while(i < leftSortedArray.size() && j < rightSortedArray.size()) {
            if (leftSortedArray.get(i) <= rightSortedArray.get(j)) {
                mergedArray.add(leftSortedArray.get(i));
                i = i + 1;
            } else {
                mergedArray.add(rightSortedArray.get(j));
                j = j + 1;
            }
        }

        while(i < leftSortedArray.size()){
            mergedArray.add(leftSortedArray.get(i));
            i = i+ 1;
        }

        while(j < rightSortedArray.size()){
            mergedArray.add(rightSortedArray.get(j));
            j = j + 1;
        }
        return mergedArray;
    }
}
