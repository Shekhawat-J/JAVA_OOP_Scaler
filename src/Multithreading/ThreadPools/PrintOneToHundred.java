package Multithreading.ThreadPools;

public class PrintOneToHundred implements Runnable{

    private int num;

    PrintOneToHundred(int num){
        this.num = num;
    }
    @Override
    public void run() {
        System.out.println("Count : " + num +" " + Thread.currentThread().getName());
    }
}
