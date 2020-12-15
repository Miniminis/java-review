package variable;

public class ImplicitConversion {
    public static void main(String[] args) {
        /* 암시적 형변환이 가능한 경우
         * 작은수-> 큰수
         * 덜 정밀한 수 -> 더 정밀한 수
         * */

        byte bNum = 1;
        short sNum = bNum;

        System.out.println(bNum);
        System.out.println(sNum);

        int iNum2 = 20;
        float fNum = iNum2;

        System.out.println(fNum);

        double dNum;
        dNum = fNum + iNum2;

        System.out.println(dNum);

    }
}
