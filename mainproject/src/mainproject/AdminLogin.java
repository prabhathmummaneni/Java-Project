package mainproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class AdminLogin {

	private JFrame frame;
	
	private JLabel lblNewLabel;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public void page() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin window = new AdminLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public AdminLogin() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(44, 86, 90, 15);
		frame.getContentPane().add(lblUsername);
		
		lblNewLabel = new JLabel("Password");
		lblNewLabel.setBounds(44, 133, 90, 15);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(160, 86, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(160, 133, 114, 19);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			 String UserName=textField.getText();
			 String Password=passwordField.getText();
			 if((UserName.contains("Admin"))&&(Password.contains("Signin"))) {
				AdminPage a=new AdminPage();
				frame.dispose();
				a.page();}
			 else {
				 JOptionPane.showMessageDialog(frame,"Invalid User name or Password", "Warning",JOptionPane.WARNING_MESSAGE );
			 }
			 
			}
		});
		btnLogin.setBounds(120, 174, 90, 25);
		frame.getContentPane().add(btnLogin);
		
		JLabel lblNewLabel_1 = new JLabel("Admin Login");
		lblNewLabel_1.setBounds(120, 30, 154, 15);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
