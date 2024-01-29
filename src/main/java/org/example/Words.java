package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Words {

    protected static ArrayList<String> words = new ArrayList<>();
    private static final Random RANDOM = new Random();


    static {
        words.add("BASHFUL");
        words.add("GOODNESS");
        words.add("TURNIP");
        words.add("SUPERFLUOUS");
        words.add("TREMENDOUS");
        words.add("BAP");
        words.add("PSYCHE");
        words.add("IDIOM");
        words.add("GRACIOUS");
        words.add("POP");
        words.add("MUPPET");
        words.add("DO");
        words.add("ZOOLOGY");
        words.add("TECHNOLOGY");
    }
    public static String generateWord() {
        return words.get((int) (Math.random() * (words.size())));
    }
}


