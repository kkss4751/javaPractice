package com.example.javapractice.codeUp;

import java.util.Scanner;

public class CodeUp1046_1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        /* equals 와 == 의 차이는
        *  equals 는 비교하고자 하는 대상의 내용 자체를 비교하지만, (메서드)
        *  == 연산자는 비교하고자 하는 대상의 주소값을 비교한다. (연산자) */

        if (str.equals("love")){
            System.out.println("I " + str + " You.");
        }else System.out.println();
    }
}
