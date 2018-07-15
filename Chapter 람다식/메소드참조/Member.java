package 메소드참조;

// 메소드참조
// 생성자 오버로딩

public class Member {
	private String name;
	private String id;
	
	public Member() {
		System.out.println("Member() 실행");
	}
	
	public Member(String id) {
		System.out.println("Member(String id) 실행");		//첫째 피참조 생성자
		this.id = id;
	}
	public Member(String name, String id) {
		System.out.println("Member(String name, String id)");	//둘째 피참조 생상자
		this.name = name;
		this.id = id;
	}
	
	public String getId() { return id; }
}
