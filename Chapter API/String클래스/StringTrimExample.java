package String클래스;

//문자열 앞뒤 공백 잘라내기(trim())
//앞뒤 공백 제거
public class StringTrimExample {
	public static void main(String[] args) {
		String tel1 = " 02";
		String tel2 = "123  ";
		String tel3 = "    1234    ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
	}
}
