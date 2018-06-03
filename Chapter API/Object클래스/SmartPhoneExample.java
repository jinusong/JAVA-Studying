package Object클래스;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", " 안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone);
	}
}
