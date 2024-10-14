package Multithreading.HelloPrinter;

public class Client {
    public static void main(String[] args){

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        helloWorldPrinter.run();
        Thread thread = new Thread(helloWorldPrinter);
        thread.start();
        thread.run();




    }
}
