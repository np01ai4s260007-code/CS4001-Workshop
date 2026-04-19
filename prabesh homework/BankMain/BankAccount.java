public class BankAccount
{
    String number;
    String customer;
    double money;
    public void deposit(double amt){
        money=money+amt;
        System.out.println("deposited "+amt);
        System.out.println("new balance rs "+money);
    }
    public void withdraw(double amt){
        if(amt>money){
            System.out.println("insufficient funds");
            System.out.println("you only have rs "+money);
        }
        else{
            money=money-amt;
            System.out.println("withdrew "+amt);
            System.out.println("new balance rs "+money);
        }
    }
    public void showBal(){
        System.out.println("Acc number : "+number);
        System.out.println("Acc holder : "+customer);
        System.out.println("Acc balance: rs "+money);
    }
}
