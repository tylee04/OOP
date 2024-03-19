import java.util.Scanner;

public class Lec2Ex1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b;
		System.out.println("숫자를 입력하세요 :");
		a = input.nextInt();
		b = input.nextInt();
		
		if(a > b) {
			System.out.println(a + "가 " + b + "보다 큽니다");
		}
		else if(a == b) {
			System.out.println(a + "랑 " + b + "는 갑습니다");
		}
		else if(a < b) {
			System.out.println(a + "가 " + b + "보다 작습니다");
		}
	}

}
