package com.example.javapractice.pastCampany.javaProgramming;

public class Ch19_for {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 10; i++){
            sum += i;
        }
        System.out.println(sum);

        int num = 1;
        int total = 0;

        while (num <= 10){
            total += num; //num++
            num++;
        }
        System.out.println(total);
    }
}
/** 각 반복문은 주로 언제 사용하나 ?
 *
 * while ==> 조건식의 결과나 변수가 true, false 값인 경우 주로 사용
 *
 * do-while ==> 조건식의 결과나 변수가 true, false값인 경우 주로 사용
 *
 * for ==> 특정수의 범위, 횟수와 관련하여 반복되는 경우 주로 사용
 *         배열과 함께 많이 사용됨
 *
 * */

class for02{
    public static void main(String[] args) {
        int i = 0 ;
        for (; i<5; i++){ // 초기화식 생략가능, 그대신 세미콜론 ; 꼭 찍어줘야함!!!!!
            System.out.println(i);
        }

        int sum = 0;
        for (i = 0; ; i++){ // 조건식 생략: 반복수행에 대한 조건이 수행문 내부에 있는경우.
            sum+=i;
            if (sum>200) break;
        }
        for (i = 0; i<5; ){ // 증감식 생략: 증감식에 대한 연산이 복잡하거나 다른 변수의 연산결과값에 결정되는 경우
            i = (++i) % 10;
        }

        for (;;){ //ture = 무한반복 !
            System.out.println(i);
        }
    }
}

/** 중첩 반복문 */
class NestedLoop{
    public static void main(String[] args) {
        int dan = 2;
        int count = 1;

        for (; dan <= 9; dan++){
            for (count = 1; count <= 9; count++){
                System.out.printf("%d x %d = %d\n", dan, count, dan*count);
            }
            System.out.printf("%d x %d = %d\n",dan,count, dan*count);
        }

        dan = 2;
        count = 1;
        while (dan <= 9){
            count = 1; //********!!!!!!!!!!!!!
            while (count <= 9){
                System.out.printf("%d x %d = %d\n", dan, count, dan*count);
                count++;
            }
            System.out.printf("%d x %d = %d\n",dan,count, dan*count);
            dan++;
        }
    }
}