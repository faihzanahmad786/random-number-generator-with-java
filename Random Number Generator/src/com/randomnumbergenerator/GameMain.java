package com.randomnumbergenerator;

public class GameMain {
	public static void main(String[] args) {
        Game g = new Game();
        boolean b=false;

        while(!b){
        g.takeUserInput();
        b = g.isCorrectNumber();
        }
    }
}
