package �����ϱ�;

/*public class practice1{
	int plus(int x, int y) {
		int result=x+y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum/2;
		return result;
	}
	
	void execute() {
		double result = avg(7,10);
		println("������: " +result);
	}
	
	void println(String message) {
	System.out.println(message);
}

}*/

/*public class practice1{
	int speed;
	
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
	}
	
	void run() {
		for(int i=10; i<=50; i+=10)
		{
			speed = i;
			System.out.println("�޸��ϴ�.(�ü�:" + speed + "km/h)");
		}
	}
}*/

/*public class practice1{
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	practice1(){
	}
	practice1(String model){
		this.model = model;
	}
	practice1(String model, String color){
		this.model = model;
		this.color = color;
	}
	practice1(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}*/

/*public class practice1{
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	practice1(){
	}
		practice1(String model){
		this(model, "����", 250);
	}
		practice1(String model, String)
	}
}*/

/*public class practice1{
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;
	}
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("�޸��ϴ�.(gas�ܷ�:" + gas + ")");
				gas -= 1;
			}else {
				System.out.println("����ϴ�.(gas�ܷ�:" + gas +")");
				return;
			}
		}
	}
}*/

/*public class practice1{
	String model;
	int speed;
	
	practice1(String model){
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i = 10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "�� �޸��ϴ�.(�ü�:" + this.speed + "km/h");
		}
	}
}
*/

/*public class practice1{
	String model;
	int speed;
	
	practice1(String model){
		this.model = model;
	}
	
	void setSpeed(int speed){
		this.speed = speed;
	}
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model +"�� �޸��ϴ�..(�ü�:" + this.speed + "km/h)");
		}
	}
}*/

/*public class practice1{
	String color;							//�ν��Ͻ� �ʵ�
	void setColor(String color) 			//�ν��Ͻ� �޼ҵ�
	{ 
		this.color = color;
	}
	
	static int plus(int x, int y) 
	{ 
		return x + y; 
	}
	
	static int minus(int x, int y)			//static ���� �޼ҵ� 
	{ 
		return x - y; 
	}
}*/

/*public class practice1{
	static double pi = 3.14159;
	
	static int plus(int x, int y) {
		return x+y;
	}
	static int minus(int x, int y) {
		return x-y;
	}
}*/

/*public class practice1{
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	static {
		info = company + "-" + model;
	}
}*/

/*public class practice1{
	int speed;
	
	void run() {
		System.out.println(speed +"���� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
		practice1 myCar = new practice1();
		myCar.speed = 60;
		myCar.run();
	}
}*/

/*public class practice1{
	private static practice1 singleton = new practice1();
	
	private practice1() {}
	
	static practice1 getInstance() {
		return singleton;
	}
}*/

/*public class practice1{
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public practice1(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}*/

/*public class practice1{
	protected static final double EARTH_RADIUS = 6400;
	protected static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}*/

/*public class practice1{
	public static void main(String[] args) {
		practice myCar = new practice();
		
		myCar.setSpeed(-50);
		
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
	}
}*/

