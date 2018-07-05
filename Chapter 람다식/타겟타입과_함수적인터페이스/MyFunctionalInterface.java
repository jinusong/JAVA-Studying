package 타겟타입과_함수적인터페이스;


// 인터페이스 변수 = 람다식;

// 타겟 타입과 함수적 인터페이스
// 함수적 인터페이스(@Functionallnterface)
// 함수적 인터페이스

/*
@FunctionalInterface
public interface MyFunctionalInterface {
	public void method();
	//public void otherMethod();	//컴파일 오류
}
*/

/*
@FunctionalInterface
public interface MyFunctionalInterface {
	public void method(int x);
}
*/

// 리턴 값이 있는 람다식
// 함수적 인터페이스

@FunctionalInterface
public interface MyFunctionalInterface {
	public int method(int x, int y);
}