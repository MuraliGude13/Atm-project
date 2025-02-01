package atmProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtmOperationImp implements Atminterface{

	Atm atm = new Atm();
	Map<Double, String> ministmt = new HashMap();
	public void viewBalance() {
		System.out.println("Available Balance: " + atm.getBalance());
		
	}
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount%500==0) {
			if(withdrawAmount<=atm.getBalance()) {
				System.out.println("collect the cash"+withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				ministmt.put(withdrawAmount,"Amount withdrawn");
				viewBalance();
			}
			else {
				System.out.println("Insuffficient Balance");
			}
		}
		else {
			System.out.println("Enter the amount in terms of 500");
		}
		
	}
	public void depositAmount(double depositAmount) {
		System.out.println("Deposited Amount is: "+ depositAmount);
		atm.setBalance(atm.getBalance()+ depositAmount);
		ministmt.put(depositAmount, "Deposited successful");
		viewBalance();
		
	}
	public void viewMiniStatement() {
		Set<Double> set= ministmt.keySet();
		for(Double d:set) {
			System.out.println(d+"="+ministmt.get(d));
		}
		
		
	}

}
