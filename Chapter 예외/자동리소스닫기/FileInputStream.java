package 자동리소스닫기;

//자동 리소스 닫기
public class FileInputStream implements AutoCloseable{
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file + "읽습니다.");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println(file + "을 닫습니다.");
	}
}
