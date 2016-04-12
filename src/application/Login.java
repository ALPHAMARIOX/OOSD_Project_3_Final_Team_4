package application;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Login extends Application {

	Stage primaryStage;
	@Override
	public void start(Stage primaryStage) {
		Splash sp = new Splash(); //Splash page.
		try {
			Parent root = FXMLLoader.load
					(getClass().getResource("/ch/makery/address/view/Login.fxml"));
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Travel Experts Login");
			this.primaryStage.getIcons().add(new Image("file:./img/coconut.png"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add
					(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}