package com.ohgiraffers.level02.normal;


public class RandomMaker {

    public static void main(String[] args) {

    }
    public static int randomNumber(int min, int max ) {
        int random = (int) (Math.random() * (max-min+1)) + min;

        return random;
    }

    public static String randomUpperAlphabet(int length) {
        String randomAlpha = "";

        for (int i = 1; i <= length; i++) {
            char random = (char) ((Math.random() * 26) + 65);
            randomAlpha = randomAlpha +  random;
        }

        return randomAlpha;
    }

    public static String rockPaperScissors() {
        String[] random = {"가위", "바위", "보"};

        int idx = (int)(Math.random()*3);
        return random[idx];
    }

    public static String tossCount(){
        String[] random = {"앞면", "뒷면"};
        int idx = (int)(Math.random()*2);

        return random[idx];
    }

}
