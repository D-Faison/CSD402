/*DeJanae Faison M5 4.13.25 */

public class Faison_M5 {
    //Largest in double array
    public static int[] locateLargest(double [][] arrayParam){
        //array that holds 2 intergers
        int[] dlocation = new int [2];
        //Declare max
        double max = arrayParam[0][0];

        //Iterate through the length of the rows
        for(int i = 0; i<arrayParam.length;i++){
            //For each row iterate through each column
            for(int j = 0; j < arrayParam[i].length;j++){
                //if the value of the variable through the iterations is the greatest
                //and greater than the declared max; store its location
                if (arrayParam[i][j]>max){
                    max = arrayParam[i][j];
                    dlocation[0]=i;
                    dlocation[1]=j;
                }
            }
        }

        return dlocation;
    }

    //Smallest in double array
    public static int[] locateSmallest(double [][] arrayParam){
        int [] dlocation = new int[2];
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length;j++) {
                if(arrayParam[i][j]<min){
                    min = arrayParam[i][j];
                    dlocation[0]=i;
                    dlocation[1]=j;
                }
            }
        }
        return dlocation;
    }
    //Largest Int location
    public static int[] locateLargest(int [][] arrayParam){
        int [] ilocation = new int[2];
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if(arrayParam[i][j]>max){
                    max = arrayParam[i][j];
                    ilocation[0] = i;
                    ilocation[1] = j;
                }
            }
            
        }
        return ilocation;
    }

    //Smallest Int Location
    public static int[] locateSmallest(int [][] arrayParam){
        int [] ilocation = new int[2];
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length;j++) {
                if(arrayParam[i][j]<min){
                    min = arrayParam[i][j];
                    ilocation[0]=i;
                    ilocation[1]=j;
                }
            }
        }
        return ilocation;
    }



    public static void main(String[] args) {
        
        //double array
        double[][] dArray = {
            {0.3,2.8,0.7},
            {2.9,1.7,0.4}
        };

        //interger array
        int[][] iArray ={
            {1,6,8},
            {4,4,2}
        };

        //Location of Largest double array
        int [] largeDLocation = locateLargest(dArray);
        System.out.println("Location of the Largest number in Double Array:");
        System.out.println("Row: "+largeDLocation[0]+"\nColumn: "+largeDLocation[1]);

        //Location of Smallest Double Array
        int [] smallestDLocation = locateSmallest(dArray);
        System.out.println("Location of the Smallest number in Double Array:");
        System.out.println("Row: "+smallestDLocation[0]+"\nColumn: "+smallestDLocation[1]);

        //Location of Largest Int Array
        int [] largestILocation = locateLargest(iArray);
        System.out.println("Location of the Largest number in Int Array:");
        System.out.println("Row: "+largestILocation[0]+"\nColumn: "+largestILocation[1]);

        //Location of Smallest Int Array
        int [] smallestILocation = locateSmallest(iArray);
        System.out.println("Location of the Smallest number in Int Array:");
        System.out.println("Row: "+smallestILocation[0]+"\nColumn: "+smallestILocation[1]);
    }
}
