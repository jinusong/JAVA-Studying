package 예외종류에따른처리코드;

//다중 catch
public class CatchExceptionKindExample {
	public static void main(String[]args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);	//Integer.pareInt(Stirng s)은 주어진 분자열을 정수로 바꿔줌
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch(Exception e) {
			System.out.println("실행에 문제가 있습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}
