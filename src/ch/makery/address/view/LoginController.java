package ch.makery.address.view;

import java.awt.event.ActionEvent;

import application.Login;
import application.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;

public class LoginController {
	
	private Login login;
	
	@FXML
	private TextField tfUsername;
	
	@FXML
	private PasswordField pwfAgents;
	
	@FXML
	private Label lblError;
	
	@FXML
	private Button btnLogin;
	
	@FXML
	public void initialize() {
		
		btnLogin.setOnAction((event) -> {
			if (tfUsername.getText() != null && pwfAgents.getText() != null) {
				//Login code.
				MainApp main = new MainApp();
			}
			else {
				lblError.setVisible(true);
				tfUsername.clear();
				pwfAgents.clear();
			}
		});
	}
	
}
