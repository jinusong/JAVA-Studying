package StringŬ����;

//����Ʈ �迭�� ��ȯ(getBytes())
//����Ʈ �迭�� ��ȯ
import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "�ȳ��ϼ���";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);		//�⺻ ���ڼ����� ���ڵ��� ���ڵ�
		String str1 = new String(bytes1);
		System.out.println("bytes1->String: " + str1);
		
		try {
			
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: " + bytes2.length);	//EUC-KR�� �̿��ؼ� ���ڵ� �� ���ڵ�
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2->String: " + str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: " + bytes3.length);	//UTF-8�� �̿��ؼ� ���ڵ� �� ���ڵ�
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3->String: " + str3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
