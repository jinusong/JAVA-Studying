package ����ȭ�޼ҵ��_����ȭ���;


/*
public synchronized void method(){
	�Ӱ� ����; //�� �ϳ��� �����常 ����
}
 */

public class Calculator1 {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+": "+ this.memory);
	}
	
	/*
	public void setMemory(int memory) {
		synchronized (this) {	//���� ��ü�� Calculator�� ����(��� ���)
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {}
			System.out.println(Thread.currentThread().getName()+": " +this.memory+" ����");
		}
	}
	*/
}