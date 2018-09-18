package my.day03;

public class Constant {

	public static void main(String[] args) {
		final double KM_PER_MILE=1.609344; // final=값 변경 불가
		// 기호상수(final)는 대문자
		double km;
		double mile=60.0;
		km=KM_PER_MILE*mile;
		
		System.out.println("60마일은 "+km+"킬로미터입니다.");
	}

}
