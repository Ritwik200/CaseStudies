package DemoCaseStudy;

//start accele spped stop


class Drive {
	int totalspeed=0;
	public Drive(int speed) {
		totalspeed = speed;
	}
	void start(int initialspeed) {
		totalspeed = initialspeed; 
	}
	void accelerate(int morefast) {
		totalspeed =totalspeed + morefast;
	}
	void showSpeed() {
		System.out.println("speed of vehicle is :"+totalspeed);
	}
	void stop() {
		System.out.println("Car is stopped");
		totalspeed = 0;
	}
}


public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drive ob = new Drive(12); //current speed is 12
		ob.accelerate(10);
		ob.showSpeed();
		ob.stop();
		ob.showSpeed();
		
	}

}
