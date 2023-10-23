import java.util.*;
class BankAccount{
    int accno;
    String name;
    int balance;
    final int minBalance=100;
    private boolean checkMinBalance(int amount){
        if(balance-amount<=minBalance){
            return false;
        }
        else{
            return true;
        }
    }
    public BankAccount(int a,String n, int b){
        this.accno=a;
        this.name=n;
        this.balance=b;
    }
    public void balance(){
        System.out.println(balance);
    }
    public void deposit(int amount){
        balance=balance+amount; 
    }
    public void withdraw(int amount){
        if(checkMinBalance(amount)){
            balance=balance-amount;
        }
        else{
            System.out.println("Transaction failed");
        }
    }
}
public class AccountCheck{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int amnt=sc.nextInt();
        int amnt1=sc.nextInt();
        BankAccount b=new BankAccount(1890,"Rahul",1000);
        b.deposit(amnt);
        b.balance();
        b.withdraw(amnt1);
        b.balance();
        sc.close();
        

    }
}
