package com.example.javapractice.codeUp;


import java.util.Scanner;

public class CodeUp1020_1030 {
    public static void main(String[] args) {

    }
}


/** codeup1029 실수 1개 입력받아 그대로 출력하기*/
class CodeUp1029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        /* 형변환 한번 해보기 실수 기본은 double */

        System.out.println(d);

    }
}

/** codeup1030 정수 1개 입력받아 그대로 출력하기 정수범위 9999999999999999999999999999*/
class CodeUp1030{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        long a= sc.nextLong();
        System.out.println(a);
    }
}