package 표준API의_함수적인터페이스;

public class RunnableExample {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			for(int i = 0; i<10; i++) {
				System.out.println(i);	//람다식( 스레드가 실행하는 코도 )
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
