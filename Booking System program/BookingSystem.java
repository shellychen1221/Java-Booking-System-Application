/*
 * BookingSystem.java
 * This is a booking system application.
 * Author: Hsin Yu Chen
 * Date: 12/21/2022
 */
package finalproject;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JScrollBar;
public class BookingSystem {
	private JFrame frmMenu;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingSystem window = new BookingSystem();
					window.frmMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public BookingSystem() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenu = new JFrame();
		frmMenu.setTitle("Menu");
		frmMenu.getContentPane().setBackground(UIManager.getColor("menu"));
		frmMenu.setBounds(100, 100, 580, 721);
		frmMenu.getContentPane().setBackground(new Color(251,226,146));
		frmMenu.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmMenu.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Booking");
		btnNewButton.setForeground(new Color(112, 128, 144));
		btnNewButton.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookingSystem2 s1 = new BookingSystem2();
				s1.Screen_2();
			}
		});
		
		JLabel lblNewLabel_2_3_1 = new JLabel("We provide parking services.");
		lblNewLabel_2_3_1.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_2_3_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		lblNewLabel_2_3_1.setBounds(30, 404, 379, 37);
		frmMenu.getContentPane().add(lblNewLabel_2_3_1);
		
		JLabel lblRoom1_1 = new JLabel("");
		lblRoom1_1.setIcon(new ImageIcon("456.png"));
		lblRoom1_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblRoom1_1.setBounds(340, 451, 299, 237);
		frmMenu.getContentPane().add(lblRoom1_1);
		btnNewButton.setBackground(new Color(251,226,146));
		btnNewButton.setBounds(146, 71, 251, 38);
		btnNewButton.setBorder(new RoundedBorder(30)); 
		frmMenu.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel reservation");
		btnNewButton_1.setForeground(new Color(112, 128, 144));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookingSystem3 s2 = new BookingSystem3();
				s2.Screen_3();
			}
		});
		btnNewButton_1.setBackground(new Color(251,226,146));
		btnNewButton_1.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		btnNewButton_1.setBounds(146, 119, 251, 38);
		btnNewButton_1.setBorder(new RoundedBorder(30)); 
		frmMenu.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Booking Hotel System");
		lblNewLabel.setForeground(new Color(112, 128, 144));
		lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 21));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(106, 39, 348, 26);
		frmMenu.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(255, 250, 205));
		lblNewLabel_1.setIcon(new ImageIcon("booking-hotel-online-cartoon-icon-illustration-business-technology-icon-concept_138676-2126.jpg"));
		lblNewLabel_1.setBounds(103, 431, 337, 243);
		frmMenu.getContentPane().add(lblNewLabel_1);
		JLabel lblNewLabel_3 = new JLabel("Welcome to our Booking system!");
		lblNewLabel_3.setForeground(new Color(105, 105, 105));
		lblNewLabel_3.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		lblNewLabel_3.setBounds(30, 35, 309, 37);
		frmMenu.getContentPane().add(lblNewLabel);
		
		JLabel lblRoom1 = new JLabel("");
		lblRoom1.setIcon(new ImageIcon("jp.jpg"));
		lblRoom1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblRoom1.setBounds(30, 190, 230, 158);
		frmMenu.getContentPane().add(lblRoom1);
		
		JLabel lblNewLabel_2 = new JLabel("(We will charge a service fee of 10%!)");
		lblNewLabel_2.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_2.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblNewLabel_2.setBounds(30, 384, 309, 37);
		frmMenu.getContentPane().add(lblNewLabel_2);
		
		JLabel lblRoom2 = new JLabel("");
		lblRoom2.setIcon(new ImageIcon("unnamed.jpg"));
		lblRoom2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		lblRoom2.setBounds(290, 190, 230, 158);
		frmMenu.getContentPane().add(lblRoom2);
		
		JLabel lblWeHaveTwo = new JLabel("We have two types of room: ");
		lblWeHaveTwo.setForeground(SystemColor.controlDkShadow);
		lblWeHaveTwo.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		lblWeHaveTwo.setBounds(30, 167, 309, 37);
		frmMenu.getContentPane().add(lblWeHaveTwo);
		
		JLabel lblNewLabel_2_1 = new JLabel("Double Room 2000NTD/ night");
		lblNewLabel_2_1.setForeground(new Color(233, 150, 122));
		lblNewLabel_2_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(30, 337, 300, 37);
		frmMenu.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Quadruple Room 4000NTD/ night");
		lblNewLabel_2_1_1.setForeground(new Color(233, 150, 122));
		lblNewLabel_2_1_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblNewLabel_2_1_1.setBounds(290, 337, 300, 37);
		frmMenu.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("You can choose to pay by cash or by card. ");
		lblNewLabel_2_3.setForeground(SystemColor.controlDkShadow);
		lblNewLabel_2_3.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		lblNewLabel_2_3.setBounds(30, 358, 400, 37);
		frmMenu.getContentPane().add(lblNewLabel_2_3);
	}
	private static class RoundedBorder implements Border {
		private int radius;
		RoundedBorder(int radius) {
			this.radius = radius;
		}
		public Insets getBorderInsets(Component c) {
			return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
		}
		public boolean isBorderOpaque() {
			return true;
		}
		public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
			g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
		}
	}
}
