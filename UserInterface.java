package atmProject;

import java.util.Scanner;

public class UserInterface {
	private static int status;
	public static void main(String[] args) {
		AtmOperationImp impl=new AtmOperationImp();
		Scanner sc= new Scanner(System.in);
		int atmnumber= 123456;
		int atmpin=123;
		System.out.println("Welcome to Murali's Atm machine");
		System.out.println("Enter ATM Number");
		int atmnum2=sc.nextInt();
		System.out.println("enter ATM PPin");
		int atmpin2= sc.nextInt();
		if(atmnumber==atmnum2 && atmpin ==atmpin2) {
			while(true) {
			System.out.println("1.view balance\n 2.Withdraw Amount\n 3.Deposit Amount\n 4.view mini statement\n 5.Exit");
			System.out.println("Enter choice");
			int ch = sc.nextInt();
			if(ch==1) {
				impl.viewBalance();
			}
			else if(ch==2) {
				System.out.println("Enter the Amount to withdraw");
				double withdrawamount=sc.nextDouble();
				impl.withdrawAmount(withdrawamount);
			}
			else if(ch==3) {
				System.out.println("Enter the Amount to deposit");
				double depositAmount = sc.nextDouble();
				impl.depositAmount(depositAmount);
			}
			else if(ch==4) {
				impl.viewMiniStatement();
			}
			else if(ch==5) {
				System.out.println("Collect your card\n Thank you!");
				System.exit(status);
			}
		}
		}
		else {
			System.out.println("Incorrect Atm number or pin");
		}

	}

}
