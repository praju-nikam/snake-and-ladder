package com.java;

import java.util.Scanner;

public class Game
{
    public static void main( String args[] )
    {
        Scanner sc = new Scanner(System.in);
        Board board = new Board();
        int n;

        boolean Player1Turn = true;
        board.display();
        System.out.println( "Player1's Current Position = "+board.player1.position );
        System.out.println( "Player2's Current Position = "+board.player2.position );
        while( !board.gameOver() )
        {
            if( Player1Turn )
            {
                Player1Turn = false;
                System.out.println( "Player1's Turn" );
                System.out.println( "To throw dice Enter 1\nTo quit game Enter 0\n" );
                n = sc.nextInt();
                if( n == 1 )
                {
                    board.display();
                    board.throwDice( "player1" );
                }
                else if( n == 0 )
                {
                    System.exit(0);
                }
                else
                {
                    System.out.println( "Invalid Response!\n" );
                    Player1Turn = true;
                }
            }
            else
            {
                Player1Turn = true;
                System.out.println( "Player2's Turn" );
                System.out.println( "To throw dice Enter 1\nTo quit game Enter 0\n" );
                n = sc.nextInt();
                if( n == 1 )
                {
                    board.display();
                    board.throwDice( "player2" );
                }
                else if( n == 0 )
                {
                    System.exit(0);
                }
                else
                {
                    System.out.println( "Invalid Response!" );
                    Player1Turn = false;
                }
            }
        }
    }

}
