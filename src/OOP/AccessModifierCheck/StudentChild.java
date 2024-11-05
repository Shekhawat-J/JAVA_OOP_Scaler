package OOP.AccessModifierCheck;

import OOP.AccessModiffiers.Student;

public class StudentChild extends Student {
    public void testAccessModifier(){
        Student harsh = new Student();
        //harsh.name = "Harsh";
        harsh.psp = 85;
        //harsh.age = 24;
        //harsh.batchName = "September 2024";

        //this.name = "Harsh";
        this.psp = 85;
        this.age = 24;
        //this.batchName = "September 2024";

        StudentChild harshChild = (StudentChild) new Student();
        //harshChild.name = "Harsh";
        harshChild.psp = 85;
        harshChild.age = 24;
        //harshChild.batchName = "September 2024";

    }
}
