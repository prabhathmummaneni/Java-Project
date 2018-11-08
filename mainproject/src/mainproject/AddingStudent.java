package mainproject;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.*;
	
	
		
	

public class AddingStudent {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel_3;
	
	public void page() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddingStudent window = new AddingStudent();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public AddingStudent() {
		initialize();
	}

	private void initialize()  {
		frame = new JFrame();
		
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Name");
		lblNewLabel.setBounds(39, 79, 115, 15);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(149, 79, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(39, 133, 115, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(149, 133, 114, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		
		
		
		lblNewLabel_3 = new JLabel("Student Signup");
		lblNewLabel_3.setBounds(119, 30, 144, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnSignin = new JButton("Signin");
		btnSignin.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e)  {
				String Name=textField.getText();
				String Password=textField_1.getText();
				
				
						try {
							FileWriter fstream=new FileWriter("Student.txt",true);
							FileReader fstream1=new FileReader("Student.txt");
							BufferedWriter out=new BufferedWriter(fstream);
							BufferedReader in=new BufferedReader(fstream1);
							
							String temp;
							int count=0;
							while((temp=in.readLine())!=null) {
							   count++;
							}
							count++;
						String df=Integer.toString(count);
						  out.write(Name+" "+Password+" "+"\n");
							out.close();
							
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			   
			    AdminPage a=new AdminPage();
			    frame.dispose();
			    a.page();
							
			}
		});
		btnSignin.setBounds(90, 187, 100, 25);
		frame.getContentPane().add(btnSignin);
		
		
 }
}
