package 제네릭타입의상속과구현;

//제네릭 타입의 상속과 구현
//부모 제네릭 클래스

public class Product<T, M> {
	private T kind;
	private M model;
	
	public T getKind() { return this.kind; }
	public M getModel() { return this.model; }
	
	public void setKind(T kind) { this.kind = kind; }
	public void setModel(M model) { this.model = model; }
}

class Tv{}