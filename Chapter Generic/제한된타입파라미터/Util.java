package 제한된타입파라미터;

//제한된 타입 파라미터(<T extends 최상위타입>)
//제네릭 메소드

public class Util {
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1,  v2);
	}
}