package com.example.javapractice.codeUp;

import java.io.SyncFailedException;
import java.util.Scanner;

/** CodeUp1151 10보다 작은 수*/
public class CodeUp1151_1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 10){
            System.out.println("small");
        }
    }
}
/** CodeUp1052 10보다 작은수 */
class CodeUp1152{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 10){
            System.out.println("small");
        }else System.out.println("big");
    }
}
/** CodeUp1053 두 수의 대소 비교 */
class CodeUp1053{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b){
            System.out.println("=");
        } else if (a > b) {
            System.out.println(">");
        } else System.out.println("<");
    }
}
/** CodeUp1154 큰수 - 작은수 */
class CodeUp1154{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b){
            System.out.println(a - b);
        }else System.out.println(b - a);

    }
}
/** CodeUp1155 7의 배수 */
class CodeUp1155{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 7 == 0){
            System.out.println("multiple");
        }else System.out.println("not multiple");
    }
}
/** CodeUp1156 홀수 짝수 구별*/
class CodeUp1156{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("even");
        }else System.out.println("odd");
    }
}
/** CodeUp1157 특별한 공 던지기1 */
class CodeUp1157{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();

        if (50 <= a && a <= 60){
            System.out.println("win");
        }else System.out.println("lose");
    }
}
/** CodeUp1158 특별한 공 던지기2 */
class CodeUp1158{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (30 <= a && a <= 40 || 60 <= a && a <= 70){
            System.out.println("win");
        }else System.out.println("lose");
    }
}

/** CodeUp1159 특별한 공 던지기3 */
class CodeUp1159{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (50 <= a  && a <= 70 || a % 3 == 0){
            System.out.println("win");
        }else System.out.println("lose");
    }
}