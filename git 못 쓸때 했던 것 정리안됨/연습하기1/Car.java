package 연습하기1;

/*public class Car {
	/*Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	*/
	Tire [] tires = {
			new Tire("앞 왼쪽", 6),
			new Tire("앞 오른쪽", 2),
			new Tire("뒤왼쪽", 3),
			new Tire("뒤오른쪽", 4)
	};
	int run() {
		System.out.println("[자동차가 달립니다.]");
		/*if(frontLeftTire.roll()==false) { stop(); return 1;}
		if(frontRightTire.roll()==false) { stop(); return 2;}
		if(backLeftTire.roll()==false) { stop(); return 3;}
		if(backRightTire.roll()==false) { stop(); return 4;}
		return 0;*/
		for(int i=0; i<tires.length; i++) {
		if(tires[i].roll()==false) {
			stop();
			return (i+1);
		}
	}
		return 0;
}
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
