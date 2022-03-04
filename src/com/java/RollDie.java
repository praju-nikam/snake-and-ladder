package com.java;

import java.util.Random;
//player rolls the Die to get a number between 1 to 6
public class RollDie
{
    public static void main(String args[])
    {
        for( int i = 0; i<10; i++ )
        {
            Random random = new Random();
            int result = random.nextInt(6) + 1;
            System.out.println("You Rolled Die : " + result);
        }
    }
}
