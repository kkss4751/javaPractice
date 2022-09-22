package com.example.javapractice.pastCampany.javaProgramming;

/** 문자는 프로그램에서 어떻게 표현될까?
 *
 *  문자를 컴퓨터에서 어떻게 표현할까 하다가 문자를 숫자로 표현하기로 함 ( ASKII CODE )
 *  a -인코딩-> 65 -디코딩-> a
 *  자바는 문자를 나타내기 위해 전세계 표준인 unicode를 사용
 *
 *  문자를 위한 데이터타입 char = 'A';
 *  'A'(2byte) 와 "A"(4byte) 이기 때문에 전혀 다른 성질
 *
 *  char ch ='A' 문자로 보이지민 컴퓨터안에서는 숫자로 되어있다. !!!!다만 양수만 쓸수있다.!!! 음수 xxx
 *
 *
 * */
public class Ch08 {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1); // 정수로 형변환 (casting) // a의 askii 값은 65

        char ch2 = 66; // 66dmf char 형으로 출력하기 때문에 처음부터 문자형이 나옴
        System.out.println(ch2);
        System.out.println((char)ch2); //

        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char)ch3);

        /* char 자료형은 2 byte 로 쓰고 정수값을 가지고 있다. 음수는 사용 불가 .
        *  유니코드는  슬래시u 하고 쓰면 되지만 외우기 불가능하기 때문에 그냥 검색하자 */

        /** ~~~~~~~~~~~~ 용어 정리 ~~~~~~~~~~~~~~~~
         *
         *  character set : 문자를 숫자로 변환한 값의 세트
         *  encoding : 문자가 숫자로 변환
         *  decoding : 숫자가 다시 문자로 변환
         *
         *  ASKII code : 알파벳과 숫자 특수 문자등을 1바이트에 표현하는데 사용하는 문자세트
         *
         *  UNICODE : 전 세계 표준으로 만든 문자 세트
         *
         *  UTF -8 : 1바이트에서 4바이트까지 다양하게 문자를 표현할 수 있음
         *
         *  UTF - 16 : 2바이트로 문자를 표현*/


    }
}
