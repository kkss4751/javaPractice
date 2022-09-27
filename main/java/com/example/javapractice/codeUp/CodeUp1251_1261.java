package com.example.javapractice.codeUp;

import java.util.Scanner;

public class CodeUp1251_1261 {
    public static void main(String[] args) {

    }
}


class CodeUp1260 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;

        for ( int i = a; i <= b; i++) {
            if (i % 3 == 0 ) {
                c = c + i;
            }
        }
        System.out.println(c);



    }
}