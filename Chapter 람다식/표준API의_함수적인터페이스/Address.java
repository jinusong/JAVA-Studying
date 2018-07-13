package 표준API의_함수적인터페이스;

// 표준 API의 함수적 인터페이스
// andThen()과 compose() 디폴트 메소드
// 주소 클래스

public class Address {
	private String country;
	private String city;
	
	public Address(String country, String city) {
		this.country = country;
		this.city = city;
	}
	
	public String getCountry() { return country; }
	public String getCity() { return city; }
}
