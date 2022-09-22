package com.example.javapractice.pastCampany.javaProgramming;
/** 정수 자료형 int(4), long(8)
 *
 * 정수 자료형은 기본 4바이트 int 타입이며 약 21억을 저장할 수 있고 그 이상이 넘어가면 long타입으로 형변환을 해주어야 한다.
 * long 타입으로 형변환을 할 때에는 마지막숫자에 알파벳 L 을 적어준다.
 *
 * ayudar a Entender
 * 정수는 어딘가에 저장되어있고 4바이트로 저장되어있다.
 * int 범위를 넘어가면 long 자료형을 가져와야하지만 정수는 4바이트이기 때문에 컴퓨터는 인트형으로 인식하고 오류가 남
 * 그럼 그걸 long 타입이라고 알려주는 L을 마지막숫자뒤에 넣어준다.
 * */
public class Ch06 {
    public static void main(String[] args) {
        byte bnum = -128;
        System.out.println(bnum);

        // int num = 123455667998; int 범위를 초과했음.
        long lnum = 12233445566767L; // long 타입이라고적어주면 자동으로 형변환을 해준다.
        System.out.println(lnum);

    }
}
