/*DeJanae Faison 3/30/2025 Assignment 2*/
/*Rock Paper Scissors*/

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors{

    public static void main(String[] args) {
        //set array if possible inputs
        int[] gameInput = {1,2,3};
        int Computer;



        Random random = new Random();
        //Plus 1 since it was doing 0-2
        Computer = random.nextInt(gameInput.length)+1;

        Scanner scInput = new Scanner(System.in);

        System.out.println("Rock Paper Scissors!");
        System.out.println("Rock = 1 \nPaper = 2 \nScissors = 3");
        System.out.print("Enter either 1,2, or 3: ");

        
        int playerInput = scInput.nextInt();
        

        String playerChoice = "";

        //Depending on Player Input; display appropriate sign
        switch(playerInput){
            case 1 -> playerChoice = "Rock";
            case 2 -> playerChoice = "Paper";
            case 3 -> playerChoice = "Scissors";
        }
        //Depending on Computer Random; display appropriate sign
        String computerChoice = "";

        switch(Computer){
            case 1 -> computerChoice = "Rock";
            case 2 -> computerChoice = "Paper";
            case 3 -> computerChoice = "Scissors";
        }

        

        if (playerInput == Computer) {

            System.out.println("TIE");
        } 
        //Multiple conditions ||=or  and display the message
        else if ((playerInput == 1 && Computer ==2)||(playerInput == 2 && Computer == 3)||(playerInput == 3 && Computer == 1)) {
            
            System.out.println("Computer: "+ computerChoice);
            System.out.println("You: "+ playerChoice);
            System.out.println("YOU LOSE");
            
        }
        else{
            System.out.println("Computer: "+ computerChoice);
            System.out.println("You: "+ playerChoice);
            System.out.println("YOU WIN!");
        }
        scInput.close();
    }
}