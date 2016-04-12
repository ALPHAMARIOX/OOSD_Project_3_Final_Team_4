package gui;

//import gui.Main;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import settings.ToggleSound;

import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

//Dialog box that can be access via the Main application in the Help menu under "About"
public class About extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private Main m = new Main();
	private ToggleSound ts = new ToggleSound();

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			About dialog = new About();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public About() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("/home/user1/workspace/OOSD_Project_3_Final_Team_4/img/palmtree.png"));
		setResizable(false);
		setModal(true);
		setTitle("About");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setToolTipText("Return to the program.");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						ts.useSound(m.chckbxmntmToggleSound.isSelected());
						About.this.setVisible(false);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

}
