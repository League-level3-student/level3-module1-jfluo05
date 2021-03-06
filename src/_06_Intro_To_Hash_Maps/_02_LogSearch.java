package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener{

	// Crate a HashMap of Integers for the keys and Strings for the values.
	HashMap<Integer, String> hm = new HashMap<Integer, String>();
	JFrame frame=new JFrame();
		JPanel panel= new JPanel();
		JButton button= new JButton();
		JButton button2= new JButton();
		JButton button3= new JButton();
		int id;
		
		public static void main(String[] args) {
			_02_LogSearch ls= new _02_LogSearch();
			ls.GUI();
		}
	// Create a GUI with three buttons.
	void GUI() {
		
		
		frame.setVisible(true);
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		frame.add(panel);
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button.setText("button 1");
		button2.setText("button 2");
		button3.setText("button 3");
		frame.pack();
	}
	// When this is complete, add a fourth button to your window.
	// Button 4: Remove Entry
	// When this button is clicked, prompt the user to enter an ID using an input
	// dialog.
	// If this ID exists in the HashMap, remove it. Otherwise, notify the user that
	// the ID
	// is not in the list.
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// Button 1: Add Entry	
		// When this button is clicked, use an input dialog to ask the user to enter an
	// ID number.
	// After an ID is entered, use another input dialog to ask the user to enter a
	// name.
	// Add this information as a new entry to your HashMap.
		if(e.getSource()==button) {
	
		String idNum=JOptionPane.showInputDialog("enter an ID number:");
		id=Integer.parseInt(idNum);
		String name=JOptionPane.showInputDialog("enter a name:");
		hm.put(id, name);
		
	
	
	// Button 2: Search by ID
	// When this button is clicked, use an input dialog to ask the user to enter an
	// ID number.
	// If that ID exists, display that name to the user.
	// Otherwise, tell the user that that entry does not exist.
		}
		
			if(e.getSource()==button2) {
				String idNum2=JOptionPane.showInputDialog("enter an ID number:");
				int id2=Integer.parseInt(idNum2);
				
					for(int i:hm.keySet()){
						if (i==id) {
							JOptionPane.showMessageDialog(null,hm.get(i));
						
					}
				}
		}
			
	
	// Button 3: View List
	// When this button is clicked, display the entire list in a message dialog in
	// the following format:
	// ID: 123 Name: Harry Howard
	// ID: 245 Name: Polly Powers
	// ID: 433 Name: Oliver Ortega
	// etc...
			if(e.getSource()==button3) {
				
				for(int f:hm.keySet()){
					JOptionPane.showMessageDialog(null, "ID: "+f+" Name: "+hm.get(f));
				
			}
	}
	}}

