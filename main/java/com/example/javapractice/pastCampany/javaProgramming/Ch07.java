package com.example.javapractice.pastCampany.javaProgramming;

/** 자료형 실수는 어떻게 표현하나?
 *
 *  기본 실수형은 double로 저장이 어딘가에 되어있고
 *  그걸 가져오려면 double형인 8바이트로 가져오고
 *  그 8바이트를 4바이트형인 float에 대입하게 되면 오류가 발생하기 때문에
 *  float 이라고 알려주는 f를 마지막숫자 뒤에 넣어준다,.
 *  */
public class Ch07 {
    public static void main(String[] args) {

        double dnum = 3.14;

        // float fnum = 3.14; 오류가 뜸.
        float fnum = 3.14f;

        System.out.println(dnum);
        System.out.println(fnum);
    }
}
