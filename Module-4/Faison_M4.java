/*DeJanae Faison
 * Assignnment M4 4/6/25
 * Overload Array Average
 */

/*To properly print out the arrays */
import java.util.Arrays;

public class Faison_M4 {
    //Function for Double Arrays
    public static double average(double[]array){
        //Initialize sum and average
        double sum = 0;
        double averg = 0;

        //Check if the array is empty or null
        if((array == null)||(array.length == 0)){
            System.err.println("Array is Null or Empty");
        }else{
            for(double num : array){
                sum += num;
            }
            averg = sum/array.length;
        }
        return averg;
    }

    //Funtion for Long Arrays
    public static long average(long [] array){
        //Initialize sum and average
        long sum = 0;
        long averg = 0;

        //Check if the array is empty or null
        if((array == null)||(array.length == 0)){
            System.err.println("Array is Null or Empty");
        }else{
            //if not empty or null calculate average
            for(long num : array){
                sum += num;
            }
            averg = sum/array.length;
        }
        return averg;
    }

    //Function for Interger Arrays
    public static int average(int [] array){
        //Initialize sum and average
        int sum = 0;
        int averg = 0;

        //Check if the array is empty or null
        if((array == null)||(array.length == 0)){
            System.err.println("Array is Null or Empty");
        }else{
            for(int num : array){
                sum += num;
            }
            averg = sum/array.length;
        }
        return averg;
    }

    //Function for Short Arrays
    public static  short average(short []array){
        //Initialize sum and average
        short sum = 0;
        short averg = 0;

        //Check if the array is empty or null
        if((array == null)||(array.length == 0)){
            System.err.println("Array is Null or Empty");
        }else{
            for(short num : array){
                sum += num;
            }
            averg = (short)(sum/array.length);
        }
        return averg;
    }

    
    public static void main(String [] args){
        //Initialize Double Array and determine it's values
        double [] doubleArray = null;
        doubleArray = new double[]{10,20,30};

        //Long Array
        long [] longArray = null;
        longArray = new long[]{10,20,30,40,50,60,70};

        //Interger Array
        int [] intergerArray = null;
        intergerArray = new int[]{};

        //Short Array
        short [] shortArray = null;
        shortArray = new short[]{10,20,30,40,50};

        //Print initial Array and it's Average
        System.err.println("");
        //Double Array
        System.out.println("Double Array:"+ Arrays.toString(doubleArray) );
        System.out.println("Average Double Array: "+ average(doubleArray));
        //Line break
        System.err.println("");

        //Long Array Print
        System.out.println("Long Array:"+ Arrays.toString(longArray) );
        System.out.println("Average Long Array: "+ average(longArray));

        System.err.println("");

        //Interger Array Print
        System.out.println("Interger Array:"+ Arrays.toString(intergerArray) );
        System.out.println("Average Interger Array: "+ average(intergerArray));

        System.err.println("");
        
        //Short Array Print
        System.out.println("Short Array:"+ Arrays.toString(shortArray) );
        System.out.println("Average Short Array: "+ average(shortArray));

        System.err.println("");
    }

}
