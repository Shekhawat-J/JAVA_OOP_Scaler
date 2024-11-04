package OOP.Introduction;

public class Client {
    public static void main(String[] args){
        Student harsh = new Student();
        harsh.name = "Harsh";
        harsh.psp = 85;
        harsh.age = 24;
        harsh.batchName = "September 2024";


       Student vishal = new Student();
       vishal.age = 26;
       vishal.psp = 70.50;
       vishal.name = "Vishal";
       vishal.batchName = "NA";

        System.out.println(harsh);
        System.out.println(vishal);

        harsh.giveMockInterviews();
        vishal.giveMockInterviews();
    }
}
