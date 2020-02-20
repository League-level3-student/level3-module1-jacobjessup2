package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.*;

public class _02_LogSearch implements ActionListener {
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Add Entry");
	JButton button2 = new JButton("Search by ID");
	JButton button3 = new JButton("View List");
	JButton button4 = new JButton("Remove Entry");
	HashMap<Integer, String> hash = new HashMap<Integer, String>();
	
	public static void main(String[] args) {
		_02_LogSearch e = new _02_LogSearch();
		e.start();
	}
	
	void start(){
		frame.setVisible(true);
		frame.setSize(100,125);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		//Button 1
		 if(arg0.getSource() == button1) {
			 String keyStr = JOptionPane.showInputDialog("Enter an ID number.");
			 String val = JOptionPane.showInputDialog("Enter a name.");
			 int ke = Integer.parseInt(keyStr);
			 hash.put(ke, val);
		 }
	
		 
		 //Button 2
		 if(arg0.getSource() == button2) {
			 String search = JOptionPane.showInputDialog("Enter an ID number.");
			 int Search = Integer.parseInt(search);
			 JOptionPane.showMessageDialog(null, hash.get(Search));
		 }
		 
		 
		 //Button 3
		 if(arg0.getSource() == button3) {
			 String display = "";
			 for (Integer i : hash.keySet()) {
				display = display + "ID: " + i + "  Name: " + hash.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, display);
		 }
	}
	
		
	
}
