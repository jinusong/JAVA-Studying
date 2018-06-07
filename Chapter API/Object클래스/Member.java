package Object클래스;
 
import java.util.Arrays;

/*
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
*/

/*
//객체 복제(clone()) - 얕은 복제(thin clone)
//복사할 수 있는 클래스 선언
public class Member implements Cloneable {	//implements - 복제할 수 있다는 표시
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();	//clone() 메소드의 리턴 타입은 Object이므로 Member타입으로 캐스팅해야 함
		} catch (CloneNotSupportedException e) {}
		return cloned;
	}
}*/

//깊은 복제(deep clone)
//clone()을 재정의해서 깊은 복제로 변경
public class Member implements Cloneable{
	public String name;
	public int age;
	public int [] scores;		//참조타입필드
	public Car car;				//(깊은 복제 대상)
	
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		//먼저 얕은 복사를 해서 name, age를 복제한다.
		Member cloned = (Member) super.clone(); //Object의 clone호출
		//scores를 깊은 복제한다.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		//car를 깊은 복제한다.
		cloned.car = new Car(this.car.model);
		//깊은 복제된 Member 객체를 리턴
		return cloned;
	}//clone() 메소드 재정의
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();	//재정의된 clone() 메소드 호출
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}