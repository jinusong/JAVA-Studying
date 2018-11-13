package Map_컬렉션;
import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

// Map 컬렉션
// Properties
// 프로퍼티 파일로부터 읽기

public class PropertiesExample {
	public static void main(String[] args) throws Exception{
		Properties properties = new Properties();
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");
		properties.load(new FileReader(path));
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println("drive : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
	}
}
