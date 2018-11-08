package mainproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.awt.event.ActionEvent;

public class absenteee {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public void page(int[] a,String sdf) 		{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					absenteee window = new absenteee(a,sdf);
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
	public absenteee(int[] a,String sdf) {
		initialize(a,sdf);
	}
	public absenteee() {
	
	}
	private void initialize(int[] a,String sdf) {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("No of absentees");
		lblNewLabel.setBounds(55, 95, 200, 15);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(300, 91, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
        JLabel lblNewLabel_1 = new JLabel("Absentees roll numbers");
		lblNewLabel_1.setBounds(55, 122, 200, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(300, 122, 114, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSubmit = new JButton("submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String df=textField_1.getText();
				String co=textField.getText();
		        int count=Integer.parseInt(co);
		        String[] abs=null;
				if(count!=0) {
				abs=df.split(" ");}
				FileReader fstream=null;
			    
				if(sdf.contains("DSA")) {
					try {
						fstream=new FileReader("DSA.txt");
					} catch (IOException e1) {
						System.out.println("error");
					}
				    }
				else {
				     if(sdf.contains("oops")) {
				    	 try {
							fstream=new FileReader("oops.txt");
						} catch (IOException e1) {
							System.out.println("error5");
						}
						    
				     }
				     if(sdf.contains("ECE")) {
				    	 try {
							fstream=new FileReader("ECE.txt");
						} catch (IOException e1) {
							System.out.println("error4");
						}
						    
				     }
				     if(sdf.contains("Maths")) {
				    	 try {
							fstream=new FileReader("Math.txt");
						} catch (IOException e1) {
							System.out.println("error3");
						}
						    
				     }
				}
				BufferedReader in=new BufferedReader(fstream);
				try {
					String sd=in.readLine();
					
					if(sd!=null) {
						String[] as=sd.split(" ");
					     	for(int i=0;i<as.length;i++) {
					     			a[i]=Integer.parseInt(as[i]);
					}
					     	for(int i=0;i<a.length;i++) {
								a[i]++;
							}
					}
					else {
					for(int i=0;i<a.length;i++) {
						a[i]=1;
					}
					}
					for(int i=0;i<count;i++) {
						int b=Integer.parseInt(abs[i]);
						a[b]--;
					}
					FileWriter Fstream=null;
					if(sdf.contains("DSA")) {
						try {
							Fstream=new FileWriter("DSA.txt");
						} catch (IOException e1) {
							System.out.println("error");
						}
					    }
					else {
					     if(sdf.contains("oops")) {
					    	 try {
								Fstream=new FileWriter("oops.txt");
							} catch (IOException e1) {
								System.out.println("error5");
							}
							    
					     }
					     if(sdf.contains("ECE")) {
					    	 try {
								Fstream=new FileWriter("ECE.txt");
							} catch (IOException e1) {
								System.out.println("error4");
							}
							    
					     }
					     if(sdf.contains("Maths")) {
					    	 try {
								Fstream=new FileWriter("Math.txt");
							} catch (IOException e1) {
								System.out.println("error3");
							}
							    
					     }
					}
					BufferedWriter out=new BufferedWriter(Fstream);
					out.write("");
					out.close();
					if(sdf.contains("DSA")) {
						try {
							Fstream=new FileWriter("DSA.txt",true);
						} catch (IOException e1) {
							System.out.println("error");
						}
					    }
					else {
					     if(sdf.contains("oops")) {
					    	 try {
								Fstream=new FileWriter("oops.txt",true);
							} catch (IOException e1) {
								System.out.println("error5");
							}
							    
					     }
					     if(sdf.contains("ECE")) {
					    	 try {
								Fstream=new FileWriter("ECE.txt",true);
							} catch (IOException e1) {
								System.out.println("error4");
							}
							    
					     }
					     if(sdf.contains("Maths")) {
					    	 try {
								Fstream=new FileWriter("Math.txt",true);
							} catch (IOException e1) {
								System.out.println("error3");
							}
							    
					     }
					}
					BufferedWriter out1=new BufferedWriter(Fstream);	
					for(int i=0;i<a.length;i++) {
						
						out1.write(a[i]+" ");
					   
						
					}
					out1.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				frame.dispose();
				
			}
		});
		btnSubmit.setBounds(101, 149, 117, 25);
		frame.getContentPane().add(btnSubmit);
		
	
	}

	
}
