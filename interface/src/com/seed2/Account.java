package com.seed2;

public class Account {

	
	private double accountId,balance;
	private String accountName;
	public Account(double accountId, double balance, String accountName) {
		this.accountId = accountId;
		this.balance = balance;
		this.accountName = accountName;
	}
	
class Locker
{
	private int lockerid;
	
	public void show()
	{
		System.out.println("account id "+accountId+" balance= "+balance+" accountName "+accountName);
	    System.out.println("LockerId"+lockerid);
	}

	public Locker(int lockerid) {
		
		this.lockerid = lockerid;
	}
}

}
