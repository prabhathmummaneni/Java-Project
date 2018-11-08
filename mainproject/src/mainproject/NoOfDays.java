package mainproject;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NoOfDays {
	
	private JFrame frame;
	private JTextField textField;

	
	public void page(int[] a,String sdf) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NoOfDays window = new NoOfDays(a,sdf);
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
	public NoOfDays() {

	}
	public NoOfDays(int[] a,String sdf) {
		initialize(a,sdf);
	}
	private void initialize(int[] a,String sdf) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(234, 72, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("NO.of days");
		lblNewLabel.setBounds(45, 74, 171, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String no=textField.getText();
				
				int count=Integer.parseInt(no);
				try {
					FileReader fstream=new FileReader("totaldays.txt");
					BufferedReader sd=new BufferedReader(fstream);
					String sdfa=sd.readLine();
					int[] b=new int[4];
					if(sdfa==null) {
						for(int i=0;i<4;i++)
							b[i]=0;
					}
					else
					{
						String[] sa=sdfa.split(" ");
						for(int i=0;i<4;i++) {
							b[i]=Integer.parseInt(sa[i]);
						}
					}
					FileWriter Fstream=new FileWriter("totaldays.txt");
					BufferedWriter out=new BufferedWriter(Fstream);
					out.write("");
					 Fstream=new FileWriter("totaldays.txt",true);
					 //System.out.println(sdf);
					 out=new BufferedWriter(Fstream);
					 
					 
					   if(sdf.contains("DSA")) {
						   b[0]+=count;
					   }
					   if(sdf.contains("oops")) {
						   b[1]+=count;
					   }
					   if(sdf.contains("ECE")) {
						   b[2]+=count;
					   }
					   if(sdf.contains("Maths")) {
						   b[3]+=count;
					   }
					   for(int i=0;i<4;i++) {
							 
							 out.write(b[i]+" ");
							
						 }
					   out.close();
					}
				 catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				for(int i=0;i<a.length;i++) {
					a[i]=count;
				}
				frame.dispose();
				System.out.println(count);
				for(int i=0;i<count;i++) {
					absenteee sd=new absenteee();
					sd.page(a,sdf);
					
				}
				Facultypage bn=new Facultypage();
				bn.page(sdf);
				
			}
		});
		btnUpdate.setBounds(124, 135, 117, 25);
		frame.getContentPane().add(btnUpdate);
		
	}
}
