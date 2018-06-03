package Object클래스;

//객체 동등 비교(equals())메소드
public class Member {
	public String id;
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {	//Member 타입으로 강제 타입 변환하고 id필드값이 동일한지 검사한 후, 동일한다면 true를 리턴
				return true;
			}
		}
		return false;		//매개값이 Member타입이 아니거나 id필드값이 다른경우 false를 리턴
	}
	@Override
	public int hashCode() {
		return id.hashCode();
	} 
}
