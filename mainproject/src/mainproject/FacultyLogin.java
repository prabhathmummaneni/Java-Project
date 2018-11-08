package mainproject;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class FacultyLogin {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblPassword;

		public void page() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FacultyLogin window = new FacultyLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public FacultyLogin() {
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
		
		
		textField = new JTextField();
		textField.setBounds(160, 86, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(160, 133, 114, 19);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			private int flag;

			public void actionPerformed(ActionEvent arg0) {
				String Name=textField.getText();
				String Password=passwordField.getText();
				String[] User_cred=null;
				flag = 0;
				FileReader fstream;
				try {
					fstream = new FileReader("Faculty.txt");
					BufferedReader in=new BufferedReader(fstream);
					String temp;
				
					while((temp=in.readLine())!=null) {
						User_cred=temp.split(" ");
						if(Name.contains(User_cred[0])&&Password.contains(User_cred[1])) {
							System.out.println(User_cred[2]);
							flag=1;
					          
					  		Facultypage a=new Facultypage();
					  		frame.dispose();
							a.page(User_cred[2]);
							break;
					
						}
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(flag==0) {
					 JOptionPane.showMessageDialog(frame,"Invalid User name or Password", "Warning",JOptionPane.WARNING_MESSAGE );
						
				}
				
				
				
				
				
			}
		});
		btnLogin.setBounds(120, 174, 90, 25);
		frame.getContentPane().add(btnLogin);
		JLabel lblNewLabel = new JLabel("Faculty Login");
		lblNewLabel.setBounds(145, 12, 176, 27);
		frame.getContentPane().add(lblNewLabel);
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(44, 113, 70, 15);
		frame.getContentPane().add(lblPassword);
		
		
	}
}
