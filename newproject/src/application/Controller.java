package BankingSystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
public class Controller {
	@FXML
	public void close(ActionEvent e) {
		System.out.println("close");
		primaryStage.close();
	}

}
