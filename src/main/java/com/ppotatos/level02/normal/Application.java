package com.ppotatos.level02.normal;

public class Application {
    public static void main(String[] args) {

        /* RandomMaker 클래스에 있는 각 메소드를 호출 */
        System.out.println(RandomMaker.randomNumber(-50, 50));
        System.out.println(RandomMaker.randomUpperAlphabet(20));
        System.out.println(RandomMaker.rockPaperScissors());
        System.out.println(RandomMaker.tossCoin());
    }
}
