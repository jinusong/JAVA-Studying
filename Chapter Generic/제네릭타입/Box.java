package 제네릭타입;

/*
//제네릭타입(class<T>,interface<T>)
//Box 클래스

public class Box {
	private Object object; 
	public void set(Object object) { this.object = object; }
	public Object get() { return object; }
}
*/

//제네릭타입(class<T>,interface<T>)
//제네릭 타입

public class Box<T>{
	private T t;
	public T get() { return t; }
	public void set(T t) { this.t = t; }
}