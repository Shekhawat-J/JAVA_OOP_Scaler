package Multithreading.NumberPrinter;

public class PrintOneToHundred implements Runnable{

    private int num;
    private int priority;

    PrintOneToHundred(int num, int priority){
        this.num = num;
        this.priority = priority;
    }
    @Override
    public void run() {
        System.out.println("Count : " + num +" " + Thread.currentThread().getName() + " " + "Priority : " + priority);
    }
}
