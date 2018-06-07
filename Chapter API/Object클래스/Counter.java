package Object클래스;
 
//객체 소멸자 (finalize())
//finalize()메소드 재정의

public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	@Override
	protected void finalize() throws Throwable{
		System.out.println(no + "번 객체의 finalize()가 실행됨");
	}
}
