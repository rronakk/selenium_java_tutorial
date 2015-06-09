package com.toolsqa.selenium;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class MyAction implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JOptionPane.showMessageDialog(null, "You Clicked Button");
	}
	
}
public class ButtonClickExample {

	public static void main(String[] args) {

		JFrame window = new JFrame("My Window");
		
		window.setBounds(100, 100, 500, 600);
		window.setLayout(null);
		
		// Add a Button
		JButton btnOK = new JButton("OK");
		btnOK.setBounds(10, 10, 100, 20);
		
		// It takes an object which has actionPerformed Method
		btnOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "You Clicked Button - Anonymous");
			}
		});
		
		window.add(btnOK);
		
		window.setVisible(true);

	}

}
