package com.ohgiraffers.level01.basic;

public class Calculator {
    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    }
    public int sum1to10(){
        int sum = 0;
        for (int i=1; i<11; i++){
            sum += i;
        };
        return sum;
    }

    public void checkMaxNumber(int a, int b) {

        System.out.println("두 수 중 가장 큰 수는 : " + ((a > b)? a : b));
    }

    public int sumTwoNumber(int a, int b){
        return a+b;
    }

    public int minusTwoNumber(int a, int b){
        return a-b;
    }

}
