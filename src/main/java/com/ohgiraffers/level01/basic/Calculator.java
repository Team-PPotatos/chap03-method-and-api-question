package com.ohgiraffers.level01.basic;

public class Calculator {
    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    }
    public void sum1to10(){
        int sum = 0;
        for (int i=1; i<11; i++){
            sum += i;
        };
        System.out.println("1부터 10까지의 합: " + sum);
    }

    public int checkMaxNumber(int a, int b) {
        return (a > b)? a : b;
    }

    public int sumTwoNumber(int a, int b){
        return a+b;
    }

    public int minusTwoNumber(int a, int b){
        return a-b;
    }

}
