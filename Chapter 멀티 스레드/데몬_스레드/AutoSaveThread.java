package 데몬_스레드;

// 데몬 스레드
// 1초 주시로 save() 메소드를 호출하는 데몬스레드

public class AutoSaveThread extends Thread{
	public void save() {
		System.out.println("작업 내용을 저장함");
	}
	
	@Override
	public void run() {
		while(true) {
			try { Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
			save();
		}
	}
}
