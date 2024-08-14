package DemoCaseStudy;
import java.util.Scanner;
public class CaseStudy1 {   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		
		if((num1 > num2) && (num1 > num3)) {
			System.out.println("Largest number is "+num1);
		} else if((num1 < num2) && (num2 < num3)) {
			System.out.println("Largest number is "+num3);
		} else if((num1 < num2) && (num1 > num3)) {
			System.out.println("Largest number is "+num2);
		} else {
			System.out.println("All three numbers are not unique");
		}
	}

}
