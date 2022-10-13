package com.example.javapractice.codeUp;

import java.util.Scanner;

public class CodeUp1010_1019 {
    public static void main(String[] args) {
        /** 기초 입출력 정수 1개 입력받아 그대로 출력하기 */
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        System.out.println(i);
    }
}

/** 기초 입출력 문자 1개 입력받아 그대로 출력하기 */
class CodeUp1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* String = nextLine() 은 문자열을 입력받는다.
        *  next(), nextLine() 함수는 문자열 String을 받는 함수이기 때문에 쓸수가 없음
        *  따라서 next()나 nextLine()을 통해 입력 받은 다음 String.charAt() 으로 char형 변수를 꺼내면 된다.
        *
        *  char 형을 바로 Scanner를 통해 입력받아 저장하지못해 next를 통해 받은 String 에서 charAt 을 통해 char 값을 입력받음
        *
        * */
        char a = sc.next().charAt(0);
        System.out.println(a);
    }
}

/** 기초 입출력 문자 1개 입력받아 그대로 출력하기 */
class CodeUp1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();

        // System.out.println(f);
        /** flot 을 출력하며 기본적으로는 소수점 둘째 자리까지만 출력하게 된다
         *  소수점 n자리까지 출력하고 싶을 때 "String.format" 을 이용한다.*/
        System.out.println(String.format("%.6f",f));
    }
}

/** 기초 입출력 정수 2개 입력받아 그대로 출력하기 */
class CodeUp1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%d %d",a,b);

    }
}

/** 기초입출력 문자2개 입력받아 순서 바꿔 출력하기 */
class CodeUp1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);

        System.out.printf("%c %c",b,a); // !!!!!!!!!!!!!!!!! 문자형 출력은 %c !!!!!!!!!!!!!!!!!!!
    }
}

/** 기초입출력 실수 입력받아 둘째자리까지 출력하기 */
class Codeup1015 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float a = sc.nextFloat();

        System.out.printf("%.2f",a);
    }
}

/** 기초입출력 정수1개 입력받아 3번 출력하기 */
class CodeUp1017{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.printf("%d %d %d", a,a,a);
    }
}

/** 기초입출력 시간 입력받아 그대로 출력하기 */
class CodeUp1018 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);

        String time[] = sc.next().split(":");  // 배열선언후 :로 split(나눈다)
        System.out.println(time[0]+":"+time[1]);

        /*int h = sc.nextInt();
        int m = sc.nextInt();
        System.out.printf("%d:%d",h,m);*/

    }
}


/** 연,원,일 입력받아 지정된 형식으로 출력하기 */
class CodeUp1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date[] = sc.nextLine().split("\\."); // 점.닷은 혼자쓸수없다. 쪼갤때 \\를 포함해야하는 문자가 몇개있음
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);

        System.out.printf("%04d.%02d.%02d",year,month,day); // 년도도 4자리로 받아준다.
    }
}