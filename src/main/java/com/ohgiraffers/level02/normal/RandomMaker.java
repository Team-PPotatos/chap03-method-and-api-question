package com.ohgiraffers.level02.normal;

public class RandomMaker {
    public static int randomNumber(int min, int max) {
        int randNum = (int) (Math.random() * max) + min;
        return randNum;
    }

    public static String randomUpperAlphabet(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = (char) ('A' + Math.random() * ('Z' - 'A' + 1));
            sb.append(c);
        }
        return sb.toString();
    }

    public static String rockPaperScissors() {
        String[] rockPS = {"가위", "바위", "보"};
        int result = (int) (Math.random() * 3) + 1;
        return rockPS[result];
    }

    public static String tossCoin() {
        String[] coin = {"앞면", "뒷면"};
        int result = (int) (Math.random() * 2) + 1;
        return coin[result];
    }
}
