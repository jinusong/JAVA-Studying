package ObjectŬ����;
 
import java.util.Arrays;

/*
//��ü ���� ��(equals())�޼ҵ�
public class Member {
	public String id;
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {	//Member Ÿ������ ���� Ÿ�� ��ȯ�ϰ� id�ʵ尪�� �������� �˻��� ��, �����Ѵٸ� true�� ����
				return true;
			}
		}
		return false;		//�Ű����� MemberŸ���� �ƴϰų� id�ʵ尪�� �ٸ���� false�� ����
	}
	@Override
	public int hashCode() {
		return id.hashCode();
	} 
}
*/

/*
//��ü ����(clone()) - ���� ����(thin clone)
//������ �� �ִ� Ŭ���� ����
public class Member implements Cloneable {	//implements - ������ �� �ִٴ� ǥ��
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
			cloned = (Member) clone();	//clone() �޼ҵ��� ���� Ÿ���� Object�̹Ƿ� MemberŸ������ ĳ�����ؾ� ��
		} catch (CloneNotSupportedException e) {}
		return cloned;
	}
}*/

//���� ����(deep clone)
//clone()�� �������ؼ� ���� ������ ����
public class Member implements Cloneable{
	public String name;
	public int age;
	public int [] scores;		//����Ÿ���ʵ�
	public Car car;				//(���� ���� ���)
	
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		//���� ���� ���縦 �ؼ� name, age�� �����Ѵ�.
		Member cloned = (Member) super.clone(); //Object�� cloneȣ��
		//scores�� ���� �����Ѵ�.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		//car�� ���� �����Ѵ�.
		cloned.car = new Car(this.car.model);
		//���� ������ Member ��ü�� ����
		return cloned;
	}//clone() �޼ҵ� ������
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();	//�����ǵ� clone() �޼ҵ� ȣ��
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}