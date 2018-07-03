package 제한된타입파라미터;

//제한된 타입 파라미터(<T extends 최상위타입>)
//제네릭 메소드 호출
public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		//String str = Util.compare("a", "b");   (x) String은 Number타입이 아님
		
		int result1 = Util.compare(10, 20); //int -> integer(자동 Boxing)
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3); //double -> Double(자동 Boxing)
		System.out.println(result2);
	}
}
