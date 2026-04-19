import java.util.Scanner;

public class RickshawFare
{
    public static void main(String args[])
    {
        Scanner reader=new Scanner(System.in);

          System.out.println("** Rickshaw Fare System **");

          System.out.print("distance covered in km: ");
             double km=reader.nextDouble();

          System.out.print("trip time in minutes: ");
            double mins=reader.nextDouble();

          System.out.print("local passenger? (1=yes, 0=no): ");
            int local=reader.nextInt();

          System.out.print("night ride? (1=yes, 0=no): ");
            int night=reader.nextInt(); double fare=50+(km*30)+(mins*2);

          fare=(local==1)?(fare-(fare*0.1)):fare;

          fare=(night==1)?(fare+(fare*0.2)):fare;

            int total=(int)fare;

          System.out.println("");
          System.out.println("Total Fare = Rs. "+total);
    }
}
