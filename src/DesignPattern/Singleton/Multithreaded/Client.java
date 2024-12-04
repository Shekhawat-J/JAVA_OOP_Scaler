package DesignPattern.Singleton.Multithreaded;



import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        //Set<DatabaseConnectionWithEagerLoading> databaseConnectionWithEagerLoadings = new HashSet<>();
        // HashSet<>() collection is not the Thread safe so we use CopyOnWriteArraySet<>() that is thread safe.

        Set<DatabaseConnectionWithEagerLoading> databaseConnectionWithEagerLoadings = new CopyOnWriteArraySet<>();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i=0;i<1000;i++){
            executorService.submit(() -> databaseConnectionWithEagerLoadings.add(DatabaseConnectionWithEagerLoading.createInstance()));
        }

        //Thread.sleep(3000);
        executorService.shutdown();
        System.out.println("Size of Database Connections: " + databaseConnectionWithEagerLoadings.size());

    }
}

