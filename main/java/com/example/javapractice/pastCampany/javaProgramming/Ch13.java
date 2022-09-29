package com.example.javapractice.pastCampany.javaProgramming;

import java.util.Scanner;

public class Ch13 {
    public static void main(String[] args) {

        int max;
        System.out.println("두 수를 입력받아서 더 큰 수를 출력하세요");

        Scanner sc = new Scanner(System.in);
        System.out.println("입력 1:");
        int num1 = sc.nextInt();
        System.out.println("입력 1:");
        int num2 = sc.nextInt();

        max = (num1 > num2)? num1 : num2;    //num1이 num2보다 크냐 ? 참이면 앞에 항 num1을 선택하고 거짓이면 : num2를 선택해서 밑에 출력해라
        System.out.println(max);



    }

    class ex2{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > b){
                System.out.println(b);
            }else System.out.println(a);
        }
    }

}
