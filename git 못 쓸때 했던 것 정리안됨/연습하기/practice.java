package 연습하기;

/*public class practice {
	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i=0; i<5; i++) {
			var1++;
			var2++;
			System.out.println("var1: "+var1+"\t"+"var2: "+var2);
		}
	}
}*/

/*public class practice {
	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		int uniCode = c1;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode);
	}
}*/

/*public class practice {
	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 012;
		int var3 = 0xA;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
	}
}*/

/*public class practice {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드=" + intValue);
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
	}
}*/

/*public class practice {
	public static void main(String[] args) {
	byte byteValue1 = 10;
	byte byteValue2 = 20;
	int intValue1 = byteValue1 + byteValue2;
	System.out.println(intValue1);
	
	char charValue1 = 'A';
	char charValue2 = 1;
	
	int intValue2 = charValue1 + charValue2;
	System.out.println("유니코드=" + intValue2);
	System.out.println("출력문자=" + (char)intValue2);
	
	int intValue3 = 10;
	int intValue4 = intValue3/4;
	System.out.println(intValue4);
	
	int intValue5 = 10;
	double doubleValue = intValue5 / 4.0;
	System.out.println(doubleValue);
	}
}*/


/*public class practice {
	public static void main(String[] args) {
		String strVar1 = "송진우";
		String strVar2 = "송진우";
		String strVar3 = new String("송진우");
		
		System.out.println( strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
		
	}
}*/

/*public class practice {
	public static void main(String[] args) {
	int score = 85;
	char grade = (score>90)?'A':((score>80)?'B':'C');
	System.out.println(score+"점은"+grade+"등급입니다.");
	}
}*/

/*public class practice {
	public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}
	}
}*/

/*public class practice{
	public static void main(String[] args)throws Exception{
		boolean run=true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.println("1. 증속 | 2.감속 | 3.중지");
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.print("선택: ");
			}
			
			keyCode = System.in.read();
			
			if(keyCode == 49) {
				speed++;
				System.out.println("현재 속도="+ speed);
			}else if (keyCode == 50) {
				speed--;
				System.out.println("현재 속도=" + speed);
			}else if (keyCode == 51) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}
}*/
/*import java.util.Scanner;
public class practice{
	private static Scanner sc;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 1000;
		
		System.out.println("나이를 입력해주세요.");
		int Age1 = sc.nextInt();
		if(Age1>=20)
		{
			System.out.println("최종요금: "+money);
		}
		else if(Age1>=14)
		{
			System.out.println("최종요금: " +(money-(money/4)));
		}
		else if(Age1>=4)
		{
			System.out.println("최종요금: "+(money-(money/2)));
		}
		else
		{
			System.out.println("최종요금: "+(money-money));
		}
	}
}*/
/*public class practice {
	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		System.out.println("scores[0]:" + scores[0]);
		System.out.println("scores[1]:" + scores[1]);
		System.out.println("scores[2]:" + scores[2]);
		
		int sum = 0;
		for(int i=0; i<3; i++)
		{
			sum += scores[i];
		}
		System.out.println("총합 : " +sum);
		double avg = (double) sum/3;
		System.out.println("평균 : " + avg);
	}
}*/
/*import java.util.Scanner;
public class practice {
	private static Scanner sc;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0; 
		int b=0; 
		int c=0;
		System.out.println("세 정수를 입력해주세요.\n");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a>b)
		{
			if(b>c)
			{
				System.out.printf("%d %d %d", a, b, c);
			}
			else
			{
				if(a>c)
				{
					System.out.printf("%d %d %d", a, c, b);
				}
				else
				{
					System.out.printf("%d %d %d", c, a, b);
				}
			}
		}
		else
		{
			if(a>c)
			{
				System.out.printf("%d %d %d", b, a, c);
			}
			else
			{
				if(c>b)
				{
					System.out.printf("%d %d %d", c, b, a);
				}
				else
				{
					System.out.printf("%d %d %d", b, c, a);
				}
			}
		}
	}
	public static Scanner getSc() {
		return sc;
	}
	public static void setSc(Scanner sc) {
		practice.sc = sc;
	}
}*/

/*public class practice {
	public static void main(String[] args) {
		int[] scores;
		scores =new int[] {83,90,87};
		int sum1 = 0;
		for(int i = 0; i<3; i++)
		{
			sum1 += scores[i];
		}
		System.out.println("총합 : " +sum1);
		
		int sum2 = add( new int[] {83,90,87});
		System.out.println("총합 : " +sum2);
		System.out.println();
	}

	private static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<3; i++)
		{
			sum += scores[i];
		}
		return sum;
	}
}*/
/*public class practice{
	public static void main(String[] args) {
		int[][] mathScores=new int[2][3];
		for(int i=0; i<mathScores.length; i++) {
			for(int k=0;k<mathScores.length;k++) {
				System.out.println("mathScores["+1+"]["+k+"])="
						+mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][]englishScores=new int[2][];
		
		englishScores[0]=new int[2];
		englishScores[1]=new int[3];
		for(int i=0; i<englishScores.length; i++) {
			for(int k=0; k<englishScores[i].length; k++) {
				System.out.println("englishScores["+i+"]["+k+"]="
						+englishScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] javaScores = {{95,80}, {92, 96, 80}};
		for(int i=0; i<javaScores.length; i++) {
			for(int k=0; k<javaScores[i].length; k++) {
				System.out.println("javaScores["+i+"]["+k+"]="
						+javaScores[i][k]);
			}
		}
	}
}*/

/*public class practice{
	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i]+", ");
		}
	}
}*/

/*public class practice{
	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score :scores)
		{
			sum = sum+score;
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
		}
	}*/

/*public class practice{
	
	public static int sum1(int[] values) {
		int sum=0;
		for(int i=0; i<values.length; i++) {
			sum +=values[i];
		}
		return sum;
	}
	
	public static int sum2(int ... values) {
		int sum=0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	public static void main(String[] agrs) {
		Week today;
		System.out.println();
		
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(sum1(a));
		System.out.println(sum2(1,2,3,4,5,6,7,8,9,10));
	}
}*/

/*public class practice{
	public static void main(String[] args) {
		practice1 myCalc = new practice1();
		myCalc.execute();
	}
}*/

/*public class practice{
	public static void main(String[] args) {
		practice1 myCar = new practice1();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재속도: "+ speed + "km/h");
	}
}*/

/*public class practice{
	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum+=scores[i];
		}
		System.out.println("총합 :" + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 :"+avg);
	}
}*/

/*public class practice{
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java practice num1 num2");
			System.exit(0);
	}
	String strNum1 = args[0];
	String strNum2 = args[1];
	
	int num1 = Integer.parseInt(strNum1);
	int num2 = Integer.parseInt(strNum2);
	
	int result = num1 + num2;
	System.out.println(num1 +"+"+ num2+"="+result);
	}
}*/

/*public class practice{
	public static void main(String[] args) {
		
		int[][] javaisthebest = { {95, 80}, {92, 96, 80}};
		for(int i =0; i<javaisthebest.length; i++) {
			for(int k=0; k<javaisthebest[i].length; k++) {
				System.out.println("javaisthebest["+i+"]["+k+"]="+javaisthebest[i][k]);
			}
		}
	}
}*/

/*public class practice{
	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i]+", ");
		}
	}
}*/

/*public class practice{
	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score : scores) {
			sum = sum + score;
		}
		System.out.println("점수 총합 =" +sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 + "+avg);
		}
	}*/

/*public class practice{
	public static void main(String[] args) {
		practice1 s1 = new practice1();
		System.out.println("s1 변수가 practice1 객체를 참조합니다.");
		practice1 s2 = new practice1();
		System.out.println("s2 변수가 또 다른 practice 객체를 참조합니다.");
	}
}*/

/*public class practice{
	public static void main(String[] args) {
		practice1 practice2 = new practice1();
		System.out.println("car1.company :" +practice2.company);
		System.out.println();
		
		practice1 practice3 = new practice1("자가용");
		System.out.println("car2.company :" +practice3.company);
		System.out.println("car2.model :" +practice3.model);
		System.out.println();
		
		practice1 practice4 = new practice1("자가용", "빨강");
		System.out.println("car3.company :" +practice4.company);
		System.out.println("car3.model :" +practice4.model);
		System.out.println("car3.color :" +practice4.color);
		System.out.println();
		
		practice1 practice5 = new practice1("택시", "검정", 200);
		System.out.println("car4.company :" +practice5.company);
		System.out.println("car4.model :" +practice5.model);
		System.out.println("car4.color :" +practice5.color);
		System.out.println("car4.maxSpeed :" +practice5.maxSpeed);
	}
}*/

/*public class practice{
	public static void main(String[] args) {
		practice1 myCar = new practice1();
		myCar.setGas(10);
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}
	}
}*/

/*public class practice{
	public static void main(String args[]) {
		practice1 myCar = new practice1("포르쉐");
		practice1 yourCar = new practice1("벤츠");
		
		myCar.run();
		yourCar.run();
	}
}*/

/*public class practice{
	public static void main(String[] args) {
		double result1 = 10 * 10 * practice1.pi;
		int result2 = practice1.plus(10, 5);
		int result3 = practice1.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}
}*/

/*public class practice{
	public static void main(String[] args) {
		System.out.println(practice1.info);
	}
}*/

/*public class practice{
	public static void main(String[] args) {
		practice1 obj1 = practice1.getInstance();
		practice1 obj2 = practice1.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 개체입니다.");
		}
		else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}
}*/

/*public class practice{
	public static void main(String[] args) {
	practice1 p1 = new practice1("123456-1234567", "계백");
	
	System.out.println(p1.nation);
	System.out.println(p1.ssn);
	System.out.println(p1.name);
	
	p1.name = "을지문덕";							//상수 246쪽
	}
}*/

/*public class practice{
	public static void main(String[] args) {
		System.out.println("지구의 반지름: " + practice1.EARTH_RADIUS + " km");
		System.out.println("지구의 표면적: " + practice1.EARTH_SURFACE_AREA + " km^2");
	}
}*/

/*public class practice{
	private int speed;
	private boolean stop;
	
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}*/