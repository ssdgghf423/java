package my.day04;
import java.util.*;

public class RockPaperScissor {
	final int SCISSOR=0; // final: 값 변경불가
	final int ROCK=1;
	final int PAPER=2;
	public static void main(String[] args) {
		Random random=new Random(); // 난수를 다루는 클래스: Random
		// Random메소드 호출 시 수의 범위
		// 0.0<=random<1.0
		// 이 코드에서는 final로 int값을 고정해서 범위가 0<=random<1
		// 하지만 보자기인 2까지 출력해야하므로  0<=random<3이여야함
		// 그렇기에 랜덤객체 생성시 new Random(3);
		// if 5까지 출력한다면 new Random(6);
		// if 시작을 0<=이 아닌 1로 하려면 new Random(3+1) => 1<=random<4
		Scanner sc=new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2): ");
		int user=sc.nextInt();
		
		int computer=random.nextInt(3);
		// 그렇기에 랜덤객체로 int값 생성시 random.nextInt(3);
		// if 5까지 출력한다면 random.nextInt(6);
		// if 시작을 0<=이 아닌 1로 하려면 random.nextInt(3)+1 => 1<=random<4
		// +1하는것은 괄호 밖에서 해야함
		
		if(user==computer)
			System.out.println("인간과 컴퓨터가 비겼음");
		else if((user==0)&&(computer==2)||(user==1)&&(computer==0)||
				(user==2)&&(computer==1)) // user가 이기는 경우
			System.out.println("인간: "+user+", 컴퓨터: "+computer+" 인간승리");
		else if((computer==0)&&(user==2)||(computer==1)&&(user==0)||
				(computer==2)&&(user==1)) // computer가 이기는 경우
			System.out.println("인간: "+user+", 컴퓨터: "+computer+" 컴퓨터승리");
		else
			System.out.println("잘못된 입력입니다.");
		
	}

}
