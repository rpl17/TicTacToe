import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class MainMenu {
	@FXML
	Pane htp;
	@FXML
	GridPane singleplayer;
	@FXML
	GridPane twoplayer;
	@FXML
	private AnchorPane MainMenu;
	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private Button twoPlayerButton;

	@FXML
	private Button singlePlayerButton;

	@FXML
	private Button htpButton;

	@FXML
	private Button quitButton;


	@FXML
	void twoPlayerButton(ActionEvent event) throws IOException 
	{
		try {
			GridPane getTwoPlayer = FXMLLoader.load(getClass().getResource("TwoPlayer.fxml"));
            MainMenu.getChildren().setAll(getTwoPlayer);

		} catch(Exception e) 
		{
			System.out.println("Error Loading Scene TwoPlayer.fxml!");
		}
	}
	@FXML
	void singlePlayerButton(ActionEvent event) throws IOException 
	{
		try {
			GridPane getSinglePlayer = FXMLLoader.load(getClass().getResource("SinglePlayer.fxml"));
            MainMenu.getChildren().setAll(getSinglePlayer);

		} catch(Exception e) 
		{
			System.out.println("Error Loading Scene SinglePlayer.fxml!");
		}
	}

	@FXML
	void htpButton(ActionEvent event) throws IOException 
	{
		try {
			Pane getHowToPlay = FXMLLoader.load(getClass().getResource("HowToPlay.fxml"));
            MainMenu.getChildren().setAll(getHowToPlay);

		} catch(Exception e) 
		{
			System.out.println("Error Loading Scene HowToPlay.fxml!");
		}
	}
	@FXML
	void backButton(ActionEvent event) throws IOException 
	{
		try {
			AnchorPane getMainMenu = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
			htp.getChildren().setAll(getMainMenu);

		} catch(Exception e) 
		{
			System.out.println("Error Loading Scene MainMenu.fxml from How to Play!");
		}
	}
	@FXML
	void quitButton(ActionEvent event) {
		System.exit(0);
	}

	@FXML
	void initialize() {
		assert twoPlayerButton != null : "fx:id=\"twoPlayerButton\" was not injected: check your FXML file 'MainMenu.fxml'.";
		assert quitButton != null : "fx:id=\"quitButton\" was not injected: check your FXML file 'MainMenu.fxml'.";
		assert singlePlayerButton != null : "fx:id=\"singlePlayerButton\" was not injected: check your FXML file 'MainMenu.fxml'.";

	}
}
