package SystemŬ����;

//���� �ð� �б�(currentTimeMillis(), nanoTime())
//���α׷� ���� �ҿ� �ð� ���ϱ�
public class SystemTimeExample {
	public static void main(String[] args) {
		long time1 = System.nanoTime();		//���� �ð� �б�
		
		int sum = 0;
		for(int i=1; i<=1000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();		//���ð� �б�
		
		System.out.println("1~1000000������ ��: " + sum);
		System.out.println("��꿡 " + (time2-time1) + " �����ʰ� �ҿ�Ǿ����ϴ�.");
	}
}
 