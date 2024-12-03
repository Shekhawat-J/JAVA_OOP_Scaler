package DesignPattern.Singleton;

public class Client {
    public static void main(String[] args) {

        DatabaseConnection databaseConnection1 = DatabaseConnection.createInstance();
        DatabaseConnection databaseConnection2 = DatabaseConnection.createInstance();

        if(databaseConnection1 == databaseConnection2){
            System.out.println("Objects are same");
        }
        else{
            System.out.println("Objects are different");
        }

        System.out.println("Address: " + databaseConnection1 + ", "+ databaseConnection2);
    }
}
