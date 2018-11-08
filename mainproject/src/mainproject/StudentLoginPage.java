package mainproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class StudentLoginPage {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	
	public void page() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentLoginPage window = new StudentLoginPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public StudentLoginPage() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setBounds(55, 77, 111, 15);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(55, 108, 111, 15);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(161, 77, 114, 15);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		
		JButton btnLogin = new JButton("login");
		btnLogin.addActionListener(new ActionListener() {
			private int flag;
			public void actionPerformed(ActionEvent e) {
				String Name=textField.getText();
				String Password=passwordField.getText();
				flag = 0;
				int df=0;
				FileReader fstream;
				try {
					fstream = new FileReader("Student.txt");
					BufferedReader in=new BufferedReader(fstream);
					String temp;
					while((temp=in.readLine())!=null) {
						String[] User_cred=temp.split(" ");
						df++;
						if(Name.contains(User_cred[0])&&Password.contains(User_cred[1])) {
							flag=1;
					          break;		
						}
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(flag==0) {
					 JOptionPane.showMessageDialog(frame,"Invalid User name or Password", "Warning",JOptionPane.WARNING_MESSAGE );
						
				}
				else {
					 Studentpage a=new Studentpage();
					 frame.dispose();
					 a.page(df);
					
				}
			}
		});
		btnLogin.setBounds(112, 153, 117, 25);
		frame.getContentPane().add(btnLogin);
		
		JLabel lblStudentLogin = new JLabel("Student Login");
		lblStudentLogin.setBounds(159, 12, 127, 15);
		frame.getContentPane().add(lblStudentLogin);
		
		passwordField= new JPasswordField();
		passwordField.setBounds(161, 108, 114, 15);
		frame.getContentPane().add(passwordField);
	}
}
