package com.example.javapractice.pastCampany.javaProgramming;

/** 자바의 연산자들 2 ( 관계, 논리 연산자 )
 *
 *  이항 연산자 /// 연산의 결과가 true, false 으로 반환됨, 비교연산자라고 함 /// 조건문, 반복문의 조건식으로 많이 사용 됨 .
 *
 *  하나만 있는것은 대입연산자.
 *
 *  boolean !
 *
 *  논리연산자
 *  관계연산자와 혼합하여 많이 사용됨 // 연산의 결과가 참, 거짓으로 반환됨
 *
 *  && (논리곱) 두 값이 모두 참인 경우에만 참 아니면 거짓
 *  || (논리합) 두 항중 하나의 항만 참이면 결과는 참 아니면 거짓
 *  ! (부정) 참인 경우는 거짓으로 바꾸고 거짓인 경우는 참으로 바꿈
 *  */
public class Ch12 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        boolean flag = (num1 > 0) && (num2 > 0); //둘다 참인 경우이기 때문에 참
        System.out.println(flag);

        flag = (num1 < 0) && (num2 >0); //num1이 틀렸기 때문에 거짓
        System.out.println(flag);

        flag = (num1 > 0) || (num2 >0); //둘중 하나라도 참이면 되는데 둘다 참이기 때문에 참
        System.out.println(flag);

        flag = (num1 < 0) || (num2 > 0); //둘중하나라도 참이면 되는데 두번째 항이 참이므로 참
        System.out.println(flag);

        flag = !(num1 > 0); //참이 아니다 ! 이므로 거짓
        System.out.println(flag);
    }
}

class Ch12_2 {
    public static void main(String[] args) {

        int num1 = 10;
        int i = 2;

        // 논리곱은 처음부터 값이 거짓이면 두번째는 계산하지 않는다
        boolean value = ( (num1 = num1 + 10) < 10 ) && ( (i = i + 2) < 10);
        System.out.println(value);

        boolean value2 = ( (num1 = num1 + 10) < 10 ) || ( (i = i + 2) < 10);
        System.out.println(value2);


    }
}
