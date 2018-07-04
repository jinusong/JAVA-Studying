package 제네릭타입의상속과구현;

//제네릭 타입의 상속과 구현
//자식 제네릭 클래스

public class ChildProduct<T, M, C> extends Product<T, M> {
	private C company;
	public C getCompany() { return this.company; }
	public void setCompany(C company) { this.company = company; }
}
