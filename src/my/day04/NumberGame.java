package my.day04;
import java.util.*;

public class NumberGame {

	public static void main(String[] args) {
		int number,loop=0;
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		int computer=rand.nextInt(101);
		
		do {
			System.out.print("정답을 추측하여 보시오: ");
			number=sc.nextInt();
			if(number>computer)
			{
				System.out.println("숫자가 큽니다.");
				loop++;
			}
			else if(number<computer)
			{
				System.out.println("숫자가 작습니다.");
				loop++;
			}
			if(number==computer)
				loop++;
		}while(number!=computer);
		System.out.println("축하합니다. 시도횟수는"+loop+"입니다.");
				

	
	}

}
