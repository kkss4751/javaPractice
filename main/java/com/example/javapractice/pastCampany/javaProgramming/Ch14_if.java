package com.example.javapractice.pastCampany.javaProgramming;

import java.util.Scanner;

public class Ch14_if {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 8 ){
            System.out.println("학교에 다닙니다.");
        }else
            System.out.println("유치원에 다닙니다.");

    }

    class if_else_if_else{
        public static void main(String[] args) {
            // 여러개의 조건 if문

            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            int charge;
            //int age = 12;
            //int charge;

            if (age < 8){
                charge = 1000;
                System.out.println("미 취학 아동입니다.");
            } else if (age < 14) {
                charge = 2000;
                System.out.println("초등학생입니다.");
            } else if (age < 20){
                charge = 2500;
                System.out.println("중,고등학생입니다.");
            }else {
                System.out.println("일반인 입니다.");
                charge = 3000;
            }
            System.out.println("입장료는 "+ charge + "입니다.");
        }

    }
}
