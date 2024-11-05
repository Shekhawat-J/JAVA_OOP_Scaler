package OOP.AccessModiffiers;

public class Student {
    private String name;
    String batchName;
    protected int age;
    public double psp;

    public void changeBatch(String newBatchName){
        batchName = newBatchName;
    }

    private void giveMockInterviews(){
        System.out.println(name + " is giving Mock Interview");
    }
}
