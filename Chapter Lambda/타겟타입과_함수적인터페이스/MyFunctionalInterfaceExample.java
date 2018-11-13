package Ÿ��Ÿ�԰�_�Լ����������̽�;

// Ÿ�� Ÿ�԰� �Լ��� �������̽�
// �Լ��� �������̽�(@Functionallnterface)
// ���ٽ�

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
		
		fi = () -> System.out.println("method call3");	//���๮�� �ϳ���� �߰�ȣ {}�� ���� ����
		fi.method();
	}
}
*/

// MyfunctionalInterface fi = (x) -> { ``` } �Ǵ� x -> { ``` }
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

// MyFunctionalInterface fi = (x, y) -> { ```; return ��; }
// int result = fi.method(2, 5);

// ���ٽ�

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = (x, y) -> {
			int result = x + y;		// ���ٽ�
			return result;
		};
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> { return x + y; };
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> x + y;
		System.out.println(fi.method(2, 5));		// return���� ���� ��� �߰�ȣ {}�� return�� ���� ����
		
		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(2, 5));
	}
	public static int sum(int x, int y) {
		return (x + y);
	}
}