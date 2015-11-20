package kops.pi;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class PiFrame extends JFrame{

	public PiFrame(){
		setTitle("");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Calculating...");
		
		Container contentPane = getContentPane();
		contentPane.add(label);
		
		PiCalculationThread thread = new PiCalculationThread(label);
		thread.start();		//start tells the OS to run
		
	}
	
	public static void main(String[] args){
		new PiFrame().setVisible(true);
	}
}