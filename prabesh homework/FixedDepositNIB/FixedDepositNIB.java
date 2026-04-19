import java.util.Scanner;

public class FixedDepositNIB
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        System.out.println(" NIB Bank FD Program ");

        System.out.print("how much rupees u want to put: ");
        double money=input.nextDouble();

        if(money<1000){
            System.out.println("min deposit is 1000 rupees");
            return;
        }

        System.out.print("duration in years (max 5): ");
        int years=input.nextInt();

        if(years<1 || years>5){
            System.out.println("year must be between 1 and 5");
            return;
        }

        int totalMonths=years*12;

        System.out.println("");
        System.out.println("below are results for rates 8 to 12");
        System.out.println("");

        double rate1=(8.0/100)/12;
        double a1=money;
        for(int k=1;k<=totalMonths;k++){
            a1=a1+(a1*rate1);
        }
        double charge1=a1*0.005;
        System.out.println("8%  -> matured: "+a1+" | fee: "+charge1+" | net: "+(a1-charge1));

        double rate2=(9.0/100)/12;
        double a2=money;
        for(int k=1;k<=totalMonths;k++){
            a2=a2+(a2*rate2);
        }
        double charge2=a2*0.005;
        System.out.println("9%  -> matured: "+a2+" | fee: "+charge2+" | net: "+(a2-charge2));

        double rate3=(10.0/100)/12;
        double a3=money;
        for(int k=1;k<=totalMonths;k++){
            a3=a3+(a3*rate3);
        }
        double charge3=a3*0.005;
        System.out.println("10% -> matured: "+a3+" | fee: "+charge3+" | net: "+(a3-charge3));

        double rate4=(11.0/100)/12;
        double a4=money;
        for(int k=1;k<=totalMonths;k++){
            a4=a4+(a4*rate4);
        }
        double charge4=a4*0.005;
        System.out.println("11% -> matured: "+a4+" | fee: "+charge4+" | net: "+(a4-charge4));

        double rate5=(12.0/100)/12;
        double a5=money;
        for(int k=1;k<=totalMonths;k++){
            a5=a5+(a5*rate5);
        }
        double charge5=a5*0.005;
        System.out.println("12% -> matured: "+a5+" | fee: "+charge5+" | net: "+(a5-charge5));

        System.out.println("");
        System.out.println("thank u for using nib");
    }
}
