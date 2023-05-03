package com.ohgiraffers.level02.normal;
import java.util.Random;
public class RandomMaker {
    public static int randomNumber(int min, int max){
        Random random = new Random();
        int randomNumber = random.nextInt(max) + min;

        return randomNumber;
    }
    public static String randomUpperAlphabet(int length) {
        Random random = new Random();
        String result = "";
        for (int i = 0; i < length; i++) {
            result += String.valueOf((char) ((random.nextInt(26)) + 65));
        }

        return result;
    }
    public static String rockPaperScissors(){
        Random random = new Random();
        String result = "";
        int randomNumber = random.nextInt(3) + 1;
        if(randomNumber == 1){
            result += "Rock";
        } else if (randomNumber == 2) {
            result += "Paper";
        } else result += "Scissors";

        return result;
    }
    public static String tossCoin(){
        Random random = new Random();
        String result = "";
        int randomNumber = random.nextInt(2) + 1;
        if(randomNumber == 1){
            result += "앞면";
        } else result += "뒷면";

        return result;
    }
}
