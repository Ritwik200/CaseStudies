package MethodOverriding;

public class RentedByUser extends CarTravel{     //child class
	
	public void Location() {
		System.out.println("User current location is hydbd");
	}
	public void StartToEnd() {
		System.out.println("User entered start to end location");
	}
	public void payment() {
		System.out.println("payment successful");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RentedByUser ob = new RentedByUser();
		ob.Location();
		ob.StartToEnd();
		
		CarTravel ob1 = new CarTravel();
		ob1.Location();
		ob1.StartToEnd();
		ob1.BookedCar();
		
		CarTravel ob2 = new CarTravel();
		ob2.Location();
		ob2.Location();

	}

}
