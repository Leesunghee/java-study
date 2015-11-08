package com.understudy.java.chapter6;

import java.util.Random;

/**
 * Created by sunghee on 2015. 11. 2..
 */
public class RandomExample {
    private final int randomRange = 10;
    private int loopCount = 1000000;
    private int[] randomTable = new int[randomRange];
    private Random random = new Random(2);

    public static void main(String[] args) {
        RandomExample example = new RandomExample();
        example.init();
        example.generate();
        example.printStatus();
    }

    private void printStatus() {
        for (int i = 0; i < randomTable.length; i++) {

            System.out.println("Random value ("+ i+ ") = " + randomTable[i]);
        }
    }

    private void generate() {
        for (int i = 0; i < loopCount; i++) {
            int randomVlu = random.nextInt(randomRange);
            randomTable[randomVlu]++;

        }
    }

    private void init() {
        for (int i = 0; i < randomTable.length; i++) {
            randomTable[i] = 0;

        }
    }
}
