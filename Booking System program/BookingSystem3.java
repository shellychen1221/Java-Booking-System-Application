/*
 * BookingSystem.java
 * This is a booking system application.
 * Author: Hsin Yu Chen
 * Date: 12/21/2022
 */
package finalproject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class BookingSystem3 {

	private JFrame frmCancelReservation;
	public static LinkedList<String> namelist=BookingSystem2.namelist;
	public static LinkedList<String> phonelist=BookingSystem2.phonelist;
	public static LinkedList<String> datelist=BookingSystem2.datelist;
	public static LinkedList<String> daylist=BookingSystem2.daylist;
	public static int index;
	public static String username;
	public static File file;
	/**
	 * Launch the application.
	 */
	public static void Screen_3() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingSystem3 window = new BookingSystem3();
					window.frmCancelReservation.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BookingSystem3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCancelReservation = new JFrame();
		frmCancelReservation.setTitle("Cancel reservation");
		frmCancelReservation.getContentPane().setBackground(SystemColor.menu);
		frmCancelReservation.setBounds(100, 100, 565, 721);
		frmCancelReservation.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmCancelReservation.getContentPane().setLayout(null);
		frmCancelReservation.getContentPane().setBackground(new Color(251,226,146));
		
		JLabel lblNewLabel = new JLabel("Enter the name you want to cancel: ");
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		lblNewLabel.setBounds(20, 94, 340, 37);
		frmCancelReservation.getContentPane().add(lblNewLabel);
		
		JTextField textField = new JTextField();
		textField.setBounds(340, 102, 108, 21);
		textField.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		frmCancelReservation.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lbllist = new JLabel("");
		lbllist.setForeground(new Color(112, 128, 144));
		lbllist.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lbllist.setBounds(20, 251, 481, 37);
		frmCancelReservation.getContentPane().add(lbllist);
		
		JLabel lbllist_1 = new JLabel("");
		lbllist_1.setForeground(new Color(112, 128, 144));
		lbllist_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lbllist_1.setBounds(20, 298, 481, 37);
		frmCancelReservation.getContentPane().add(lbllist_1);
		
		JLabel lbllist_2 = new JLabel("");
		lbllist_2.setForeground(new Color(112, 128, 144));
		lbllist_2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lbllist_2.setBounds(20, 204, 481, 37);
		frmCancelReservation.getContentPane().add(lbllist_2);
		
		JButton btnNewButton = new JButton("Look up");
		btnNewButton.setBackground(UIManager.getColor("CheckBox.light"));
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("resource")
			public void actionPerformed(ActionEvent e) {
				username=textField.getText();
				file = new File(username+".txt");
				Scanner sc=new Scanner(System.in);
				if (file.exists()&&!file.isDirectory()) {
					try {
						sc = new Scanner(file);
						String Name=sc.nextLine();
						String Phone=sc.nextLine();
						String Date=sc.nextLine();
						String Day=sc.nextLine();
						String Room=sc.nextLine();
						String Choice=sc.nextLine();
						lbllist_2.setForeground(new Color(112, 128, 144));
						lbllist.setForeground(new Color(112, 128, 144));
						lbllist_1.setForeground(new Color(112, 128, 144));
						lbllist_2.setText("Your booking name is: \n"+Name);
						lbllist.setText("Your cellphone: \n"+Phone);
						lbllist_1.setText("You have booked "+Room+" at "+Date+" for "+Day+" day(s)~");
					} 
					catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				sc.close();
				}
				else {
					lbllist_2.setText("Sorry");
					lbllist.setText("Your name is not found!");
					lbllist_1.setText("Please check again~");
					lbllist_2.setForeground(Color.red);
					lbllist.setForeground(Color.red);
					lbllist_1.setForeground(Color.red);
		    	}
			}
		});
		btnNewButton.setBounds(189, 160, 140, 29);
		btnNewButton.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		frmCancelReservation.getContentPane().add(btnNewButton);
		
		JButton btnDelete = new JButton("Delete!");
		btnDelete.setBackground(SystemColor.info);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 	file.delete();
				textField.setText("");
				lbllist.setText("Delete Successfully!");
				lbllist_1.setText("");
			}
		});
		btnDelete.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		btnDelete.setBounds(139, 358, 95, 23);
		frmCancelReservation.getContentPane().add(btnDelete);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(SystemColor.info);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCancelReservation.setVisible(false);
			}
		});
		btnCancel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		btnCancel.setBounds(244, 358, 91, 23);
		frmCancelReservation.getContentPane().add(btnCancel);	
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("searchimage.png"));
		lblNewLabel_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(244, 145, 378, 630);
		frmCancelReservation.getContentPane().add(lblNewLabel_1);
		
		JLabel lblCancelYourReservation = new JLabel("Cancel Your Reservation");
		lblCancelYourReservation.setForeground(new Color(112, 128, 144));
		lblCancelYourReservation.setFont(new Font("Yu Gothic UI", Font.BOLD, 21));
		lblCancelYourReservation.setBounds(139, 37, 310, 37);
		frmCancelReservation.getContentPane().add(lblCancelYourReservation);
		
		JLabel lblHopeYouCan = new JLabel("Hope can see you next time~");
		lblHopeYouCan.setForeground(new Color(112, 150, 144));
		lblHopeYouCan.setFont(new Font("Yu Gothic UI", Font.BOLD, 21));
		lblHopeYouCan.setBounds(20, 403, 350, 37);
		frmCancelReservation.getContentPane().add(lblHopeYouCan);
		
		JLabel lbllist_1_1 = new JLabel("");
		lbllist_1_1.setIcon(new ImageIcon("see-you-soon-see-you-later.png"));
		lbllist_1_1.setForeground(new Color(112, 128, 144));
		lbllist_1_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lbllist_1_1.setBounds(110, 451, 367, 223);
		frmCancelReservation.getContentPane().add(lbllist_1_1);
	}	
}

