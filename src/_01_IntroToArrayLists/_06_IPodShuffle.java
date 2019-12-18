package _01_IntroToArrayLists;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;

 
//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
			
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
		
	}
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
		_06_IPodShuffle e = new _06_IPodShuffle();
		e.Start();
	}
	
	JFrame frame = new JFrame("IPod");
	JPanel panel = new JPanel();
	JLabel currentSong = new JLabel();
	JButton shuffle = new JButton("Shuffle");
	JButton play = new JButton("Play");
	JButton stop = new JButton("Stop");
	ArrayList<Song> songs = new ArrayList<Song>();
	Random rand = new Random();
	int choosen = 0;
	
	
	void Start() {
		frame.setVisible(true);
		frame.setSize(200,200);
		frame.add(panel);
		panel.add(play);
		panel.add(stop);
		panel.add(shuffle);
		panel.add(currentSong);
		play.addActionListener(this);
		stop.addActionListener(this);
		shuffle.addActionListener(this);
		songs.add(new Song ("demo.mp3"));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton ButtonPressed = (JButton) arg0.getSource();
		
		if(ButtonPressed == play) {
			for (int i = 0; i < songs.size(); i++) {
				songs.get(i).stop();
			}
			songs.get(choosen).play();
		}
		
		if(ButtonPressed == stop) {
			for (int i = 0; i < songs.size(); i++) {
				songs.get(i).stop();
			}
		}
		
		if(ButtonPressed == shuffle) {
			for (int i = 0; i < songs.size(); i++) {
				songs.get(i).stop();
			}
			songs.get(rand.nextInt(songs.size())).play();
		}
	} 
	
	
	
	
	
	
	
	
	
	
	
}