package com.ohgiraffers.level01.basic;

class Calculator {
    public void checkMethod() {
        System.out.println("메소드 호출 확인");

    }

    public int sum1to10() {
        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    public void checkMaxNumber(int a, int b) {
        int large = a > b ? a : b;
        System.out.println("두 수 중 큰 수는 " + large + "이다.");
    }

    public int sumTwoNumber(int a, int b){
        int sum  = a + b;
        return sum;
    }

    public int minusTwoNumber(int a, int b) {
        int minus = a > b ? a - b : b - a;
        return minus;
    }
}