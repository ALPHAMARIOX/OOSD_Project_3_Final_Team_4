package gui;

import TE_OBJ.TE_Classes;

import db.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Component;

import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField tfEmail;
	private JPasswordField pwfAgtPassword;
	//private static splash sp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//sp = new splash();
		//sp.setVisible(true);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		//sp.setVisible(false);
	}

	/**
	 * Create the frame.
	 */
	public login() {
		setResizable(false);
		setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("/home/user1/workspace/OOSD_Project_3_Final_Team_4/img/palmtree.png"));
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfEmail = new JTextField();
		tfEmail.setToolTipText("Enter your business email.");
		tfEmail.setBounds(236, 84, 114, 19);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
		pwfAgtPassword = new JPasswordField();
		pwfAgtPassword.setToolTipText("Enter your password.");
		pwfAgtPassword.setBounds(236, 133, 114, 19);
		contentPane.add(pwfAgtPassword);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(69, 86, 70, 15);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(69, 135, 86, 15);
		contentPane.add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setToolTipText("Log into the database.");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnLogin.setBounds(233, 204, 117, 25);
		contentPane.add(btnLogin);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{tfEmail, pwfAgtPassword, btnLogin}));
	}
}
