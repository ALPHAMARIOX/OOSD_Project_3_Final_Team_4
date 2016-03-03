package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import settings.ToggleSound;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JSlider;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Toolkit;

public class ColorSettings extends JDialog {

	public JComboBox comboBox = new JComboBox();
	public ToggleSound ts = new ToggleSound();
	private final JPanel contentPanel = new JPanel();
	private Main m = new Main();
	public Color purple = new Color(155, 48, 255);
	public Color brown = new Color(80, 42, 42);
	public Color goldenrod = new Color(0xDAA520);
	public Color cinnamon = new Color(0x7B3F00);
	public Color mustard;
	public Color greenMist;
	public Color bacon = new Color(0xC65D57);
	public Color salmon = new Color(0xFA8072);
	public Color poolTable = new Color(0x31B94D);
	public Color darkWood = new Color(0x855E42);
	public Color defaultC = new Color(238, 238, 238);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ColorSettings dialog = new ColorSettings();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ColorSettings() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("/home/user1/workspace/OOSD_Project_3_Final_Team_4/img/palmtree.png"));
		setResizable(false);
		setModal(true);
		setTitle("Select Color Scheme");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JLabel lblChangeColor = new JLabel("Change Color Scheme:");
			contentPanel.add(lblChangeColor);
		}
		{
			/*JComboBox comboBox = new JComboBox();*/
			comboBox.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					//changeColor(comboBox.getSelectedItem());
				}
			});
			//Caps represent the dual color scheme.
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"---", "Black", "Blue", "Cyan", "Dark Gray", "Goldenrod", "Gray", "Green", "Light Gray", "Magenta", "MEAT", "Orange", "Pink", "Red", "Spice", "White", "Yellow"}));
			contentPanel.add(comboBox);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						changeColor(comboBox.getSelectedItem());
						m.useSound();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						m.useSound();
						ColorSettings.this.setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	public void changeColor(Object selectedItem) {
		if (selectedItem == "Goldenrod") {
			ColorSettings.this.setBackground(goldenrod);
			contentPanel.setBackground(goldenrod);
		}
		else if (selectedItem == "Black") {
			ColorSettings.this.setBackground(Color.black);
			contentPanel.setBackground(Color.black);
			//JLabel.this.setForeground(Color.white);
		}
		else if (selectedItem == "MEAT") {
			
		}
		else if (selectedItem == "POOL TABLE") {
			
		}
		else {
			contentPanel.setBackground(defaultC);
		}
	}

}
