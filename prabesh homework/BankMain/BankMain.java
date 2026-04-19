public class BankMain
{
    public static void main(String[] args)
    {
        BankAccount x=new BankAccount();
         x.number="BOA101";
         x.customer="Hari Prasad";
         x.money=7500;
        
        BankAccount y=new BankAccount();
         y.number="BOA102";
         y.customer="Gita Kumari";
         y.money=12000;

        System.out.println(">> acc 1 details");
         x.showBal();

        System.out.println("");

        System.out.println(">> acc 2 details");
         y.showBal();

        System.out.println("");
        
        System.out.println(">> transactions on acc 1");
         x.deposit(3000);
         x.withdraw(1500);

        System.out.println("");

        System.out.println(">> transactions on acc 2");
         y.deposit(4000);
         y.withdraw(2500);

        System.out.println("");
        System.out.println("## FINAL BALANCE ##");
         x.showBal();
        System.out.println("");
         y.showBal();
    }
}
