package String클래스;

//바이트 배열로 변환(getBytes())
//바이트 배열로 변환
import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);		//기본 문자셋으로 인코딩과 디코딩
		String str1 = new String(bytes1);
		System.out.println("bytes1->String: " + str1);
		
		try {
			
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: " + bytes2.length);	//EUC-KR을 이용해서 인코딩 및 디코딩
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2->String: " + str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: " + bytes3.length);	//UTF-8을 이용해서 인코딩 및 디코딩
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3->String: " + str3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
