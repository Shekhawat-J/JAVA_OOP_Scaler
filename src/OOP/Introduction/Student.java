package OOP.Introduction;



public class Student {
    String name;
    String batchName;
    double psp;
    int age;

    void changeBatch(String newBatchName){
        batchName = newBatchName;
    }

    void giveMockInterviews(){
        System.out.println(name + " Giving Mock Interviews");
    }
}
