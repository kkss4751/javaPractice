package com.example.javapractice.pastCampany.javaProgramming;

/** 자바의 연산자들 ( 대입, 부호, 산술, 복합대입, 증감연산자 )
 *
 *  항과 연산자
 *  항 : 연산에 사용되는 값 /// 연산자 : 항을 이용하여 연산하는 기호
 *
 *  대입연산자
 *  변수에 다른 변수나 값을 대입하는 연산자 /// 이항 연산자 중 우선순위가 가장 낮은 연산자들 /// 왼쪽 변수 = 오른쪽 변수 (식,값)
 *
 *  부호연산자
 *  단항 연산자 /// 변수의 부호를 유지하거나 바꿈 /// 실제 변수의 부호가 변하려면 대입 연산자를 사용해야함
 *
 *  산술연산자
 *  + 더하기      - 빼기      * 곱하기     / 나누기      % 몫,나머지 값
 *
 *  대입연산자
 *  += 두 항의 값을 더해서 왼쪽 항 대입       -= 왼쪽항에서 오른쪽항을 빼서 그 값을 왼쪽항에 대입
 *  일단은 두개만 알기
 *
 *  증감, 감소 연산자
 *  단항연산자 /// 변수의 값을 1 더하거나 1 뺄대 사용 /// 연산자가 항의 앞에 있는가 뒤에있는가에 따라 연산 시점과 결과가 달라짐
 *  문장의 끝; 을 기준으로 연산시점을 생각해야 함 .
 *  val = ++num; // 먼저 num 값이 1 증가한 후 val 변수에 대입
 *  val = num++; // val 변수에 기존 num값을 먼저 대입한 후 num 값 1 증가
 *
 *  -- 똑같음
 *
 *  */
public class Ch11 {
    public static void main(String[] args) {
        int myNum = 10;
        int yourNum = 20;
        myNum += yourNum; // myNum = myNum + yourNum
        System.out.println(myNum);

        int gameScore = 150;
        int lastScore = ++gameScore; // ; 이 끝나기 전에 +1을 한다. gameScore += 1 과 동일
        System.out.println(lastScore);
        System.out.println(gameScore);

        lastScore = gameScore++;    // ; 이 끝난다음에 증가를 시켜라
        System.out.println(lastScore);// 이때는 증가가 안됨
        System.out.println(gameScore); //lastScore한번 출력했으니 증가시키고 출력


    }
}
