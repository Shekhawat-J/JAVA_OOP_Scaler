package DesignPattern.Singleton.Multithreaded;

public class DatabaseConnectionWithEagerLoading {
    String url;
    String username;
    String password;
    private static DatabaseConnectionWithEagerLoading instance = new DatabaseConnectionWithEagerLoading();

    private DatabaseConnectionWithEagerLoading(){

    }

    private DatabaseConnectionWithEagerLoading(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public static DatabaseConnectionWithEagerLoading createInstance() throws InterruptedException {
        //Thread.sleep(10);
        return instance;
    }
}


