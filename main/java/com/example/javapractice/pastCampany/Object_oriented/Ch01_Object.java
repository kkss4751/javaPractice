package com.example.javapractice.pastCampany.Object_oriented;

/** 학생 클래스*/
public class Ch01_Object {
    /* 멤버변수 */
    /*class Student 학생클래스로 만듬 */

    int studentNumber; //학생번호
    String studentName; //학생이름
    int majorCode; //전공번호
    String majorName; //전공이름
    int grade; //학
}

/** 주문 클래스 */
class Order {
    int orderId; //주문아이디
    String buyerId; //산사람 (회원아이디)
    String sellerId; //판매자
    int productId; //뭐를 샀는지
    String orderDate; //언제 샀는지
}

/** 회원정보 */
class UserInfo {
    String userId; //아이디
    String userPassword; //비밀번호
    String username; //유저이름
    String address; //유저주소
    int phoneNumber; //휴대폰번호
}

/*객체지향 프로그램을 할 때는
*
* 객체를 정의하고
* 각 객체의 속성을 멤버변수로 역할을 메서드로 구현하고 (기능 , 함수 메서드)
* 각 객체간의 협력을 구현한다. (각 사이의 인터렉션을 구현하면 객체지향프로그램)
* */

/*클래스 코딩하기
*
* 클래스는 대문자로 시작하는게 일반적이고
* java파일 하나에 클래스는 여러개가 있을 수 있지만 public 클래스는 하나이고 .java 파일의 이름은 동일해야함
* camel notaion 방식으로 명명
* */