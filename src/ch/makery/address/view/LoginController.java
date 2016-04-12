package ch.makery.address.view;

import java.awt.event.ActionEvent;

import application.Login;
import application.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;

public class LoginController {
	
	private Login login;
	private MainApp main;
	Stage primaryStage;
	
	@FXML
	private TextField tfUsername;
	
	@FXML
	private PasswordField pwfAgents;
	
	@FXML
	private Label lblError;
	
	@FXML
	private Button btnLogin;
	
	@FXML
	public void login() {
		if (tfUsername.getText() != null && pwfAgents.getText() != null) {
			System.out.print("Works");
		}
		else {
			lblError.setVisible(true);
			tfUsername.clear();
			pwfAgents.clear();
		}
	}
	/*public void initialize() {
		
		btnLogin.setOnAction((event) -> {
			if (tfUsername.getText() != null && pwfAgents.getText() != null) {
				//Login code.
				main.start(primaryStage);
			}
			else {
				lblError.setVisible(true);
				tfUsername.clear();
				pwfAgents.clear();
			}
		});
	}*/
	
}
