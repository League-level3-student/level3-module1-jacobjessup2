package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.ShutdownChannelGroupException;
import java.util.ArrayList;

import javax.swing.*;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton("Add Name");
	JButton view = new JButton("View Names");
	ArrayList<String> list = new ArrayList<String>();
	
	
	public static void main(String[] args) {
		_02_GuestBook e = new _02_GuestBook();
		e.GUI();
	}
	
	void GUI() {
	frame.add(panel);
	panel.add(add);
	panel.add(view);
	
	frame.setVisible(true);
	add.addActionListener(this);
	view.addActionListener(this);
	list.add("Bob Banders");
	list.add("Sandy Summers");
	list.add("Greg Ganders");
	list.add("Donny Doners");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton ButtonPressed = (JButton) arg0.getSource();
		
		if(ButtonPressed == add) {
			String name = JOptionPane.showInputDialog("Add a Name to the List");
			list.add(name);
		}
		
		if(ButtonPressed == view) {
			
		}
	}
	
	
	
	
	
}
