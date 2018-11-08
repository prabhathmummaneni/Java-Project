package mainproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Facultypage {
     int[] a=new int[5];
	 String Course=null;
	private JFrame frame;

	
	public void page(String sdf) {
		int n=0;
		FileReader fstream1;
		try {
			fstream1 = new FileReader("Student.txt");
			@SuppressWarnings("resource")
			BufferedReader in=new BufferedReader(fstream1);
			@SuppressWarnings("unused")
			String temp=null;
			try {
				while((temp=in.readLine())!=null) {
					   n++;
					}
			} catch (IOException e) {
				System.out.println("error6");
			}

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			System.out.println("error7");
		}
				System.out.println(n);
		a=new int[n];
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Facultypage window = new Facultypage(sdf,a);
					window.frame.setVisible(true);
				} catch (Exception e) {
					System.out.println("error8");
				}
			}
		});
	}

	
	public Facultypage() {

	}
	public Facultypage(String sdf,int[] a) {
		initialize(sdf,a);
	}

	
	private void initialize(String sdf,int[] a) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnUpdateAttendence = new JButton("Update attendence");
		btnUpdateAttendence.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {	
					NoOfDays sd=new NoOfDays();
					System.out.println(sdf+" ");
					frame.dispose();
					sd.page(a,sdf);
					
				    	
				} catch (FileNotFoundException e1) {
					System.out.println("error1");
				} catch (IOException e1) {
					System.out.println("error2");
				}
			}
		});
		btnUpdateAttendence.setBounds(152, 124, 184, 25);
		frame.getContentPane().add(btnUpdateAttendence);
		
		JButton btnSignout = new JButton("Signout");
		btnSignout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Openingpage a=new Openingpage();
				frame.dispose();
				a.page();
			}
		});
		btnSignout.setBounds(311, 12, 117, 25);
		frame.getContentPane().add(btnSignout);
		
		
	}
}
