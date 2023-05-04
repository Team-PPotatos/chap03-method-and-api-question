package com.ppotatos.level01.basic;

public class Calculator {

    /* 반환형과 매개변수 유무에 따라 메소드 작성, 이를 호출 or 출력 */
    public void checkMethod() {

        /* 함수 호출 확인용 메서드 */
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10() {

        /* 1부터 10까지의 수를 더하여 값을 리턴 */
        int sum = 0;

        for(int i = 1; i<=10; i++){
            sum += i;
        }

        return sum;
    }

    public void checkMaxNumber(int a, int b) {

        /* 두 수를 입력받아 큰 수를 출력 */
        int max = Math.max(a, b);
        System.out.println("두 수 중 큰 수는 " + max + "이다.");
    }

    public int sumTwoNumber(int a, int b) {

        /* 두 수를 입력받아 합을 리턴 */

        return a + b;
    }

    public int minusTwoNumber(int a, int b) {

        /* 두 수를 입력받아 차를 리턴 */

        return a - b;
    }
}
