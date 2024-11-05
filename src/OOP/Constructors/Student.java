package OOP.Constructors;

public class Student {
    private String name;
    String batchName;
    protected int age;
    public double psp;

    public Student(){
        name = "Vishal";
    }

    public Student(String  newStudentName, int newStudentAge){
        name = newStudentName;
        age = newStudentAge;
    }

    public void changeBatch(String newBatchName){
        batchName = newBatchName;
    }
    private void giveMockInterviews(){
        System.out.println(name + " is giving Mock Interview");
    }
}
