package mainproject;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
public class AdminPage {

	private JFrame frame;

	public void page() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage window = new AdminPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public AdminPage() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Add Student");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddingStudent a=new AddingStudent();
				frame.dispose();
				a.page();
			}
		});
		btnNewButton.setBounds(43, 118, 156, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add Faculty");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddingFaculty a=new AddingFaculty();
				frame.dispose();
				a.page();
				
			}
		});
		btnNewButton_1.setBounds(236, 118, 177, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnSignout = new JButton("Signout");
		btnSignout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Openingpage a=new Openingpage();
				frame.dispose();
				a.page();
			}
		});
		btnSignout.setBounds(321, 12, 117, 25);
		frame.getContentPane().add(btnSignout);
	}
}
