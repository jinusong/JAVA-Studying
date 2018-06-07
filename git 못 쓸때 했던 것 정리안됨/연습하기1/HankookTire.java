package �����ϱ�1;

public class HankookTire extends Tire{
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation)
		{
			System.out.println(location + " Hankook ����: " +
					(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println("*** "+location + " Hankook ��ũ ***");
			return false;
		}
	}
}
