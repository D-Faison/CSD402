/*DeJanae Faison 3/30/2025 Assignment 2*/
/*Rock Paper Scissors */

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors{

    public static void main(String[] args) {
        
        int[] gameInput = {1,2,3};
        int Computer;

        Random random = new Random();
        //Plus 1 since it was doing 0-2
        Computer = random.nextInt(gameInput.length)+1;

        Scanner scInput = new Scanner(System.in);

        System.out.println("Rock Paper Scissors!");
        System.out.println("Rock = 1 \nPaper = 2 \nScissors = 3");
        System.out.println("Enter either 1,2, or 3: ");

        int playerInput = scInput.nextInt();
        scInput.close();

        //look up switch and cases

        if (playerInput == Computer) {

            System.out.println("TIE");
        } 
        else if ((playerInput == 1 && Computer ==2)||(playerInput == 2 && Computer == 3)||(playerInput == 3 && Computer == 1)) {
            
            System.out.println("Computer:"+Computer);
            System.out.println("You"+playerInput);
            System.out.println("LOSER");
            
        }
        else{
            System.out.println("Computer:"+Computer);
            System.out.println("You"+playerInput);
            System.out.println("YOU WIN!");
        }
        
    }
}