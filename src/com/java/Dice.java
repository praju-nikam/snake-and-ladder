package com.java;

import java.util.Random;

public class Dice
{
    int value;
    public Dice()
    {
        this.value = 0;
    }

    public int getDiceValue()
    {
        Random random = new Random();
        int value = random.nextInt(6)+1;
        return value;
    }
}
