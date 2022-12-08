package application;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
public class Controller implements Initializable {
    
    @FXML
    private TableView<Client> ClientsTable;
	
    @FXML
    private TableColumn<Client, String> Address;

    @FXML
    private TableColumn<Client, String> CVC;

    @FXML
    private TableColumn<Client, Integer> CurrentBalance;

    @FXML
    private TableColumn<Client, String> Phone;

    @FXML
    private TableColumn<Client, String> accID;

    @FXML
    private TableColumn<Client, String> cardNum;

    @FXML
    private TableColumn<Client, String> clientSSN;

    @FXML
    private TableColumn<Client, String> fName;

    @FXML
    private TableColumn<Client, String> lName;
    ObservableList<Client> observableList = FXCollections.observableArrayList(
			new Client("22222","275118295","456",1282952,"4521","sa","saas","222579","giza")
			);

	public void close(ActionEvent e) {
		Platform.exit();
	}
	private Stage stage;
	private Scene scene;
	private Parent root;
	double x,y;
	public void openAllClients(ActionEvent e) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("viewClients.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		root.setOnMousePressed(evt->{
			x = evt.getSceneX();
			y = evt.getSceneY();
		});
		root.setOnMouseDragged(evt->{
			stage.setX(evt.getScreenX() - x);
			stage.setY(evt.getScreenY() - y);
			
		});
		stage.setScene(scene);
		stage.show();
		}

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                accID.setCellValueFactory(new PropertyValueFactory<>("AccId"));
		cardNum.setCellValueFactory(new PropertyValueFactory<>("Cardnum"));
		CurrentBalance.setCellValueFactory(new PropertyValueFactory<>("CurrentBalance"));
		clientSSN.setCellValueFactory(new PropertyValueFactory<>("Ssn"));
		CVC.setCellValueFactory(new PropertyValueFactory<>("Cvc"));
		fName.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
		lName.setCellValueFactory(new PropertyValueFactory<>("LastName"));
		Phone.setCellValueFactory(new PropertyValueFactory<>("PhoneNum"));
		Address.setCellValueFactory(new PropertyValueFactory<>("Address"));
		ClientsTable.setItems(observableList);
    }
	}
