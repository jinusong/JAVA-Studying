package 스레드_우선순위;

public class CalcThread extends Thread{
	public CalcThread(String name) {
		setName(name);	//스레드 이름 변경
	}
	
	public void run() {
		for(int i=0; i<2000000000; i++) {
		}
		System.out.println(getName());	//스레드가 실행할 내용
	}
}
