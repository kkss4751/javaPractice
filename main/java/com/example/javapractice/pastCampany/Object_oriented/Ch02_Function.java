package com.example.javapractice.pastCampany.Object_oriented;

/* 함수 */
public class Ch02_Function {

    public static int addNum(int num1, int num2){

        int result;
        result = num1 + num2;
        return result;
    }

    public static void sayHello(String greeting){
        System.out.println(greeting);
    }
    public static int calcSum(){
        int sum = 0;

        for (int i = 0; i<=100; i++){
            sum += i;
        }
        return sum;
    }


    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        //위의 두개의 값을 밑에 addNum에 넣어준다

        int total = addNum(n1, n2);
        System.out.println(total);

        sayHello("안녕하세요");

        total = calcSum();
        System.out.println(total);
    }
}
