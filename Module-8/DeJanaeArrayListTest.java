//DeJanae Faison 4.27.25 M8 assignment
//Max number array

import java.util.ArrayList;
import java.util.Scanner;

public class DeJanaeArrayListTest {

    //Find Max in list
    public static Integer max( ArrayList<Integer>list){
        //List Empty? Return 0
        if(list == null){
            return 0;
        }

        //set the maximum to the first listed item 
        Integer maximum = list.get(0);
        //for each number in the list
        //if the number is bigger than the last; set it to the maximum
        for (Integer num : list) {
            if(num > maximum){
                maximum = num;
            }
        }

        return maximum;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        //Array List for User to Populate
        ArrayList<Integer> numberList = new ArrayList<>();
        //User Input System
        Scanner userInput = new Scanner(System.in);

        System.out.println("~MAX VALUE EVALUATOR~\n ENTER 0 TO END PROGRAM");
        System.out.println("--ENTER NUMBERS:");

        //Loop so User can continue to list numbers
        while (true) { 
            //We dont want any decimals, check if user inputs whole number
            try {
                // convert the string numeral to an actual integer
                int number = Integer.parseInt(userInput.nextLine());
                //add the int to the number list
                numberList.add(number);
                //If user inputs 0; break the cycle
                if(number == 0){
                    break;
                }

                //if user inputs decimal;throw error message
            } catch (NumberFormatException e) {

                System.out.println("!!PLEASE ONLY ENTER INTEGERS!!");
            }
        }

        System.out.println(numberList);
        userInput.close();
        //Send list through max function
       Integer maxNumFromList = max(numberList);
        
       System.out.println(maxNumFromList);
    }
    
}
