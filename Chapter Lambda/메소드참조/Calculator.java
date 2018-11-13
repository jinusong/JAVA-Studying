package 메소드참조;

// 메소드참조
// 정적 미치 인스턴스 메소드

public class Calculator {
	public static int staticMethod(int x, int y) {
		return x + y;								//정적 메소드
	}
	public int instanceMethod(int x, int y) {
		return x + y;								//인스턴스 메소드
	}
}
