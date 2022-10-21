package com.example.javapractice.codeUp;

import java.util.Scanner;

/** CodeUp1093 이상한 출석 번호 부르기1*/
public class CodeUp1093_1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr = new int[24];

        for (int i = 0; i < a; i++){
            int num = sc.nextInt();
            arr[num-1] += 1;
        }

        for (int i = 0; i < 23; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

/** CodeUp1094 이상한 출석 번호 부르기2*/
class CodeUp1094{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr = new int[a];
        for (int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = a -1; i>0; i--) System.out.println(arr[i] + "");
    }
}