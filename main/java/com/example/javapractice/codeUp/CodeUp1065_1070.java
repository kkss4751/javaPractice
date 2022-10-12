package com.example.javapractice.codeUp;

import java.util.Scanner;

/** CodeUp1065 기초-조건 선택실행구조. 정수 3개 입력받아 짝수만 출력하기 */
public class CodeUp1065_1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a % 2 == 0){
            System.out.println(a);
        }
        if (b % 2 == 0 ){
            System.out.println(b);
        }
        if (c % 2 == 0){
            System.out.println(c);
        }
    }
}

/** 기초 조건. 정수 3개 입력받아 짝 or 홀 출력하기*/
class CodeUp1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a % 2 == 0 ){
            System.out.println("짝"); //even
        }else System.out.println("홀"); //odd

        if (b % 2 != 0){ // 0이 아니면
            System.out.println("홀");
        }else System.out.println("짝");

        if (c % 2 == 0){
            System.out.println("짝");
        }else System.out.println("홀");
    }
}


/** CodeUp1067 기초 조건 . 정수 1개 입력받아 분석하기 */
class CodeUp1067{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 0 ){
            System.out.println("minus");
            if (a % 2 == 0) {
                System.out.println("even");
            }else System.out.println("odd");
        }else {
            System.out.println("plus");
            if (a % 2 == 0) {
                System.out.println("even");
            }else System.out.println("odd");
        }
    }
}

/** CodeUp1068 정수 1개 입력받아 평가 출력하기 */
class CodeUp1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a >= 90 ){
            System.out.println("A");
        }else if (a >= 70) {
            System.out.println("B");
        } else if (a >= 40) {
            System.out.println("C");
        } else System.out.println("D");

    }
}
/** CodeUp1069 평가 입력받아 다르게 출력하기 */
class CodeUp1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 문자형 char 으로 입력받는다.
        // .charAt(0) 을 통해 0번째 글자 한글자만 받을 수 있다.
         char a = sc.next().charAt(0);

        switch (a){
            case 'A' :
                System.out.println("best");
                break;
            case 'B' :
                System.out.println("good");
                break;
            case 'C' :
                System.out.println("run!");
                break;
            case 'D' :
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");
        }
    }
}

/** CodeUp1070 기초조건 월 입력받아 계절 출력하기 */
class CodeUp1070{
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int mes = sc.nextInt();

        switch (mes) {
            case 12: case 1: case 2:
                System.out.println("winter");
                break;
            case 3: case 4: case 5:
                System.out.println("spring");
                break;
            case 6: case 7: case 8:
                System.out.println("summer");
                break;
            case 9: case 10: case 11:
                System.out.println("fall");
                break;
            default:
                System.out.println("1~12 중 다시 입력하세요 ");
        }
    }
}