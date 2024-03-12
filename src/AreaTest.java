import java.util.Scanner;

public class AreaTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double PI = 3.141592;
		double radius, area;
		
		radius = input.nextDouble();
		area = radius * radius * PI;
		
		System.out.println("반지름이 "+radius+"인 원의 면적은 "+area+"입니다.");
	}

}
