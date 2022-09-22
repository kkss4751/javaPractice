package com.example.javapractice.codeUp;

public class CodeUp1001_1008 {
        /** CodeUp1001
         * [기초- 출력] 출력하기 01 */
        public static void main(String[] args) {
            System.out.println("Hello");
        }
}
/** [기초- 출력] 출력하기 02 */
class CodeUp1002 {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

/** [기초- 출력] 출력하기 03 */
class CodeUp1003 {
    public static void main(String[] args) {
        System.out.printf("Hello \nworld");
    }
}

/** [기초- 출력] 출력하기 04 */
class CodeUp1004 {
    public static void main(String[] args) {
        System.out.printf("\'Hello\'");
    }
}

/** [기초- 출력] 출력하기 05 */
class CodeUp1005 {
    public static void main(String[] args) {
        System.out.printf("\"Hello World\"");
    }
}

/** [기초- 출력] 출력하기 06 */
class CodeUp1006 {
    public static void main(String[] args) {
        System.out.println("\"!@#$%^&*()\"");

        /** 퍼센트 % 기호가 앞에 붙는 문자를 형식 지정자 (format specifier)라고 하며,
         *  그 위치에서 지정한 형식으로 값을 출력해준다.
         *  따라서, 퍼센트 문자 % 를 출력하기 위해서는 %%로 출력해 주어야 한다. */
        System.out.printf("\"!@#$%%^&*()\"");
    }
}

/** [기초- 출력] 출력하기 07 */
class CodeUp1007 {
    public static void main(String[] args) {
        System.out.println("\"C:\\Download\\hello.cpp\"");
    }
}

/** [기초- 출력] 출력하기 09
 *  유니코드라 외울수 없음. */
class CodeUp1008 {
    public static void main(String[] args) {
        System.out.printf("\u250C\u252C\u2510\n");
        System.out.printf("\u251C\u253C\u2524\n");
        System.out.printf("\u2514\u2534\u2518\n");
    }
}

