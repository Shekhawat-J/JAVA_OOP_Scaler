package DesignPattern.Singleton;

public class DatabaseConnection {
    String url;
    String username;
    String password;
    private static DatabaseConnection instance = null;

    private DatabaseConnection(){

    }

    private DatabaseConnection(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public static DatabaseConnection createInstance() throws InterruptedException {
        Thread.sleep(10);
        if(instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
