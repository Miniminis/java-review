package variable;

public class DoubleTest2 {

	public static void main(String[] args) {
		// 부동소수점방식 오류 
		
		double dNum = 1;
		
		for(int i=0; i < 10000; i++) {
			dNum = dNum + 0.1;
		}
		
		System.out.println(dNum);	//1001.000000000159  정확하게 1001 이 나오지 않음! --> 부동소수점의 오류!

	}

}
