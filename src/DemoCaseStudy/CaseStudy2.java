
package DemoCaseStudy;
import java.util.Scanner;
public class CaseStudy2 {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		
		int num=input.nextInt();
		
		if(num%2==0) {
			System.out.println(num+" Number is even");
		} else {
			System.out.println(num+" Number is odd");
		}

	}

}
