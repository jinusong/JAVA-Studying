package 제네릭메소드;

//제네릭 메소드(<T, R> R method(T t))
public class Box<T>{
	private T t;
	public T get() { return t; }
	public void set(T t) { this.t = t; }
}
