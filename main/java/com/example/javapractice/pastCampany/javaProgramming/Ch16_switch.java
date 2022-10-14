package com.example.javapractice.pastCampany.javaProgramming;

import java.util.Scanner;

public class Ch16_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        int day;
        switch (month){
            case 1:
                day = 31;
                break; //switch문을 빠져나가기 위해 브레이크를 걸어줌
            case 2:
                day  = 28;
                break;
            case 3:
                day = 31;
                break;
            case 4:
                day = 30;
                break;
            case 5:
                day = 31;
                break;
            case 6:
                day = 30;
                break;
            case 7:
                day = 31;
                break;
            case 8:
                day = 31;
                break;
            case 9:
                day = 30;
                break;
            case 10:
                day = 31;
                break;
            case 11:
                day = 30;
                break;
            case 12:
                day = 31;
                break;
            default: //디폴트값을 마지막에 적어줘야함
                System.out.println( " 존재하지 않는 달입니다. ");
                day = -1;
        }
        System.out.printf("%d 월은 %d 일까지 있습니다.\n",month,day);
        System.out.println(month + "월은 " + day + "일까지 있습니다.");
    }
}
/** 위를 간략하게 줄이면 이렇게 됨*/
class Switch2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month= sc.nextInt();
        int day;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break; //브레이크를 반드시 해줘야함
            case 4: case 6: case 9: case 11:
                day = 30;
                break;
            case 2:
                day = 28;
                break;
            default:
                day = 0;
                System.out.println("존재하지 않는 달입니다.");
                System.out.println("1 ~ 12 중에 다시 적어주세요");
        }
        System.out.printf("%d 월은 %d 일까지 있습니다.\n", month,day);
        System.out.println(month + "월은" + day + "일까지 있습니다.");
    }
}


class SwitchMedal{
    public static void main(String[] args) {
        String medal = "Gold";

        switch (medal) {
            case "Gold":
                System.out.println("금메달 ㅊㅊㅊ");
                break;
            case "Silver":
                System.out.println("은메달 ㅊㅊㅊ");
                break;
            case "Bronze":
                System.out.println("동메달 ㅊㅊㅊ");
                break;
            default:
                System.out.println("메달이 없습니다 더 노력하세요ㅠㅠ");
                break;
        }
    }
}

/** java14 버전은 조금 문법이 다르다   !!!!!!! 아직은 사용안하기때문에 패스 !!!!!!!
 *
 * 간단하게 쉼표, 로 구분할수 있게 만들었다
 * 식으로 표현하여 반환 값을 받을 수 있음. 리턴값이 없는 경우는 오류가 생김
 *
 * yield키워드 사용*/
class Switch14{

}