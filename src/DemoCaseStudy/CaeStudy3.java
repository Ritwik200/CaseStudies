package DemoCaseStudy;
import java.util.Scanner;
public class CaeStudy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub   
		Scanner input =  new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = input.nextInt();
		
		if(num < 0) {
			num = (-1)*num;
		} 
		
		System.out.println("Absolute numbe is: "+num);
		
	}

}
