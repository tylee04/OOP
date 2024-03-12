import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int year;
		Scanner input = new Scanner(System.in);
		year = input.nextInt();
		System.out.println((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
	}

}
