package my.day04;
/**
 * Random 클래스를 사용하여 1~3까지의 정수 난수를 생성하고, 출력하시오.
 */
import java.util.*;

public class RandomTest {

	public static void main(String[] args) {
		Random rand=new Random();
		int number=rand.nextInt(3)+1; // 범위: 1<=random<4
		System.out.println("Random: "+number);
	}

}
