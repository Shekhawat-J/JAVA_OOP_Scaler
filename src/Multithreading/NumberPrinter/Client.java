package Multithreading.NumberPrinter;

public class Client {

    public static void main(String[] args){

        for(int i=0;i<100;i++){
            int priority = (i % 5) + 1;
            // we can have priority from 1 to 5

            PrintOneToHundred printOneToHundred = new PrintOneToHundred(i, priority);
            Thread thread = new Thread(printOneToHundred);
            thread.setPriority(priority);
            thread.start();
        }
    }
}
