package com.seed;

public class Account {
double balance;

public Account(double balance) {
	
	this.balance = balance;
}

public void withdraw(double amount)throws LessbalException
{
if(amount>balance)
{
	throw new LessbalException();
}
	balance =balance-amount;
System.out.println("Remaining balance"+balance);
}
public static void main(String[] args) {
	Account a =new Account(10000);
	try{
		a.withdraw(12000);
		
	}
catch (LessbalException e){
	System.out.println("Not enough balance");
}
}


}