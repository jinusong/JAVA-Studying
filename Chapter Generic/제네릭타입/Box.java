package ���׸�Ÿ��;

/*
//���׸�Ÿ��(class<T>,interface<T>)
//Box Ŭ����

public class Box {
	private Object object; 
	public void set(Object object) { this.object = object; }
	public Object get() { return object; }
}
*/

//���׸�Ÿ��(class<T>,interface<T>)
//���׸� Ÿ��

public class Box<T>{
	private T t;
	public T get() { return t; }
	public void set(T t) { this.t = t; }
}