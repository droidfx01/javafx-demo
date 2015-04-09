package net.droidfx01.javaFxDemo.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import net.droidfx01.javaFxDemo.MainApp;
import net.droidfx01.javaFxDemo.model.Person;

public class PersonOverViewController {
	@FXML
	private TableView<Person> personTable;
	@FXML
	private TableColumn<Person, String> firstNameColumn;
	@FXML
	private TableColumn<Person, String> lastNameColumn;

	@FXML
	private Label firstNameLabel;
	@FXML
	private Label lastNameLabel;
	@FXML
	private Label streetLabel;
	@FXML
	private Label postalCodeLabel;
	@FXML
	private Label cityLabel;
	@FXML
	private Label dateOfBirthLabel;
	
	private MainApp mainApp;

	/**
	 * The constructor
	 * The constructor is called before the initialize() method
	 */
	public PersonOverViewController() {
	}
	
	/**
	 * Initializes the controller class. This method is automatically called
	 * after the fxml file has been loaded
	 */
	@FXML
	private void initialize() {
		//Initialize the person table with the two columns
		firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().getFirstName());
		lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().getLastName());
	}
	
	/**
	 * Is called by the main application to give a reference back to itself
	 * 
	 * @param mainApp
	 */
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
		
		//Add observable list data to the table
		personTable.setItems(mainApp.getPersonData());
	}
}
