package mainproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Studentpage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void page(int df) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Studentpage window = new Studentpage(df);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Studentpage() {
	
	}
	public Studentpage(int df) {
		initialize(df);
	}
	private void initialize(int df) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(149, 76, 117, 24);
		frame.getContentPane().add(comboBox);
		comboBox.addItem("DSA");
		comboBox.addItem("oops");
		comboBox.addItem("ECE");
		comboBox.addItem("Maths");
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String h=(String)comboBox.getSelectedItem();
				if(h.contains("DSA")) {
					try {
						FileReader fstream=new FileReader("DSA.txt");
						FileReader Fstream=new FileReader("totaldays.txt");
						BufferedReader in=new BufferedReader(fstream);
						BufferedReader in1=new BufferedReader(Fstream);
						
						String hj=in.readLine();
						String dfg=in1.readLine();
						System.out.println(dfg);
						if(hj==null) {
							 JOptionPane.showMessageDialog(frame,"Total No.of Classes=0\nNo.of Classes attended=0\nAttendence precentage=100");
						}
						else
						{
							String[] dfg1=dfg.split(" ");
							int[] b=new int[4];
							for(int i=0;i<4;i++) {
								b[i]=Integer.parseInt(dfg1[i]);
							}
							if(b[0]==0) {
								 JOptionPane.showMessageDialog(frame,"Total No.of Classes=0\nNo.of Classes attended=0\nAttendence precentage=100");
									
							}
							else
							{
								String[] hj1=hj.split(" ");
								int saaaa=Integer.parseInt(hj1[df-1]);
								float sdwf=(float)saaaa;
								float qwer=(float)b[0];
								float qw=(float)((sdwf/qwer)*100);
								JOptionPane.showMessageDialog(frame,"Total No.of Classes="+b[0]+"\nNo.of Classes attended="+saaaa+"\nAttendence precentage="+qw);
							}
						}
						
					} catch (FileNotFoundException e) {
						
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(h.contains("oops")) {
					try {
						FileReader fstream=new FileReader("oops.txt");
						FileReader Fstream=new FileReader("totaldays.txt");
						BufferedReader in=new BufferedReader(fstream);
						BufferedReader in1=new BufferedReader(Fstream);
						
						String hj=in.readLine();
						String dfg=in1.readLine();
						if(hj==null) {
							 JOptionPane.showMessageDialog(frame,"Total No.of Classes=0\nNo.of Classes attended=0\nAttendence precentage=100");
						}
						else
						{
							String[] dfg1=dfg.split(" ");
							int[] b=new int[4];
							for(int i=0;i<4;i++) {
								b[i]=Integer.parseInt(dfg1[i]);
							}
							if(b[1]==0) {
								 JOptionPane.showMessageDialog(frame,"Total No.of Classes=0\nNo.of Classes attended=0\nAttendence precentage=100");
									
							}
							else
							{
								String[] hj1=hj.split(" ");
								int saaaa=Integer.parseInt(hj1[df-1]);
								float sdwf=(float)saaaa;
								float qwer=(float)b[1];
								float qw=(float)((sdwf/qwer)*100);
								JOptionPane.showMessageDialog(frame,"Total No.of Classes="+b[1]+"\nNo.of Classes attended="+saaaa+"\nAttendence precentage="+qw);
							}
						}
						
					} catch (FileNotFoundException e) {
						
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(h.contains("ECE")) {
					try {
						FileReader fstream=new FileReader("ECE.txt");
						FileReader Fstream=new FileReader("totaldays.txt");
						BufferedReader in=new BufferedReader(fstream);
						BufferedReader in1=new BufferedReader(Fstream);
						
						String hj=in.readLine();
						String dfg=in1.readLine();
						if(hj==null) {
							 JOptionPane.showMessageDialog(frame,"Total No.of Classes=0\nNo.of Classes attended=0\nAttendence precentage=100");
						}
						else
						{
							String[] dfg1=dfg.split(" ");
							int[] b=new int[4];
							for(int i=0;i<4;i++) {
								b[i]=Integer.parseInt(dfg1[i]);
							}
							if(b[2]==0) {
								 JOptionPane.showMessageDialog(frame,"Total No.of Classes=0\nNo.of Classes attended=0\nAttendence precentage=100");
									
							}
							else
							{
								String[] hj1=hj.split(" ");
								int saaaa=Integer.parseInt(hj1[df-1]);
								float sdwf=(float)saaaa;
								float qwer=(float)b[2];
								float qw=(float)((sdwf/qwer)*100);
								JOptionPane.showMessageDialog(frame,"Total No.of Classes="+b[2]+"\nNo.of Classes attended="+saaaa+"\nAttendence precentage="+qw);
							}
						}
						
					} catch (FileNotFoundException e) {
						
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(h.contains("Maths")) {
					try {
						FileReader fstream=new FileReader("Math.txt");
						FileReader Fstream=new FileReader("totaldays.txt");
						BufferedReader in=new BufferedReader(fstream);
						BufferedReader in1=new BufferedReader(Fstream);
						
						String hj=in.readLine();
						String dfg=in1.readLine();
						if(hj==null) {
							 JOptionPane.showMessageDialog(frame,"Total No.of Classes=0\nNo.of Classes attended=0\nAttendence precentage=100");
						}
						else
						{
							String[] dfg1=dfg.split(" ");
							int[] b=new int[4];
							for(int i=0;i<4;i++) {
								b[i]=Integer.parseInt(dfg1[i]);
							}
							if(b[3]==0) {
								 JOptionPane.showMessageDialog(frame,"Total No.of Classes=0\nNo.of Classes attended=0\nAttendence precentage=100");
									
							}
							else
							{
								String[] hj1=hj.split(" ");
								int saaaa=Integer.parseInt(hj1[df-1]);
								float sdwf=(float)saaaa;
								float qwer=(float)b[3];
								float qw=(float)((sdwf/qwer)*100);
								JOptionPane.showMessageDialog(frame,"Total No.of Classes="+b[3]+"\nNo.of Classes attended="+saaaa+"\nAttendence precentage="+qw);
							}
						}
						
					} catch (FileNotFoundException e) {
						
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		btnSubmit.setBounds(149, 157, 117, 25);
		frame.getContentPane().add(btnSubmit);
		
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
