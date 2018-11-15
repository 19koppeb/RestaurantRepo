package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class RestaurantsController implements Initializable {
	
	public RestaurantsController() {
		
	}
	
	@FXML
	private ListView<String> listView;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ObservableList<String> data = FXCollections.observableArrayList();
		data.addAll("Fuck", "shit");
		listView.setItems(data);
	}

}
