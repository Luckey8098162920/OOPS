package oopss;

public class Encapsulation {

	private String accoutholder;
	private double balance;
	private int pin;
	
	
	

  public Encapsulation() {
		super();
	}
  public  void getdetails(String accoutholder, double balance, int pin) {
		this.accoutholder = accoutholder;
		this.balance = balance;
		this.pin = pin;
	}
  public double getbalance(int enterdpin) {
	if(pin == enterdpin) {
		return balance;
	}
	System.out.println("invalid");
	return -1;
}
  public void deposit(double amount) {
	  if(amount>0) {
		  balance=balance+amount;
		  System.out.println("deposite succes");
	  }
	  
  }
  public void withdraw(double amount,int  enterdpin) {
	  if(enterdpin==pin && amount>0 && amount<=balance) {
		  balance=balance-amount;
		  System.out.println("witrdraw sucess");
	  }else
		  System.out.println("invalid");
  }
  
}