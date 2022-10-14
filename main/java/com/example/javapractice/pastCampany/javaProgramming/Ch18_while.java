package com.example.javapractice.pastCampany.javaProgramming;

import java.util.Scanner;

public class Ch18_while {
        /* 조건이 참인동안 반복수행 */
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;//지역변수는 무조건 초기화해주기 !!!

        while (num <= 10){
            sum += num;
            num ++;
        }
        System.out.println(sum);
        System.out.println(num);
    }
}
/* 조건과 상관없이 한번은 수행문을 수행 하고 조건을 체크함
*
* while 문과 for문을 주로 사용하지만 do_while을 쓸 때가 있음*/
// while 문이랑 do _ while 문 차이 비교
class while_01 {
    public static void main(String[] args) { //메인 함수
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;
        while ( input != 0) { //0이 아니면 계속 더하고 입력을 받음
            sum += input;
            input = sc.nextInt();
        }
        System.out.println(sum);
    }
}
class Do_While{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;

        do {
            input = sc.nextInt();   //1. 먼저 입력을 받고
            sum += input;           //2. 그 수를 sum에 더해라
        }while (input != 0 );       //3. 0이 아니면 계속 출력해라
        System.out.println(sum);

    }
}
