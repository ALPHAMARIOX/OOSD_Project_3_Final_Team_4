package ch.makery.address.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import application.MainApp;
import ch.makery.address.model.*;
import ch.makery.address.view.tab.AgentsController;
import ch.makery.address.view.tab.CustomersController;
import ch.makery.address.view.tab.PackagesController;
import ch.makery.address.view.tab.ProductSuppliersController;
import ch.makery.address.view.tab.ProductsController;
import ch.makery.address.view.tab.SuppliersController;

public class PersonOverviewController {
	
	//@FXML
    //private TableView<Person> personTable;
    //@FXML
    //private TableColumn<Person, String> firstNameColumn;
    //@FXML
    //private TableColumn<Person, String> lastNameColumn;

    @FXML
    AgentsController agtController;
    @FXML
    CustomersController custController;
    @FXML
    PackagesController pkgController;
    @FXML
    ProductsController prdController;
    @FXML
    SuppliersController supController;
    @FXML
    ProductSuppliersController psuController;

    // Reference to the main application.
    private MainApp mainApp;

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public PersonOverviewController() {
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    public void initialize() {
        // Initialize the person table with the two columns.
        agtController.init(this);
        custController.init(this);
        pkgController.init(this);
        prdController.init(this);
        supController.init(this);
        psuController.init(this);
    }

    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

        // Add observable list data to the table
        //personTable.setItems(mainApp.getPersonData());
    }
    
}
