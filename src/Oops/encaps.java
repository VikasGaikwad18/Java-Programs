package Oops;

public class encaps 
{
	private int balance=100;
	
	public int getbalance()
	{
		
		return balance;
	}
	
	int amount = 500;
	public void setBalance()
	{
		
		this.balance=balance+amount*2;
	}

}
class m extends encaps
{
	public static void main(String[] args) 
	{
		encaps e1 = new encaps();
		e1.getbalance();
		e1.setBalance();
		
	}
}
