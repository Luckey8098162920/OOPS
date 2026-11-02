package oopss;

import java.util.Scanner;

public class Encapsulationmain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Encapsulation e1= new Encapsulation();
		 e1.getdetails("Lucky", 5000, 1234);
		 System.out.println("Enter PIN:");
	        int pin = sc.nextInt();
	        while(true) {
	        System.out.println("1. Check Balance");
	        System.out.println("2. Deposit");
	        System.out.println("3. Withdraw");
	        int choice=sc.nextInt();
	        switch(choice) {
	        case 1:
	        	System.out.println(e1.getbalance(pin));
	        	break;
	        	
	        case 2:
	        	System.out.println("enter the amount");
	        	e1.deposit(sc.nextDouble());
	        	   break;

	        case 3:

	            System.out.println("Enter amount:");
	            e1.withdraw(sc.nextDouble(), pin);
	            break;

	        default:

	            System.out.println("Invalid Choice");
	        }
	     
	        }
	        
	      
	}}


