package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.*;
public class HangMan implements KeyListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	String display = "";
	String word = "";
	String guessed = "";
	int lives = 6;
	Stack<String> words = new Stack<String>();
	
	public static void main(String[] args) {
		HangMan e = new HangMan();
		e.setup();
		e.wordChoice();
		e.shownWord();
	}
	void setup(){
		frame.setVisible(true);
		frame.addKeyListener(this);
		frame.setSize(100,100);
		frame.add(panel);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		
	}
	
	void wordChoice() {
		String leroy = JOptionPane.showInputDialog("give me a number between 1 and 266");
		int jenkins = Integer.parseInt(leroy);
		for (int i = 0; i < jenkins; i++) {
			words.push(Utilities.readRandomLineFromFile("dictionary.txt"));
		}
		word = words.pop();
	}
	
	void shownWord() {
		for (int i = 0; i < word.length(); i++) {
			if(word.substring(i,i+1) == " ") {
				display = display + " ";
			}
			else {
				display = display + "-";
			}
		}
		label1.setText(display);
		label2.setText("lives left: "+lives);
		label3.setText("letters guessed: "+guessed);
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		int check = 0;
		guessed = guessed + arg0.getKeyChar();
		label3.setText("letters guessed: "+guessed);
		for (int i = 0; i < word.length(); i++) {
			if(arg0.getKeyChar() == word.charAt(i)) {
				check += 1;
				display = display.substring(0,i) + word.charAt(i) + display.substring(i+1);
			}
		}

		label1.setText(display);
		
		if(check == 0) {
			lives--;
			label2.setText("lives left: "+lives);
		}
		
		if(lives == 0) {
			JOptionPane.showMessageDialog(null, "You have RUN OUT of LIVES. The GAME will now CLOSE.");
			System.exit(0);
		}
		
		if(display.equals(word)) {
			JOptionPane.showMessageDialog(null, "You COMPLETED the WORD! CREATING new WORD.");
			display = "";
			word = words.pop();
			shownWord();
		}
		
	}
	
	@Override
	public void keyReleased(KeyEvent arg0) {
				
	}
	
	@Override
	public void keyTyped(KeyEvent arg0) {
				
	}
	
}
