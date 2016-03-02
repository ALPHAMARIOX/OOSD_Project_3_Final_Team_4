package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.PUBLIC_MEMBER;

import settings.ToggleSound;

import java.awt.Toolkit;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JCheckBoxMenuItem;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class Main extends JFrame {

	public ToggleSound ts = new ToggleSound();
	private JPanel contentPane;
	private final JCheckBoxMenuItem chckbxmntmToggleSound = new JCheckBoxMenuItem("Toggle Sound");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setTitle("Travel Experts Database Modifier");
		setIconImage(Toolkit.getDefaultToolkit().getImage("/home/user1/workspace/OOSD_Project_3_Final_Team_4/img/palmtree.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JMenu mnNew = new JMenu("New");
		mnFile.add(mnNew);
		
		JMenuItem mntmAgent = new JMenuItem("Agent");
		mnNew.add(mntmAgent);
		
		JMenuItem mntmPackage = new JMenuItem("Package");
		mnNew.add(mntmPackage);
		
		JMenuItem mntmProduct = new JMenuItem("Product");
		mnNew.add(mntmProduct);
		
		JMenuItem mntmProductSupplier = new JMenuItem("Product Supplier");
		mnNew.add(mntmProductSupplier);
		
		JMenuItem mntmSupplier = new JMenuItem("Supplier");
		mnNew.add(mntmSupplier);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);
		
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		mnFile.add(mntmExit);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenuItem mntmUndo = new JMenuItem("Undo");
		mnEdit.add(mntmUndo);
		
		JMenuItem mntmRedo = new JMenuItem("Redo");
		mnEdit.add(mntmRedo);
		
		JSeparator separator_2 = new JSeparator();
		mnEdit.add(separator_2);
		
		JMenuItem mntmCut = new JMenuItem("Cut");
		mnEdit.add(mntmCut);
		
		JMenuItem mntmCopy = new JMenuItem("Copy");
		mnEdit.add(mntmCopy);
		
		JMenuItem mntmPaste = new JMenuItem("Paste");
		mntmPaste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				useSound();
			}
		});
		mntmPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
		mnEdit.add(mntmPaste);
		
		JMenu mnSettings = new JMenu("Settings");
		menuBar.add(mnSettings);
		
		JMenuItem mntmSetColor = new JMenuItem("Set Color");
		mntmSetColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				useSound();
				ColorSettings cSet = new ColorSettings();
				cSet.setVisible(true);
			}
		});
		mnSettings.add(mntmSetColor);
		
		JMenuItem mntmSetFont = new JMenuItem("Set Font");
		mntmSetFont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				useSound();
			}
		});
		mnSettings.add(mntmSetFont);
		
		JSeparator separator_1 = new JSeparator();
		mnSettings.add(separator_1);
		
		final JCheckBoxMenuItem chckbxmntmToggleSound = new JCheckBoxMenuItem("Toggle Sound");
		chckbxmntmToggleSound.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				useSound();
			}
		});
		mnSettings.add(chckbxmntmToggleSound);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				useSound();
				About about = new About();
				about.setVisible(true);
			}
		});
		mnHelp.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	}
	
	public void useSound() {
		if (chckbxmntmToggleSound.isSelected() == true)
		{
			ts.playSound();
		}
	}
}
