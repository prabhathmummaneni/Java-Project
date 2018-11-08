package mainproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Openingpage {

	private JFrame frame;

	
	 public void page(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Openingpage window = new Openingpage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Openingpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnStudentLogin = new JButton("Student Login");
		btnStudentLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentLoginPage a=new StudentLoginPage();
				frame.dispose();
				a.page();
			}
		});
		frame.getContentPane().add(btnStudentLogin, BorderLayout.WEST);
		
		JButton btnFacultyLogin = new JButton("Faculty Login");
		btnFacultyLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FacultyLogin a=new FacultyLogin();
				frame.dispose();
				a.page();
				
			}
		});
		frame.getContentPane().add(btnFacultyLogin, BorderLayout.CENTER);
		
		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin a=new AdminLogin();
				frame.dispose();
				a.page();
				
			}
		});
		frame.getContentPane().add(btnAdminLogin, BorderLayout.EAST);
	}

}
