package ch.makery.address.view;

import application.Login;
import application.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
import javafx.event.*;

public class LoginController {
	
	private Login login;
	private MainApp main;
	private Stage primaryStage;
	
	@FXML
	private TextField tfUsername;
	
	@FXML
	private PasswordField pwfAgents;
	
	@FXML
	private Label lblError;
	
	@FXML
	private Button btnLogin;
	
	@FXML
	private void login() {
		//Button stuff.
		if (tfUsername.getText() != "" && pwfAgents.getText() != "") {
			main.start(primaryStage);
		}
		else {
			lblError.setVisible(true);
			tfUsername.clear();
			pwfAgents.clear();
		}
	}
	
	public void initialize() {
		
		btnLogin.setOnAction((event) -> {
			login();
		});
	}
	
}
