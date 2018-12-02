package com.sample;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Interface {
	
	private static JFrame frame;
	
	public static int askQuestion(String questionValue) {
		
		String[] options = {"No","Yes"};
		
		int n = JOptionPane.showOptionDialog(
            frame,
            questionValue,
            "",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]
		);
		
		return n;
	}
	
	public static void showInfo(String info) {
		JOptionPane.showMessageDialog(frame, info);
	}
}
