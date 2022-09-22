package com.example.javapractice.pastCampany.javaProgramming;

/** 변하지 않는 상수와 리터럴, 변수의 형 변환
 *
 *  상수는 변하지 않는 수
 *  원주율 3.14, 1년 12개월 등
 *  앞에 final 예약어를 사용하여 선언
 *  상수를 사용하면 변하지 않는 값을 반복하여 사용할 때 의미있는 문자로 인식하기 쉽고
 *  혹, 변하더라도 선언한 부분만 변경하면 되므로 여러부분을 수정할 필요가 없음
 *
 *  */
public class Ch10 {
    public static void main(String[] args) {

        //final 마지막이라는 뜻 . 변하지 않겠다.
        // 상수는 대문자로 표현한다.
        final int MAX_NUM = 100;
        final int MIN_NUM;

        //중간에 시작하기 전에 예는 얼마짜리다라고 지정해줘야함
        MIN_NUM = 0;

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

        // MAX_NUM = 1000 처음에 초기화를 하면 바꿀 수 없음.
        // 상수 => 변하지 않는수


        /** 리터럴 ?? 제대로 이해못함
         *
         *  프로그램에서 사용하는 숫자, 문자, 논리값을 뜻함
         *  리터럴은 상수 풀 ( constant pool) 에 있음 ==>
         *  정수 리터럴은 int 로 실수 리터럴은 double 로 저장됨
         *  정수의 범위가 넘어가는 경우는 L,l 을 float 으로 사용하려는 경우는 F,f 식별자를 써줘야 함
         *
         *  */

        /** 형 변환
         *
         *  서로 다른 자료형 간에 연산등의 수행을 위해 하나의 자료형으로 통일하는 것
         *  묵시적 형 변환(자동 형변환) 과 명시적 형변환(강제형변환) 이 있음
         *  바이트 크기가 작은 자료형에서 큰 자료형으로 형 변환은 자동으로 이뤄짐
         *  덜 정밀한 자료형 (정수) 에서 더 정밀한 자료형(실수) 으로 형 변환은 자동으로 이뤄짐
         *
         *  */

        byte bNum = 10;
        int iNum = bNum; // 문제없음
        System.out.println(iNum);

        int iNum1 = 20;
        float fNum = iNum1;// 문제없음
        System.out.println(fNum);

        int iNum3 = 10;
        byte bNum3 = (byte) iNum3; // 4btye를 1byte를 넣으면 에러가 뜨기 때문에 강제형변환을 해준다.
        System.out.println(bNum3);

        double dNum = 3.14;
        int iNum4 = (int) dNum; // 소수점 이하가 없어지는 자료형 유실이 일어난다.
        System.out.println(iNum4);//더 정밀한 수에서 덜 정밀한 수로 타이핑케스팅 형변환


        double dnum = 1.2;
        float fnum = 0.9F;

        int i = (int)dnum + (int)fnum;
        int j = (int)(dnum + fnum);

        System.out.println(i);  // int로 형변환 후 출력
        System.out.println(j);  // 실수로 더한수 int로 형변환 출력
    }
}
