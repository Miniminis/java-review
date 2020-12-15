package variable;

public class ExplicitConversion {

	public static void main(String[] args) {

		//explicit
		int iNum = 129;
		byte bNum2 = (byte)iNum;
		
		System.out.println(iNum);	//129
		System.out.println(bNum2); //-127 --> 데이터 유실됨

		double dNum1 = 1.3;
		float fNum1 = 0.8F;

		int iNum1 = (int)dNum1 + (int)fNum1;
		int iNum2 = (int)(dNum1 + fNum1);

		System.out.println(iNum1);	//1
		System.out.println(iNum2);	//2
	}

}
