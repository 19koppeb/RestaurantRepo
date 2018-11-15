package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginController {

	@FXML
	private Text fail;
	@FXML
	private TextField user;
	@FXML
	private PasswordField pass;
	@FXML
	private Text loginFailed;

	public LoginController() {

	}

	public void login(ActionEvent event) throws Exception {
		File filename = new File("Login.txt");
		Scanner reader = new Scanner(filename);
		while (reader.hasNextLine()) {
			String username = reader.next();
			String password = reader.next();
			if (username.equals((user.getText()))&& password.equals(pass.getText())) {
				Stage primaryStage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
				Scene scene = new Scene(root);
				primaryStage.setScene(scene);
				primaryStage.show();
				fail.setText("GOOD");
				break;
			} else {
				loginFailed.setText("Login Failed");
			}
			System.out.println(username);
			System.out.println(password);
			System.out.println(user.getText());
			System.out.println(pass.getText());
		}
	}

}
