package variable;

public class IntegerTest {

	public static void main(String[] args) {
//		byte bNum = 129;	//error 		
		byte bNum = 127;
		
//		int iNum = 12345678900;	//out of range
		long iNum = 12345678900L;

		System.out.println(bNum);
		System.out.println(iNum);
	}

}
