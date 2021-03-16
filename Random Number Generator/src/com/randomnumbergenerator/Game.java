package com.randomnumbergenerator;

import java.util.Random;
import java.util.Scanner;

public class Game {
	public int number;
    public int inputNumber;
    public int noOfGuesses=0;

    public int getNoOfGuesses() {
        return this.noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput(){
        System.out.println("Guess the number");
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you have guessed it right, it was %d\nYou guessed in %d attempts", number, noOfGuesses);
        }else if(inputNumber<number) {
            System.out.println("Number is less");
        }
        else if(inputNumber>number) {
            System.out.println("Number is Greater");
        }
        return false;
    }
}
