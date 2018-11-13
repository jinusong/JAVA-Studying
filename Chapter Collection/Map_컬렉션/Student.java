package Map_컬렉션;

// Map 컬렉션
// HashMap
// 키로 사용할 객체 - hashCode()와 equals() 재정의 
  
public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	public boolean equals(Object obj) {		//학번과 이름이 동일할 경우 true를 리턴
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno==student.sno) && (name.equals(student.name));
		} else {
			return false;
		}
	}
	
	public int hashCode() {		//학번과 이름이 같다면 동일한 값을 리턴
		return sno + name.hashCode();
	}
}
