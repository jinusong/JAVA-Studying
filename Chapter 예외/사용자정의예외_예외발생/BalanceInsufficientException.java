package 사용자정의예외_예외발생;

//사용자 정의 예외 클래스
public class BalanceInsufficientException extends Exception{
	BalanceInsufficientException(){}
	public BalanceInsufficientException(String message) {
		super(message);
	}
}