package DemoCaseStudy;
import java.util.Scanner;
public class CaseStudy4 {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter double value");
		
		double num1=input.nextDouble();
		System.out.println("Number of double type :"+num1);
		
		boolean bl=input.nextBoolean();
		System.out.println("Boolean type :"+bl);
		
		if(input.hasNext()) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		if(input.hasNextInt()) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		if(input.hasNextLine()) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
	}

}
