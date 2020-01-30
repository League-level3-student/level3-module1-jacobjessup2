package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.*;
public class HangMan implements KeyListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	String display = "";
	String word = "";
	Stack<String> words = new Stack<String>();
	
	public static void main(String[] args) {
		HangMan e = new HangMan();
		e.setup();
	}
	void setup(){
		frame.setVisible(true);
		frame.addKeyListener(this);
		frame.setSize(500,500);
		frame.add(panel);
		panel.add(label);
	}
	
	void wordChoice() {
		String leroy = JOptionPane.showInputDialog("give me a number between 1 and 266");
		int jenkins = Integer.parseInt(leroy);
		for (int i = 0; i < jenkins; i++) {
			words.push(Utilities.readRandomLineFromFile("dictionary.txt"));
		}
		String display = words.pop();
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		
	}
	
	@Override
	public void keyReleased(KeyEvent arg0) {
				
	}
	
	@Override
	public void keyTyped(KeyEvent arg0) {
				
	}
	
}
