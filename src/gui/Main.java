package gui;

//import packages.
import TE_OBJ.TE_Classes;

import settings.ToggleSound;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main extends JFrame {

	//Properties for the Main Frame.
	public ToggleSound ts;
	private JPanel contentPane;
	private JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	protected final JCheckBoxMenuItem chckbxmntmToggleSound = new JCheckBoxMenuItem("Toggle Sound");

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
	//Constructor.
	public Main() {
		ts = new ToggleSound();
		setTitle("Travel Experts Database Modifier");
		setIconImage(Toolkit.getDefaultToolkit().getImage("/home/user1/workspace/OOSD_Project_3_Final_Team_4/img/palmtree.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		
		//Menu bar.
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//File menu.
		JMenu mnFile = new JMenu("File");
		mnFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ts.useSound(chckbxmntmToggleSound.isSelected());
			}
		});
		menuBar.add(mnFile);
		
		//Exit the application. May prompt when there are uncommitted changes.
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, InputEvent.CTRL_MASK));
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ts.useSound(chckbxmntmToggleSound.isSelected());
				System.exit(0);
			}
		});
		
		//New menu for creating new records.
		JMenu mnNew = new JMenu("New");
		mnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ts.useSound(chckbxmntmToggleSound.isSelected());
			}
		});
		mnFile.add(mnNew);
		
		//Creates a new agent record.
		JMenuItem mntmAgent = new JMenuItem("Agent");
		mntmAgent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ts.useSound(chckbxmntmToggleSound.isSelected());
			}
		});
		mnNew.add(mntmAgent);
		
		/*Creates a new package record.*/
		JMenuItem mntmPackage = new JMenuItem("Package");
		mntmPackage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ts.useSound(chckbxmntmToggleSound.isSelected());
			}
		});
		mnNew.add(mntmPackage);
		
		/*Creates a new product record.*/
		JMenuItem mntmProduct = new JMenuItem("Product");
		mntmProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ts.useSound(chckbxmntmToggleSound.isSelected());
			}
		});
		mnNew.add(mntmProduct);
		
		//Creates a product supplier record.
		JMenuItem mntmProductSupplier = new JMenuItem("Product Supplier");
		mntmProductSupplier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ts.useSound(chckbxmntmToggleSound.isSelected());
			}
		});
		mnNew.add(mntmProductSupplier);
		
		//Creates a supplier record.
		JMenuItem mntmSupplier = new JMenuItem("Supplier");
		mntmSupplier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ts.useSound(chckbxmntmToggleSound.isSelected());
			}
		});
		mnNew.add(mntmSupplier);
		
		//Saves uncommitted changes to the database.
		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ts.useSound(chckbxmntmToggleSound.isSelected());
			}
		});
		mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnFile.add(mntmSave);
		
		//Separates the exit item from the others in the File menu.
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		mnFile.add(mntmExit);
		
		//Edit menu.
		JMenu mnEdit = new JMenu("Edit");
		mnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ts.useSound(chckbxmntmToggleSound.isSelected());
			}
		});
		menuBar.add(mnEdit);
		
		//Undo any changes.
		JMenuItem mntmUndo = new JMenuItem("Undo");
		mntmUndo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ts.useSound(chckbxmntmToggleSound.isSelected());
			}
		});
		mntmUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK));
		mnEdit.add(mntmUndo);
		
		//Redo any changes.
		JMenuItem mntmRedo = new JMenuItem("Redo");
		mntmRedo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, InputEvent.CTRL_MASK));
		mntmRedo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ts.useSound(chckbxmntmToggleSound.isSelected());
			}
		});
		mnEdit.add(mntmRedo);
		
		//Separates the Undo/Redo items from the others in the Edit menu.
		JSeparator separator_2 = new JSeparator();
		mnEdit.add(separator_2);
		
		//Cuts a selected item into the clipboard.
		JMenuItem mntmCut = new JMenuItem("Cut");
		mntmCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
		mntmCut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ts.useSound(chckbxmntmToggleSound.isSelected());
			}
		});
		mnEdit.add(mntmCut);
		
		//Copies a selected item into the clipboard.
		JMenuItem mntmCopy = new JMenuItem("Copy");
		mntmCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
		mntmCopy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ts.useSound(chckbxmntmToggleSound.isSelected());
			}
		});
		mnEdit.add(mntmCopy);
		
		//Pastes an item from the clipboard into a selected area; anywhere the cursor is located.
		JMenuItem mntmPaste = new JMenuItem("Paste");
		mntmPaste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ts.useSound(chckbxmntmToggleSound.isSelected());
			}
		});
		mntmPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
		mnEdit.add(mntmPaste);
		
		//Separates the Cut/Copy/Paste from the other items in the Edit menu.
		JSeparator separator_3 = new JSeparator();
		mnEdit.add(separator_3);
		
		//Selects all the items within the cursor's location.
		JMenuItem mntmSelectAll = new JMenuItem("Select All");
		mntmSelectAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ts.useSound(chckbxmntmToggleSound.isSelected());
			}
		});
		mntmSelectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		mnEdit.add(mntmSelectAll);
		
		JSeparator separator_5 = new JSeparator();
		mnEdit.add(separator_5);
		
		JMenuItem mntmFindReplace = new JMenuItem("Find/Replace");
		mntmFindReplace.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK));
		mnEdit.add(mntmFindReplace);
		
		JMenuItem mntmFindNext = new JMenuItem("Find Next");
		mntmFindNext.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_MASK));
		mnEdit.add(mntmFindNext);
		
		JMenuItem mntmFindPrevious = new JMenuItem("Find Previous");
		mntmFindPrevious.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		mnEdit.add(mntmFindPrevious);
		
		//Settings menu.
		JMenu mnSettings = new JMenu("Settings");
		mnSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ts.useSound(chckbxmntmToggleSound.isSelected());
			}
		});
		menuBar.add(mnSettings);
		
		//Opens a dialog box to set the color scheme of the application.
		JMenuItem mntmSetColor = new JMenuItem("Set Color");
		mntmSetColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ts.useSound(chckbxmntmToggleSound.isSelected());
				ColorSettings cSet = new ColorSettings();
				cSet.setVisible(true);
			}
		});
		mnSettings.add(mntmSetColor);
		
		//Opens a dialog box to set the font settings of the application.
		JMenuItem mntmSetFont = new JMenuItem("Set Font");
		mntmSetFont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ts.useSound(chckbxmntmToggleSound.isSelected());
				FontSettings fSet = new FontSettings();
				fSet.setVisible(true);
			}
		});
		mnSettings.add(mntmSetFont);
		
		//Separates the SetFont and SetColor options from the other items in the Settings menu.
		JSeparator separator_1 = new JSeparator();
		mnSettings.add(separator_1);
		
		//Checkbox menu item used to toggle sound on and off.
		//final JCheckBoxMenuItem chckbxmntmToggleSound = new JCheckBoxMenuItem("Toggle Sound");
		chckbxmntmToggleSound.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				ts.useSound(chckbxmntmToggleSound.isSelected());
			}
		});
		mnSettings.add(chckbxmntmToggleSound);
		
		//Help menu.
		JMenu mnHelp = new JMenu("Help");
		mnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ts.useSound(chckbxmntmToggleSound.isSelected());
			}
		});
		menuBar.add(mnHelp);
		
		//Opens the about dialog box, which displays licensing information and application information.
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ts.useSound(chckbxmntmToggleSound.isSelected());
				About about = new About();
				about.setVisible(true);
			}
		});
		
		//Opens a User Manual, which displays information on how to use the application.
		JMenuItem mntmUserManual = new JMenuItem("User Manual");
		mntmUserManual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ts.useSound(chckbxmntmToggleSound.isSelected());
				UserManual uManual = new UserManual();
				uManual.setVisible(true);
			}
		});
		mntmUserManual.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
		mnHelp.add(mntmUserManual);
		
		//Separates the About menu from all the other items in the Help menu.
		JSeparator separator_4 = new JSeparator();
		mnHelp.add(separator_4);
		mnHelp.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane);
		ImageIcon tabIcon = createImageIcon("./img/palmtree.png");
		
	}

	/** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Main.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
	
	//Plays the sound within the ToggleSound object when the ToggleSound checkbox menu item is checked.
	public void useSound() {
		if (chckbxmntmToggleSound.isSelected() == true)
		{
			ts.playSound();
		}
	}
}
