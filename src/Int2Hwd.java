import java.util.Scanner;

public class Int2Hwd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String value;
		System.out.println("숫자를 입력하세요 : ");
		value = input.next();
		
		switch(value) {	
		case "하나", "일", "첫째":
			System.out.println("1");
			break;
		case "둘", "이", "둘째":
			System.out.println("2");
			break;
		}
	}

}
