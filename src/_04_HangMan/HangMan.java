package _04_HangMan;

import java.util.Random;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	int lifeCounter = 5;

	/*
	 * Step 1: When the program starts, it will ask the user for a number (up to the
	 * total words in the file). Then the program will read that many words from the
	 * "dictionary.txt" file and push them to a Stack. Use the
	 * readRandomLineFromFile method in the Utilities class. The words should be
	 * selected randomly so not every game is played with the same set of words. You
	 * can use the Stack's contains() method to make sure there are no duplicate
	 * words.
	 */

	/*
	 * Step 2: Pop the word off the top of the stack and use a JLabel to display a
	 * blank line for all the characters in the word. Collect key inputs from the
	 * user. If the user guesses a letter, fill in the blank space. Otherwise, take
	 * off a life.
	 */

	void wordChoice() {
		panel.add(label);
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 100);
		int lives = 6;
		String lac = "";
		String ch = "";

		String number = JOptionPane.showInputDialog("Choose any number less than 266:");
		int num = Integer.parseInt(number);

		String word = Utilities.readRandomLineFromFile("dictionary.txt", num);

		String display = word;
		String line = "";
		/*
		 * for (int i = 0; i < display.length(); i++) { line+="_"; }
		 */
		// label.setText(line);
		
		for (int p = 0; p < display.length(); p++) {
			ch += "_";
		}
		
		while(lives>0) {
		String guess = JOptionPane.showInputDialog("Guess a letter:");

		
		boolean letterMatch = false;
		System.out.println(display);
		for (int i = 0; i < display.length(); i++) {
			char c = display.charAt(i);
			String character = String.valueOf(c);

			if (guess.equalsIgnoreCase(character)) {

				letterMatch = true;
				char[] displayArray = ch.toCharArray();
				displayArray[i] = c;
				ch= new String(displayArray);
				label.setText(ch);
			}
		}
		if (letterMatch) {
			JOptionPane.showMessageDialog(null, "correct");
		} else {
			JOptionPane.showMessageDialog(null, "wrong");
			lifeCounter = lifeCounter - 1;
		}
		String numOfLives = String.valueOf(lifeCounter);

		// label.setText("Lives: "+numOfLives+" "+line+ch+lac);

		/*
		 * Step 3: When a word has been solved, pop the next one off the stack and start
		 * a new round. It is up to you if you want to reset the lives.
		 */

		/*
		 * Step 4: If they run out of lives, give them a game over message.
		 */
		if (lifeCounter <= 0) {
			JOptionPane.showMessageDialog(null, "GAME OVER! YOU LOSE.");
		}
		}
		/*
		 * Step 5: Don't end the program on game over. Ask the user if they would like
		 * to play again and run the game again with new words if they choose yes.
		 */
	}

}