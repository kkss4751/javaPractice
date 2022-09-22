package com.example.javapractice.pastCampany.javaProgramming;

/** binaryTest
 *  */
public class Ch04 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);

        /** 0B 뒤에 나오는 숫자는 binary : 2진수이다
         *  4비트로 표현함. 앞에 0이 생략되어있는 상태 32비트로도 할 수 있음 */
        int bNum = 0B1010;
        System.out.println(bNum);

        /** 0 을 앞에 넣어주면 8진수라는 의미.
         *   */
        int oNum = 012;
        System.out.println(oNum);

        /** 앞에 0X 를 넣어주면 16진수
         * */
        int xNum = 0xA;
        System.out.println(xNum);


    }
}
