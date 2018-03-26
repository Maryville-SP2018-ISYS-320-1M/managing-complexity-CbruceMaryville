/*
  	ISYS 320
  	Name(s):Clayton Bruce
  	Date: 3/25/2018
  	
  	IM STRUGGLEING WITH THE NESTED LOOPS.. I GUESS IM PRETTY RUSTY I WILL BRING THIS TO CLASS ON MONDAY AND ASK FOR HELP! I UNDERSTAND IF IT WILL BE GRADED AS LATE
  	SEE YOU MONDAY!
*/



/* 2. Create a table below (just using text) that outlines your analysis of the figure. That is, how many
 * of each character on each line? What expression captures the relationship between the line number and
 * how many of the character is printed on each line? Choose your headings based on how you can break down
 * the figure.
  
Line Number		| HEADING		| HEADING		| HEADING		| HEADING		| HEADING		|	

22 Characters in a line 
4 // per after the first line 
+4 // per each line after 
4// to 20// total


22! -4 after first line
22! -4 more ever line after 



*/

/* 3. Using your analysis from above, in pseudocode describe the algorithm for how to draw the figure
 
 
 
 
 
 */

public class P2_SlashesAndBangs {

	public static void main(String[] args) {

		for(int i =0; i<22; i++) {
			System.out.print("!");
		}
		System.out.println();
		for(int i =0 ; i<2; i++) {
			System.out.print("/");
			for() {
				System.out.print();
			}
			
		}
	}

}
