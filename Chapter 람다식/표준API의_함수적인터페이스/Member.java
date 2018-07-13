package 표준API의_함수적인터페이스;

// 표준 API의 함수적 인터페이스
// andThen()과 compose() 디폴트 메소드
// 회원 클래스

public class Member {
	private String name;
	private String id;
	private Address address;
	
	public Member(String name, String id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	public String getName() { return name; }
	
	public String getId() { return id; }
	public Address getAddress() { return address; }
}
