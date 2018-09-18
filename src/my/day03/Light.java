package my.day03;

public class Light {

	public static void main(String[] args) {
		long lightspeed;
		long distance;
		lightspeed=300000L; // int의 범위를 벗어나는 숫자를 long형으로 지정할 때 숫자끝에 L을 붙여준다
		distance=lightspeed*365L*24*60*60;
		System.out.println("빛이 1년 동안 가는 거리 : "+distance+"km.");
	}

}
