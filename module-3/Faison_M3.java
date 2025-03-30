public class Faison_M3 {
    public static void main(String[] args) {

		int startRight = 0,	// Initialize decending numbers
			 endSpace = 7;		// Initialize number of white space in row

		//StringBuilder sb = new StringBuilder();

		// Display number of rows and numbers in each row
		for (int row = 1; row <= 64; row += row) {
			// Display white space
			for (int startSpace = 0; startSpace < endSpace; startSpace++) {
				System.out.print("    ");
			}
			// Display acending numbers
			for (int l = 1; l <= row; l += l) {
				System.out.printf("%4d", (l));
			}
			
			// Display decending numbers
			for (int r = startRight; r > 0 ; r /= 2 ) {
				System.out.printf("%4d", (r));	
			}


			System.out.println();	// End line
			endSpace--; 				// Decrement endSpace
			startRight = row;			// Assign row to startRight

		}



    }
}
/*Resources: */
/*https://github.com/jsquared21/Intro-to-Java-Programming/blob/master/Exercise_05/Exercise_05_19/Exercise_05_19.java */
/*jsquared21. (2015). Intro-to-Java-Programming/Exercise_05/Exercise_05_19/Exercise_05_19.java at master · jsquared21/Intro-to-Java-Programming. GitHub. https://github.com/jsquared21/Intro-to-Java-Programming/blob/master/Exercise_05/Exercise_05_19/Exercise_05_19.java

 */