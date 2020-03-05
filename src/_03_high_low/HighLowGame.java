//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _03_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(101);
		
		// 2. Print out the random variable above
		   System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess a number using a pop-up window, and save their response 
		  String answer = JOptionPane.showInputDialog("Guess a number from 1 to 100");           
                     
            // 4. Convert the users’ answer to an int (Integer.parseInt(string))
		  int number=Integer.parseInt(answer);  
          
			// 5. if the guess is correct
	 if( number ==random ) {
		
		 // 6. Win
		 JOptionPane.showMessageDialog(null, "You guessed the number correctly");
		// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer
		 System.exit(0);
	 }
				// 7. if the guess is high
	 else if(number > random) {			
	 // 8. Tell them it's too high
	 JOptionPane.showMessageDialog(null, "Your guess was too high");
	 }
	 
			// 9. if the guess is low
	 else if(number < random) {		
				// 10. Tell them it's too low
		 JOptionPane.showMessageDialog(null, "Your guess was too low");
	 }
		// 13. Tell them they lose
	 
		
	}

}


