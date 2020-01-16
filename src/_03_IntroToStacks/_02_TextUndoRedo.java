package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.*;

public class _02_TextUndoRedo implements KeyListener {
	
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	String labelString = "";
	Stack<String> undo = new Stack<String>();
	public static void main(String[] args) {
		_02_TextUndoRedo e = new _02_TextUndoRedo();
		e.Startup();
	}

	void Startup(){
		frame.setVisible(true);
		frame.setSize(500,50);
		frame.add(panel);
		panel.add(label);
		frame.addKeyListener(this);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == e.VK_BACK_SPACE) {
			undo.push(labelString.substring(labelString.length()-1));
			labelString = labelString.substring(0,labelString.length()-1);
			System.out.println(undo.get(undo.size()-1));
		}
		
		else if(e.getKeyCode() == e.VK_CONTROL){
			System.out.println(undo.get(undo.size()-1));
			labelString = labelString + undo.pop();
		}
		
		else{
			labelString = labelString + e.getKeyChar();
		}
		
		label.setText(labelString);
	}

	private void elseif(boolean b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}







}
