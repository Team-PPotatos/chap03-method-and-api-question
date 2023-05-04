package com.ppotatos.level02.normal;

import java.util.Random;

public class RandomMaker {
    public static int randomNumber(int min, int max) {

        /* 최소값부터 최대값까지 범위의 난수 반환 */
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }

    public static String randomUpperAlphabet(int length) {

        /* 인자의 길이만큼의 랜덤한 대문자 알파벳으로 이루어진 문자열을 반환 */
        StringBuilder str = new StringBuilder();
        Random rand = new Random();
        for(int i = 0; i<length; i++) {
            str.append((char)(rand.nextInt('Z' - 'A' + 1) + 'A'));
        }

        return str.toString();
    }

    public static String rockPaperScissors() {

        /* 가위, 바위, 보 중 한 가지를 반환한다. */
        Random rand = new Random();
        int randomNum = rand.nextInt(3);

        if (randomNum == 0) {
            return "가위";
        } else if (randomNum == 1) {
            return "바위";
        } else {
            return "보";
        }
    }

    public static String tossCoin() {

        /* 동전의 앞면, 뒷면 중 한 가지를 반환 */
        Random rand = new Random();

        if (rand.nextBoolean()) {
            return "앞면";
        } else {
            return "뒷면";
        }
    }
}
