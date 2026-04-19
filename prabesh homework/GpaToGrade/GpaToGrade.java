import java.util.Scanner;

public class GpaToGrade
{
    public static void main(String[] args)
    {
        Scanner reader=new Scanner(System.in);

        System.out.println("-- Grade Finder --");
        System.out.print("type ur gpa: ");

        double gpa=reader.nextDouble();

        //shift decimal out
        int val=(int)(gpa*10);

        String result="unknown";

        if(val<0){
            result="invalid entry";
        }

        if(val>40){
            result="invalid entry";
        }

        if(val>=0 && val<=11){
            result="F (failed)";
        }

        if(val>=12 && val<=15){
            result="D";
        }

        if(val>=16 && val<=19){
            result="D+";
        }

        if(val>=20 && val<=23){
            result="C";
        }

        if(val>=24 && val<=27){
            result="C+";
        }

        if(val>=28 && val<=31){
            result="B";
        }

        if(val>=32 && val<=35){
            result="B+";
        }

        if(val>=36 && val<=40){
            result="A";
        }

        System.out.println("----------");
        System.out.println("Your GPA   : "+gpa);
        System.out.println("Your Grade : "+result);
        System.out.println("----------");
    }
}
