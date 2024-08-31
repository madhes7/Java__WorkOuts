package day6;
import java.util.*;
class BankAccount
{
    void deposit(int amt)
    {
        System.out.println("Deposited"+amt);
    }
    void withdraw(int wid)
    {
        System.out.println("Your amount is taken "+wid);
    }
}
class Savingsaccount extends BankAccount
{
    void withdraw()
    {
        System.out.println("Minimum withdraw is 100");
    }
} 
class Account {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        long balance=10000;
        int a=sc.nextInt();
        Savingsaccount ba=new Savingsaccount();
        if(a<100)
        {
            ba.withdraw();
        }
        else{
        ba.withdraw(a);
	
	}}}


