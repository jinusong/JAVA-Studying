package 멀티타입파라미터;

//제네릭 메소드(<T, R> R method(T t))
//제네릭 메소드 호출

public class BoxingMethodExample {
	public static void main(String[] args){
		Box<Integer>box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		
		Box<String> box2 = Util.boxing("홍길동");
		String strValue = box2.get();
	}
} 
