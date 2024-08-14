package DemoCaseStudy;

public class InheritenceMain extends InheritenceSubClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritenceSubClass ob = new InheritenceSubClass();
		
		ob.show();
		ob.subclass();
		int sum = ob.i +ob.j +ob.k;
		System.out.println();
		System.out.println(" Sum of i,j and k :" + sum);
	}

}
