package _03_IntroToStacks;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener{
	
	 // Create a JFrame with a JPanel and a JLabel.
	 JFrame frame= new JFrame();
	 JPanel panel= new JPanel();
	 JLabel label= new JLabel();
	 Stack<String> characterStack = new Stack<String>();
	 String stringCharacters= new String();
	 
	 public static void main(String[] args) {
		_02_TextUndoRedo tur= new _02_TextUndoRedo();
		tur.GUI();
	}
	 
	 void GUI() {
		 frame.add(panel);
		 frame.setVisible(true);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.add(label); 
		 frame.addKeyListener(this);
		 frame.setSize(400, 400);
	 }
	 // Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub		
		char character=e.getKeyChar();
		if(character=='\b') {
			String char1= stringCharacters.charAt(stringCharacters.length()-1)+"";
			stringCharacters=stringCharacters.substring(0,stringCharacters.length()-1);
			characterStack.push(char1);
		}else if(character==KeyEvent.VK_ENTER) {
			String char2=characterStack.pop();
			stringCharacters+=char2;
		}else {
			stringCharacters+=character;
		}
		label.setText(stringCharacters);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	 
	 //Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 //Save that deleted character onto a Stack of Characters.
	
	
	 
	 // Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 // off the Stack and added back to the JLabel.
	
	
	
}
