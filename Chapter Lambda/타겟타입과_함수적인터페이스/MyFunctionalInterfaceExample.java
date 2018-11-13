package 타겟타입과_함수적인터페이스;

// 타겟 타입과 함수적 인터페이스
// 함수적 인터페이스(@Functionallnterface)
// 람다식

// MyFunctionalInterface fi = () -> { ``` }
// fi.method();

/*
public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi= () -> {
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> { System.out.println("method call2"); };
		fi.method();
		
		fi = () -> System.out.println("method call3");	//실행문이 하나라면 중괄호 {}는 생략 가능
		fi.method();
	}
}
*/

// MyfunctionalInterface fi = (x) -> { ``` } 또는 x -> { ``` }
// fi.method(5);

/*
public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi= (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(2);
		
		fi = (x) -> { System.out.println(x*5); };
		fi.method(2);
		
		fi = x -> System.out.println(x*5);
		fi.method(2);
	}
}
*/

// MyFunctionalInterface fi = (x, y) -> { ```; return 값; }
// int result = fi.method(2, 5);

// 람다식

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = (x, y) -> {
			int result = x + y;		// 람다식
			return result;
		};
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> { return x + y; };
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> x + y;
		System.out.println(fi.method(2, 5));		// return문만 있을 경우 중괄호 {}와 return문 생략 가능
		
		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(2, 5));
	}
	public static int sum(int x, int y) {
		return (x + y);
	}
}