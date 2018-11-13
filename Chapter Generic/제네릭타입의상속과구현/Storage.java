package 제네릭타입의상속과구현;

//제네릭 타입의 상속과 구현
//제네릭 인터페이스

public interface Storage<T> {
	public void add(T item, int index);
	public T get(int index);
}
