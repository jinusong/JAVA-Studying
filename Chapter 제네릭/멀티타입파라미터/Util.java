package 멀티타입파라미터;

/*
//제네릭 메소드(<T, R> R method(T t))
//제네릭 메소드

public class Util {
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
*/

//제네릭 메소드(<T, R> R method(T t))
//제네릭 메소드

public class Util {
	pulbic static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
}