package System클래스;

//시스템 프로퍼티 읽기(getOrioerty())
//시스템 프로퍼티 읽기
import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.same");		//개별 속성 읽기
		String userHome = System.getProperty("user.home");
		
		System.out.println("운영체제 이름: " + osName);
		System.out.println("사용자 이름: " + userName);
		System.out.println("사용자 홈디렉토리: " + userHome);
		
		System.out.println("---------------------------");
		System.out.println(" [ key ] value");
		System.out.println("---------------------------");
		
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object objKey : keys) {								//모든 속성의 키와 값을 출력
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("[ " + key + " ]" + value);
		}
	} 
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              