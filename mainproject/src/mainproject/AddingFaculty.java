package mainproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class AddingFaculty {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public void page() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddingFaculty window = new AddingFaculty();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddingFaculty() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Faculty Name");
		lblNewLabel.setBounds(57, 71, 100, 15);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(160,71, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(57, 111, 100, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(160, 111, 114, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Course Name");
		lblNewLabel_2.setBounds(57, 160, 100, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(160, 160, 114, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Faculty Signup");
		lblNewLabel_3.setBounds(148, 26, 245, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnSignin = new JButton("Signin");
		btnSignin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Name=textField.getText();
				String password=textField_1.getText();
				String CourseName=textField_2.getText();
				try {
					FileWriter fstream=new FileWriter("Faculty.txt",true);
					BufferedWriter out=new BufferedWriter(fstream);
					out.write(Name+" "+password+" "+CourseName+"\n");
					out.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				AdminPage a=new AdminPage();
				frame.dispose();
				a.page();
			}
		});
		btnSignin.setBounds(99, 199, 117, 25);
		frame.getContentPane().add(btnSignin);
		
	}
}
