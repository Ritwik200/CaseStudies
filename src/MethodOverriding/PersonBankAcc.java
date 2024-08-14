package MethodOverriding;

public class PersonBankAcc extends SBI_bank {
	
	public void Vehicle_Loan() {
		System.out.println("SBI Vehicle loan taken by person");
	}
	public void Creditcard_Loan() {
		System.out.println("SBI creditcard loan taken by person");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonBankAcc ob = new PersonBankAcc();
		ob.Vehicle_Loan();
		ob.Creditcard_Loan();
		
		SBI_bank ob1 = new SBI_bank();
		ob1.Vehicle_Loan();
		ob1.Creditcard_Loan();
		
		SBI_bank ob2 = new PersonBankAcc();
		ob2.Vehicle_Loan();
		ob2.Home_Loan();
		
	}

}
