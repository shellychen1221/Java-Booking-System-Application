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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class BookingSystem4 {

	private JFrame frmLookUp;
	public static LinkedList<String> namelist=BookingSystem2.namelist;
	public static LinkedList<String> phonelist=BookingSystem2.phonelist;
	public static LinkedList<String> datelist=BookingSystem2.datelist;
	public static LinkedList<String> daylist=BookingSystem2.daylist;
	public static int index;
	public static String username;
	File file;
	/**
	 * Launch the application.
	 */
	public static void Screen_4() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingSystem4 window = new BookingSystem4();
					window.frmLookUp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BookingSystem4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLookUp = new JFrame();
		frmLookUp.setTitle("Introduction");
		frmLookUp.getContentPane().setBackground(SystemColor.menu);
		frmLookUp.setBounds(100, 100, 535, 521);
		frmLookUp.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmLookUp.getContentPane().setLayout(null);
		frmLookUp.getContentPane().setBackground(new Color(251,226,146));
		JLabel lblNewLabel = new JLabel("Welcome to our Booking system!");
		lblNewLabel.setForeground(new Color(105, 105, 105));
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		lblNewLabel.setBounds(30, 35, 309, 37);
		frmLookUp.getContentPane().add(lblNewLabel);
		
		JLabel lblRoom1 = new JLabel("");
		lblRoom1.setIcon(new ImageIcon("jp.jpg"));
		lblRoom1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblRoom1.setBounds(30, 94, 230, 158);
		frmLookUp.getContentPane().add(lblRoom1);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(SystemColor.info);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLookUp.setVisible(false);
			}
		});
		btnCancel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		btnCancel.setBounds(190, 437, 91, 23);
		frmLookUp.getContentPane().add(btnCancel);
		
		JLabel lblNewLabel_2 = new JLabel("(We will charge a service fee of 10%!)");
		lblNewLabel_2.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_2.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblNewLabel_2.setBounds(30, 304, 309, 37);
		frmLookUp.getContentPane().add(lblNewLabel_2);
		
		JLabel lblRoom2 = new JLabel("");
		lblRoom2.setIcon(new ImageIcon("unnamed.jpg"));
		lblRoom2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblRoom2.setBounds(270, 94, 230, 158);
		frmLookUp.getContentPane().add(lblRoom2);
		
		JLabel lblWeHaveTwo = new JLabel("We have two types of room: ");
		lblWeHaveTwo.setForeground(SystemColor.controlDkShadow);
		lblWeHaveTwo.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		lblWeHaveTwo.setBounds(30, 61, 309, 37);
		frmLookUp.getContentPane().add(lblWeHaveTwo);
		
		JLabel lblNewLabel_2_1 = new JLabel("Double Room 2000NTD/ night");
		lblNewLabel_2_1.setForeground(new Color(233, 150, 122));
		lblNewLabel_2_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(30, 247, 267, 37);
		frmLookUp.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Quadruple Room 4000NTD/ night");
		lblNewLabel_2_1_1.setForeground(new Color(233, 150, 122));
		lblNewLabel_2_1_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblNewLabel_2_1_1.setBounds(270, 247, 267, 37);
		frmLookUp.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("You can choose to pay by cash or by card. ");
		lblNewLabel_2_3.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_2_3.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		lblNewLabel_2_3.setBounds(30, 278, 379, 37);
		frmLookUp.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("We provide parking services.");
		lblNewLabel_2_3_1.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_2_3_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		lblNewLabel_2_3_1.setBounds(30, 355, 379, 37);
		frmLookUp.getContentPane().add(lblNewLabel_2_3_1);
		
		JLabel lblRoom1_1 = new JLabel("");
		lblRoom1_1.setIcon(new ImageIcon("456.png"));
		lblRoom1_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblRoom1_1.setBounds(341, 262, 299, 237);
		frmLookUp.getContentPane().add(lblRoom1_1);
	}
}

