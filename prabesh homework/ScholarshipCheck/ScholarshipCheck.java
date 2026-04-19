import java.util.Scanner;

public class ScholarshipCheck
{
    public static void main(String[] args)
    {
        Scanner reader=new Scanner(System.in);

        System.out.print("type your gpa (0.0 to 4.0): ");
        double point=reader.nextDouble();

        //input validation
        if(point<0){
            System.out.println("gpa cannot be below zero");
            return;
        }
        if(point>4){
            System.out.println("gpa cannot be above 4");
            return;
        }

        //scholarship decide
        //3.8 and up = full
        //3.5 to 3.7 = half
        //3.0 to 3.4 = quarter
        //below 3.0 = none

        if(point>=3.8){
            System.out.println("amazing! FULL scholarship unlocked");
        }
        else if(point>=3.5){
            System.out.println("nice! 50 percent scholarship");
        }
        else if(point>=3.0){
            System.out.println("got 25 percent scholarship");
        }
        else{
            System.out.println("sorry not qualified for scholarship");
            System.out.println("minimum gpa needed is 3.0");
        }
    }
}
