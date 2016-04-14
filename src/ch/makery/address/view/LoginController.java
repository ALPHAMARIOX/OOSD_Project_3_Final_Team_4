package ch.makery.address.view;

import java.awt.event.ActionEvent;

import org.omg.CORBA.PUBLIC_MEMBER;

import application.Login;
import javafx.event.EventHandler;
//import application.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
//import javafx.event.*;

public class LoginController {
	
	private Login login = new Login();
	//private MainApp main;
	private Stage mainStage;
	
	@FXML
	private TextField tfUsername;
	
	@FXML
	private PasswordField pwfAgents;
	
	@FXML
	private Label lblError;
	
	@FXML
	private Button btnLogin;
	
	@FXML
	private void login() throws Exception {
		//Button stuff.
		if (tfUsername.getText() != "" && pwfAgents.getText() != "") {
			login.dispose(mainStage);
		}
		else {
			lblError.setVisible(true);
			tfUsername.clear();
			pwfAgents.clear();
		}
	}
	
	public void initialize() {
		
		btnLogin.setOnAction((event) -> {
			try {
				login();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
	
}
