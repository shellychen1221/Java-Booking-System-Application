/*
 * BookingSystem.java
 * This is a booking system application.
 * Author: Hsin Yu Chen
 * Date: 12/21/2022
 */
package finalproject;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

import java.util.*;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.SystemColor;
import java.util.LinkedList;

public class BookingSystem2 {

	private JFrame frmBooking;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public static LinkedList<String> namelist = new LinkedList<>();
	public static LinkedList<String> phonelist = new LinkedList<>();
	public static LinkedList<String> datelist = new LinkedList<>();
	public static LinkedList<String> daylist = new LinkedList<>();
	public static LinkedList<String> roomlist = new LinkedList<>();
	public static LinkedList<String> choicelist = new LinkedList<>();
	private String username;

	/**
	 * Launch the application.
	 */
	public static void Screen_2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingSystem2 window = new BookingSystem2();
					window.frmBooking.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BookingSystem2() {
		initialize();
	}

	Scanner sc = new Scanner(System.in);
	String filename = "Information";
	static int price = 0;
	static boolean Card = false;
	static boolean Cash = false;
	static boolean Droom = false;
	static boolean Qroom = false;
	private JTextField textField_3;
	FileWriter myWriter;

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBooking = new JFrame();
		frmBooking.setTitle("Booking");
		frmBooking.setBounds(100, 100, 565, 721);
		frmBooking.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmBooking.getContentPane().setLayout(null);
		frmBooking.getContentPane().setBackground(new Color(251, 226, 146));

		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		lblNewLabel.setBounds(83, 148, 62, 37);
		frmBooking.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		textField.setBounds(146, 152, 147, 28);
		frmBooking.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblTelephone = new JLabel("Cellphone:");
		lblTelephone.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		lblTelephone.setBounds(83, 209, 100, 37);
		frmBooking.getContentPane().add(lblTelephone);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(180, 213, 162, 28);
		frmBooking.getContentPane().add(textField_1);

		JLabel lblDate = new JLabel("Date:");
		lblDate.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		lblDate.setBounds(83, 273, 62, 37);
		frmBooking.getContentPane().add(lblDate);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(146, 277, 136, 28);
		frmBooking.getContentPane().add(textField_2);

		JLabel lblNumberOfPeople = new JLabel("Room:");
		lblNumberOfPeople.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		lblNumberOfPeople.setBounds(83, 339, 62, 37);
		frmBooking.getContentPane().add(lblNumberOfPeople);
		
		JButton btnQuadrupleRoom = new JButton("Quadruple room");
		btnQuadrupleRoom.setForeground(UIManager.getColor("CheckBox.highlight"));
		btnQuadrupleRoom.setBackground(UIManager.getColor("CheckBox.shadow"));
		
		JButton btnNewButton = new JButton("Double room");
		btnNewButton.setForeground(UIManager.getColor("CheckBox.highlight"));
		btnNewButton.setBackground(UIManager.getColor("CheckBox.shadow"));
		JLabel lbldoubleJLabel = new JLabel("Double room");
		lbldoubleJLabel.setBounds(146, 346, 160, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				price = price + 2000;
				lbldoubleJLabel.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
				lbldoubleJLabel.setBounds(150, 345, 140, 37);
				lbldoubleJLabel.setVisible(true);
				frmBooking.getContentPane().add(lbldoubleJLabel);
				lbldoubleJLabel.setForeground(SystemColor.blue);
				btnNewButton.setVisible(false);
				btnQuadrupleRoom.setVisible(false);
				Droom = true;
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		btnNewButton.setBounds(146, 346, 147, 23);
		frmBooking.getContentPane().add(btnNewButton);

		JLabel lblqJLabel = new JLabel("Quadruple room");
		btnQuadrupleRoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				price = price + 4000;
				lblqJLabel.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
				lblqJLabel.setBounds(150, 345, 150, 37);
				lblqJLabel.setVisible(true);
				frmBooking.getContentPane().add(lblqJLabel);
				lblqJLabel.setForeground(SystemColor.blue);
				btnQuadrupleRoom.setVisible(false);
				btnNewButton.setVisible(false);
				Qroom = true;
			}
		});
		btnQuadrupleRoom.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		btnQuadrupleRoom.setBounds(301, 346, 184, 23);
		frmBooking.getContentPane().add(btnQuadrupleRoom);

		JLabel lblDoYouNeed = new JLabel("Do you need to park the car?");
		lblDoYouNeed.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		lblDoYouNeed.setBounds(83, 402, 259, 37);
		frmBooking.getContentPane().add(lblDoYouNeed);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("1.png"));
		lblNewLabel_2.setBounds(307, 426, 222, 258);
		frmBooking.getContentPane().add(lblNewLabel_2);

		JLabel lblCardOrCash = new JLabel("Card or cash?");
		lblCardOrCash.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		lblCardOrCash.setBounds(82, 458, 140, 37);
		frmBooking.getContentPane().add(lblCardOrCash);

		JButton btnCard = new JButton("Card");
		btnCard.setBackground(UIManager.getColor("CheckBox.shadow"));

		JButton btnCash = new JButton("Cash");
		btnCash.setBackground(UIManager.getColor("CheckBox.shadow"));
		JLabel lblcardJLabel = new JLabel("Card");
		btnCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblcardJLabel.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
				lblcardJLabel.setBounds(83, 512, 86, 23);
				frmBooking.getContentPane().add(lblcardJLabel);
				lblcardJLabel.setForeground(SystemColor.blue);
				lblcardJLabel.setVisible(true);
				btnCard.setVisible(false);
				btnCash.setVisible(false);
				Card = true;
			}
		});
		btnCard.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		btnCard.setBounds(83, 512, 86, 23);
		frmBooking.getContentPane().add(btnCard);

		JLabel lblcashJLabel = new JLabel("Cash");
		btnCash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblcashJLabel.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
				lblcashJLabel.setBounds(83, 512, 90, 23);
				frmBooking.getContentPane().add(lblcashJLabel);
				lblcashJLabel.setForeground(SystemColor.blue);
				lblcashJLabel.setVisible(true);
				btnCash.setVisible(false);
				btnCard.setVisible(false);
				Cash = true;
			}
		});
		btnCash.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		btnCash.setBounds(180, 512, 90, 23);
		frmBooking.getContentPane().add(btnCash);

		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBackground(SystemColor.info);
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String name = textField.getText().toString();
				String cellphone = textField_1.getText().toString();
				String date = textField_2.getText().toString();
				String day = textField_3.getText().toString();
				String choice = "";
				String room = "";
				if (Card) {
					choice = "card";
				} else if (Cash) {
					choice = "cash";
				}
				if (Droom) {
					room = "Double room";
				} else if (Qroom) {
					room = "Quadruple room";
				}
				int d = Integer.parseInt(textField_3.getText());
				price = (int) (price * d * 1.1);
				UIManager.put("OptionPane.background", new ColorUIResource(250, 240, 230));
				UIManager.put("Panel.background", new ColorUIResource(250, 240, 230));
				UIManager.put("OptionPane.buttonFont",
						new FontUIResource(new Font("MS Reference Sans Serif", Font.ITALIC, 13)));
				UIManager.put("OptionPane.messageFont",
						new FontUIResource(new Font("MS Reference Sans Serif", Font.ITALIC, 13)));
				
				namelist.add(name);
				phonelist.add(cellphone);
				datelist.add(date);
				daylist.add(day);
				roomlist.add(room);
				choicelist.add(choice);
				username = textField.getText();
				if (name.contains(" ")) {
					JOptionPane.showConfirmDialog(lblNewLabel_2, "You cannot enter the space! Please try agan.", null,
							JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
				} 
				else {
					try {
						File file = new File(
								username + ".txt");
						if (file.exists() && !file.isDirectory()) {
							JOptionPane.showConfirmDialog(lblNewLabel_2, "You've already booked.", null,
									JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
						} else {
							FileWriter newfileFile = new FileWriter(
									username + ".txt",
									true);
							BufferedWriter bw = new BufferedWriter(newfileFile);
							JOptionPane.showConfirmDialog(lblNewLabel_2,
									"Hello~ " + name + "\nYou book the " + room + " Sucessfully!\nYou need to pay "
											+ price + " dollars by " + choice + "~" + "\nCustomer information: " + name
											+ "\nCellphone: " + cellphone + "\nDate: " + date,
									null, JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
							
							bw.write(namelist.getLast() + System.lineSeparator());
							bw.write(phonelist.getLast() + System.lineSeparator());
							bw.write(datelist.getLast() + System.lineSeparator());
							bw.write(daylist.getLast() + System.lineSeparator());
							bw.write(roomlist.getLast() + System.lineSeparator());
							bw.write(choicelist.getLast() + System.lineSeparator());
							bw.close();
							newfileFile.close();
						}
					} catch (IOException exception) {
						JOptionPane.showConfirmDialog(lblNewLabel_2,
								"An error occurred. You might enter the wrong information.");
						exception.printStackTrace();
					}
				}
				frmBooking.setVisible(false);
			}
		});
		btnConfirm.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		btnConfirm.setBounds(44, 651, 126, 23);
		frmBooking.getContentPane().add(btnConfirm);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(SystemColor.info);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBooking.setVisible(false);
			}
		});
		btnCancel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		btnCancel.setBounds(176, 651, 126, 23);
		frmBooking.getContentPane().add(btnCancel);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Yes");
		chckbxNewCheckBox.setBackground(Color.WHITE);
		JCheckBox chckbxNo = new JCheckBox("No");
		chckbxNo.setBackground(new Color(251, 226, 146));
		chckbxNewCheckBox.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		chckbxNewCheckBox.setBounds(326, 409, 62, 23);
		chckbxNewCheckBox.setBackground(new Color(251, 226, 146));
		JLabel lblyesJLabel = new JLabel("Yes");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				price = price + 50;
				lblyesJLabel.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
				lblyesJLabel.setBounds(330, 409, 62, 23);
				lblyesJLabel.setForeground(SystemColor.blue);
				frmBooking.getContentPane().add(lblyesJLabel);
				chckbxNewCheckBox.setVisible(false);
				chckbxNo.setVisible(false);
			}
		});
		frmBooking.getContentPane().add(chckbxNewCheckBox);

		chckbxNo.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		chckbxNo.setBounds(387, 409, 62, 23);
		JLabel lblnoJLabel = new JLabel("No");
		chckbxNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblnoJLabel.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
				lblnoJLabel.setBounds(330, 409, 62, 23);
				lblnoJLabel.setForeground(SystemColor.blue);
				frmBooking.getContentPane().add(lblnoJLabel);
				chckbxNewCheckBox.setVisible(false);
				chckbxNo.setVisible(false);
			}
		});

		frmBooking.getContentPane().add(chckbxNo);

		JLabel lblDay = new JLabel("Day:");
		lblDay.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		lblDay.setBounds(292, 273, 44, 37);
		frmBooking.getContentPane().add(lblDay);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(346, 277, 53, 28);
		frmBooking.getContentPane().add(textField_3);

		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(SystemColor.info);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				price = 0;
				textField.setText(" ");
				textField_1.setText(" ");
				textField_2.setText(" ");
				textField_3.setText("");
				btnCard.setVisible(true);
				btnCash.setVisible(true);
				btnQuadrupleRoom.setVisible(true);
				btnNewButton.setVisible(true);
				chckbxNewCheckBox.setVisible(true);
				chckbxNo.setVisible(true);
				lblnoJLabel.setVisible(false);
				lblcashJLabel.setVisible(false);
				lblcardJLabel.setVisible(false);
				lbldoubleJLabel.setVisible(false);
				lblqJLabel.setVisible(false);
				chckbxNewCheckBox.setSelected(false);
				chckbxNo.setSelected(false);
				Card = false;
				Cash = false;
				Droom = false;
				Qroom = false;
			}
		});
		btnReset.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		btnReset.setBounds(387, 155, 98, 23);
		frmBooking.getContentPane().add(btnReset);
		
		JLabel lblBookingInformation = new JLabel("Your Booking Information");
		lblBookingInformation.setForeground(new Color(112, 128, 144));
		lblBookingInformation.setFont(new Font("Yu Gothic UI", Font.BOLD, 21));
		lblBookingInformation.setBounds(83, 76, 286, 37);
		frmBooking.getContentPane().add(lblBookingInformation);
		
		JLabel lblFormatxxxxxxxx = new JLabel("Format: 09XXXXXXXX");
		lblFormatxxxxxxxx.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblFormatxxxxxxxx.setBounds(346, 211, 147, 37);
		frmBooking.getContentPane().add(lblFormatxxxxxxxx);
	}
}
