package ObjectŬ����;
 
//��ü �Ҹ��� (finalize())
//finalize() �޼ҵ� ���� Ȯ��
public class FinalizeExample {
	public static void main(String[] args) {
		Counter counter = null;
		for(int i=1; i<=50; i++) {
			counter = new Counter(i);
			
			counter = null;		//Counter ��ü�� ������� ����
			
			System.gc();		//������ ������ ���� ��û
		}
	}
}