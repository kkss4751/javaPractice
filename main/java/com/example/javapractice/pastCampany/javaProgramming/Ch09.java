package com.example.javapractice.pastCampany.javaProgramming;

/** 논리형과 자료형 없이 변수 사용하기
 *
 *  true(참), false(거짓) 두 가지만 나타냄
 *  1바이트를 사용함
 *  값이 존재하는지, 배열이 비었는지 결과가 참인지 거짓인지등을 표현
 *  */

public class Ch09 {
    public static void main(String[] args) {

        /** var 변수는 선언할 때 타입을 생략할 수 있으며, 컴파일러가 타입을 추론한다.
         *  java 에서 var 변수는 지역변수에서만 사용할 수 있다.
         *  또한 컴파일러가 타입을 추론할 수 없는 애매한 상황일 때 컴파일 에러가 발생한다.*/
        var i = 10; //int
        var j = 10.0; //double
        var str = "hello"; //String


        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "test";
        System.out.println(str);

        var str2 = str;
        System.out.println(str2);
        // str = 3; String으로 인식하는데 int를 넣을 수 없음.



    }
}
/** 지역변수 자료형 없이 사용하기
 *
 * local variable type inference
 * 추론 가능한 변수에 대한 자료형을 선언하지 않음
 * 한번 선언하여 추론 된 변수는 다른 타입의 값을 대입 할 수 없음
 * 지역 변수만 사용 가능
 * */