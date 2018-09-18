package my.day03;
import java.util.*;

public class InputString {

	public static void main(String[] args) {
		String name,number;
		int age;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("이름을 입력하시오: ");
		name=sc.next();
		// nextLine()은 전체 줄을 입력받음.
		// next()는 enter후에도 입력받음.
		
		System.out.print("나이를 입력하시오: ");
		age=sc.nextInt();
		
		System.out.print("전화번호를 입력하시오: ");
		number=sc.next();
		
		System.out.println(name+"님 안녕하세요!"+age+"살이시네요.\n전화번호는 "+number+"이군요.");
	}

}
