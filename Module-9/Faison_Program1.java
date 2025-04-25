//DeJanae Faison 4/27/25 M9
//Program 1: View Array List

import java.util.ArrayList;
import java.util.Scanner;

public class Faison_Program1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        //initialize array list
        ArrayList<String> flowers = new ArrayList<>();
        flowers.add("Venus Flytrap");
        flowers.add("Sundews");
        flowers.add("Tropical Pitcher");
        flowers.add("Trumpet Pitcher");
        flowers.add("Butterworts");
        flowers.add("Bladderwort");
        flowers.add("Drosera Capensis");
        flowers.add("California Pitcher");
        flowers.add("Purple Pitcher");
        flowers.add("Cephalotus");

        //Print numbered list of array
        System.out.println("~~~~~~*| Carnivorous Plants |*~~~~~~");
        int index = 0;
        for (String flower : flowers){
            System.out.println(index +". " +flower);
            index++;
        }

        //New Scanner for user input
        Scanner userInput = new Scanner(System.in);
        System.out.println("Which element would you like to see again?\nEnter between 0-9: ");
        String desiredElement = userInput.nextLine();

        try {

            //convert user string to int
            int userIndex = Integer.parseInt(desiredElement);

            //Autoboxing- int to integer
            Integer boxedInteger = userIndex;
            //Unboxing - interger to int
            int unboxedIndex = boxedInteger;
            
            System.out.println("Element:"+unboxedIndex+"\n"+ flowers.get(unboxedIndex) );
            
        // do not accept anything beyond the index 0-9
        } catch (IndexOutOfBoundsException e) {

            System.out.println("!!Error: Request out of Bounds!!");

        // make sure not to accept anything other than a number
        } catch (NumberFormatException e){

            System.out.println("!!Please enter valid number!!");
        }

        //Close scanner
        userInput.close();
    }
}
