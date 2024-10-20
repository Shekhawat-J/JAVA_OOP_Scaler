package Multithreading.AddreSubtractor;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter(0);

        Adder adder = new Adder(counter);
        Subtractor subtractor = new Subtractor(counter);

        Thread adderTherad = new Thread(adder);
        Thread subtractorThread = new Thread(subtractor);

        adderTherad.start();
        subtractorThread.start();

        adderTherad.join();
        subtractorThread.join();

        System.out.println("Counter value is : " + counter.getValue());

    }
}
