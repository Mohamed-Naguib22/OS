module newproject {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	
	opens BankingSystem to javafx.graphics, javafx.fxml;
}
