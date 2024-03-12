import java.util.Scanner;

public class QuadraticEq {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a = 1.0, b, c;
		b = input.nextDouble();
		c = input.nextDouble();
		double discriminant = Math.pow(b, 2) -4 * a * c;
		
		if(discriminant > 0) {
			double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			System.out.println("Root1: " + root1);
			System.out.println("Root2: " + root2);
		}
		else if(discriminant == 0) {
			double root1 = -b / (2 * a);
			System.out.println("Root1: " + root1);
		}
		else if(discriminant < 0) {
			System.out.println("No Root");	
		}
	}

}
