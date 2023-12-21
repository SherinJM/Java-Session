package conditional;

public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 20;
		
		if(age >= 18) 
			System.out.println("You are eligible for voting");
		else 
			System.out.println("No, you are not eligible for voting");
		
		System.out.println("*******************");
		
		if(age >= 18) {
			System.out.println("You are eligible for DL");
			System.out.println("You are eligible for Professional course");
		}
		else 
			System.out.println("No, you are not eligible for DL");
		
		System.out.println("*******************");
		
		int a = 1;
		
		if(a==5)
			System.out.println("a is equal to 5");
		else if (a>5)
			System.out.println("a > 5");
		else
			System.out.println("a < 5");

		
			

	}

}
