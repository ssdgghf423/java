package my.day03;
import java.util.Scanner;

public class Add2 {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner input=new Scanner(System.in); // 참조변수
		int x;
		int y;
		int sum;
		
		System.out.print("첫번째 숫자를 입력하시오: ");
		// print는 println처럼 한줄을 띄우지 않고 커서가 그 줄에 남아있는다.
		x=input.nextInt();
		
		System.out.print("두번째 숫자를 입력하시오: ");
		y=input.nextInt();
		
		sum=x+y;
		
		System.out.println(sum);
		
	}

}
