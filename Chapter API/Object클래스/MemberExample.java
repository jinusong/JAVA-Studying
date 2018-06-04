package Object클래스;
/*
//객체 동등 비교(equals() 메소드)
public class MemberExample {
	public static void  main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		}else {
			System.out.println("obj1과 obj2은 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등합니다.");
		}else {
			System.out.println("obj1과 obj3은 동등하지 않습니다.");
		}
	}
}
*/

/*
//객체 복제(clone()) - 얕은 복제(thin clone)
//복제 객체를 변경하더라도 원본 객체는 변함 없음
public class MemberExample {
	public static void main(String[] args) {
		//원본 객체 생성
		Member original = new Member("blue", "홍길동", "12345", 25, true);
		
		//복제 객체를 얻은 후에 패스워드 변경
		Member cloned = original.getMember();
		cloned.password = "67890";								//복제 객체에서 패스워드 변경
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id: " + cloned.id);
		System.out.println("name: " + cloned.name);
		System.out.println("password: " + cloned.password);
		System.out.println("age: " + cloned.age);
		System.out.println("adult: " + cloned.adult);
		
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id: " + original.id);
		System.out.println("name: " + original.name);
		System.out.println("password: " + original.password);	//원본 객체의 패스워드는 변함 없음
		System.out.println("age: " + original.password);
		System.out.println("adult: " + original.adult);
	}
}
*/

//깊은 복제(deep clone)
//깊은 복제 후 복제본 변경은 원본에 영향을 미치지 않는다.
public class MemberExample{
	public static void main(String[] args) {
		//원본 객체 생성
		Member original = new Member("홍길동", 25, new int[] {90, 90}, new Car("소나타"));
		
		//복제 객체를 얻은 후에 참조 객체의 값을 변경
		Member cloned = original.getMember();
		cloned.scores[0] = 100;					//깊은 복제 후 참조 객체의 데이터를 변경
		cloned.car.model = "그랜저";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("name: " + cloned.name);
		System.out.println("age: " + cloned.age);
		System.out.print("scores: {");
		for(int i=0; i<cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i==(cloned.scores.length-1))?"":",");
		}
		System.out.println("}");
		System.out.println("car: " + cloned.car.model);
		
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("name: " + original.name);
		System.out.println("age: " + original.age);
		System.out.print("scores: {");
		for(int i=0; i<original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print((i==(original.scores.length-1))?"":",");
		}
		System.out.println("}");
		System.out.println("car: " + original.car.model);
	}
}