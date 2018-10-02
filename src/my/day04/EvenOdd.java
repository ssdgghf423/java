package my.day04;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int number;
		Scanner input=new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");

		number=input.nextInt();
		
		if(number%2==0)
			System.out.println("입력된 정수는 짝수입니다.");
		else
			System.out.println("입력된 정수는 홀수입니다.");
	
		System.out.println("프로그램이 종료되었습니다.");
	}
	// a=서지우, b=도경수 라는 문자열이면
	// 문자열을 비교할때는 a==b를 쓸 수 없음.
	// eqrals메소드 사용.(나중에 배움)

}
