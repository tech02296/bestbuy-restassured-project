package com.bestbuy.utiles;

import java.util.Random;

public class TestUtiles {
    public static String getRandomValue(){
        Random random = new Random();
        int randomInt = random.nextInt(100000);
        return Integer.toString(randomInt);
    }
}
