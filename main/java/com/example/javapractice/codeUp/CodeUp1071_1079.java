package com.example.javapractice.codeUp;


import java.util.Scanner;
/** 기초반복실행구조 0이 입력될 때까지 무한출력*/
public class CodeUp1071_1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int a = sc.nextInt();

            if (a == 0)
                break;
            System.out.println(a);
        }
    }
}
/** 기초반복실행구조 정수입력받아 계속 출력하기  */
class CodeUp1072 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int b = 1; b <= a; b++){
            System.out.println(b);
        }*/
    }
}
/** 기초반복실행구조 정수1개 입력받아 카운트다운 출력하기 */
class CodeUp1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        

    }
}
/** 기초반복실행구조 정수 1개 입력받아 카운트다운 출력하기 */
class CodeUp1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a > 0){
            System.out.println(a); //a를 출력하고 --를 한다
            a--;
        }
    }
}
/** 기초반복실행구조 정수 1개 입력받아 카운트다운 출력하기 */
class CodeUp1075{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        while( a > 0) {
            a--;
            System.out.println(a);
        }
    }
}

class CodeUp1076{
    public static void main(String[] args) {

    }
}

class CodeUp1078 {
    public static void main(String[] args) {

    }
}
/** 기초-종합 원하는 문자가 입력될 떄까지 출력하기 */
class CodeUP1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            char c = sc.next().charAt(0);
            if (c == 'q') {
                System.out.println(c);
                break;
            }else System.out.println(c);
        }
    }
}