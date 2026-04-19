import java.util.Scanner;

public class DiscountSwitch
{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);

        System.out.print("give the marked price: ");
        float price=reader.nextFloat();

        System.out.print("category of item (A/B/C/D): ");
        char type=reader.next().charAt(0);

        float finalPrice=0;
        int flag=1;

        switch(type){
            case 'A':
            case 'a':
                finalPrice=price-((price*60)/100);
                System.out.println("->> 60 percent discount applied");
                break;

            case 'B':
            case 'b':
                finalPrice=price-((price*40)/100);
                System.out.println("->> 40 percent discount applied");
                break;

            case 'C':
            case 'c':
                finalPrice=price-((price*20)/100);
                System.out.println("->> 20 percent discount applied");
                break;

            case 'D':
            case 'd':
                finalPrice=price-((price*10)/100);
                System.out.println("->> 10 percent discount applied");
                break;

            default:
                flag=0;
                System.out.println("invalid category entered");
        }

        if(flag==1){
            System.out.println("MP was  = Rs. "+price);
            System.out.println("SP now  = Rs. "+finalPrice);
        }
        else{
            System.out.println("no discount calc possible");
        }
    }
}
