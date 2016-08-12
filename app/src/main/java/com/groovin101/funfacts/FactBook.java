package com.groovin101.funfacts;

import java.util.Random;

/**
 * Created by b on 7/15/2016.
 */

public class FactBook {

    private final String[] factRepo = new String[] {
            "Action drives growth",
            "Embrace what is difficult",
            "Use past pain as fuel to drive you forward",
            "Family is awesome",
            "Life is finite and very short",
            "Most people sleep their lives away",
            "Ambition over comfort",
            "Paint yourself in beautiful colors",
            "The world will not wait for you",
            "No one is coming to save you. Only you can save you",
            "Never give in",
            "Ideas abound, but actions are few",
            "Just do it",
            "Love is our hope"
    };

    public String getAFact() {
        int randomNumber = factRepo.length+1;
        while (randomNumber >= factRepo.length) {
            randomNumber = new Random().nextInt(factRepo.length*2);
        }

        return factRepo[randomNumber];
    }
}
