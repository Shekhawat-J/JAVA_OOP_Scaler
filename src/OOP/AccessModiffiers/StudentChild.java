package OOP.AccessModiffiers;

public class StudentChild extends Student{
    public void testAccessModifier(){
        Student harsh = new Student();
        //harsh.name = "Harsh";
        harsh.psp = 85;
        harsh.age = 24;
        harsh.batchName = "September 2024";
    }
}
