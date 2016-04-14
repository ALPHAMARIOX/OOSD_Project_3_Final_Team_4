package application;

import java.io.IOException;

import ch.makery.address.view.LoginController;
import ch.makery.address.view.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;
	
	@Override
	public void start(Stage primaryStage) {
		Splash sp = new Splash();
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle
		("Travel Experts Database Modifier");
		this.primaryStage.getIcons().add(new Image("file:./img/coconut.png"));
		
		initRootLayout();
		
		showMain();
	}

	//Person Overview or the interface used for this window.
	private void showMain() {
		// TODO Auto-generated method stub
		try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("/view/Main.fxml"));
            AnchorPane main = (AnchorPane) loader.load();

            // Set main into the center of root layout.
            rootLayout.setCenter(main);
            
            MainController controller = loader.getController();
            controller.setMainApp(this);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	//Root layout
	private void initRootLayout() {
		// TODO Auto-generated method stub
		try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public Stage getPrimaryStage() {
        return primaryStage;
    }

	public static void main(String[] args) {
		launch(args);
	}
}
