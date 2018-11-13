package 표준API의_함수적인터페이스;

import java.util.function.IntBinaryOperator;

// 표준 API의 함수적 인터페이스
// Operator 함수적 인터페이스

public class OperatorExample {
	private static int[] scores = { 92, 95, 87 };
	
	public static int maxOrMin( IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int max = maxOrMin(
			(a, b) -> {
				if(a>=b) return a;
				else return b;
			}
		);
		System.out.println("최대갑: " + max);
		
		int min = maxOrMin(
			(a, b) -> {
				if(a<=b) return a;
				else return b;
			}
		);
		System.out.println("최소값: " + min);
	}
}
