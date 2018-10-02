package my.day04;
import java.util.Scanner;

public class StringSwitch {

	public static void main(String[] args) {
		String month; // String 문자변수
		int monthnumber;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("월(1~5)을 입력하시오: ");
		month=scan.next();
		
	
		switch(month) {
		case "일월":
			monthnumber=1;
			break;
		case "이월":
			monthnumber=2;
			break;
		case "삼월":
			monthnumber=3;
			break;
		case "사월":
			monthnumber=4;
			break;
		case "오월":
			monthnumber=5;
			break;
		case "육월":
			monthnumber=6;
			break;
		default:
			monthnumber=0;
			break;
		}
		System.out.println("monthnumber: "+monthnumber);
	}

}
