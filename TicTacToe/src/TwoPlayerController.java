import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class TwoPlayerController {
	@FXML
	GridPane twoplayer;
	@FXML
	Pane winner;
	@FXML
	Pane Draw;
	@FXML
	private AnchorPane MainMenu;
	@FXML
	private TextField textField1;

	@FXML
	private TextField textField2;

	@FXML
	private TextField textField3;

	@FXML
	private TextField textField4;

	@FXML
	private TextField textField5;

	@FXML
	private TextField textField6;

	@FXML
	private TextField textField7;

	@FXML
	private TextField textField8;

	@FXML
	private TextField textField9;

	@FXML
	private Button quitButton;

	@FXML
	private Button button1;

	@FXML
	private Button button2;

	@FXML
	private Button button3;

	@FXML
	private Button button4;

	@FXML
	private Button button5;

	@FXML
	private Button button6;

	@FXML
	private Button button7;

	@FXML
	private Button button8;

	@FXML
	private Button button9;

	@FXML
	private Button buttonTwoPlayerX;

	@FXML
	private Button buttonTwoPlayerO;

	int x = 0;
	
	@FXML
	void MainMenuDraw(ActionEvent event)  throws IOException {
		AnchorPane getmainmenu = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
		Draw.getChildren().setAll(getmainmenu);
	}
	@FXML
	void MainMenuWinner(ActionEvent event) throws IOException {
		AnchorPane getmainmenu = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
		winner.getChildren().setAll(getmainmenu);
	}
	@FXML
	void buttonTwoPlayerO(ActionEvent event) {
		x = 0;
		buttonTwoPlayerO.setDisable(true);
		buttonTwoPlayerX.setDisable(true);
	}

	@FXML
	void buttonTwoPlayerX(ActionEvent event) {
		x = 1;
		buttonTwoPlayerO.setDisable(true);
		buttonTwoPlayerX.setDisable(true);
	}

	@FXML
	void button1Press(ActionEvent event) { 
		if (x == 1) {textField1.setText("X");}
		if (x == 0) {textField1.setText("O");}
		button1.setDisable(true);
		findWinner();
		switchTurns();
		setButtonText();
		//findDraw();

	}

	@FXML
	void button2Press(ActionEvent event) {     	
		if (x == 1) {textField2.setText("X");}
		if (x == 0) {textField2.setText("O");}
		button2.setDisable(true);
		findWinner();
		switchTurns();
		setButtonText();
		//findDraw();

	}

	@FXML
	void button3Press(ActionEvent event) {    	
		if (x == 1) {textField3.setText("X");}
		if (x == 0) {textField3.setText("O");}
		button3.setDisable(true);
		switchTurns();
		setButtonText();
		findWinner();
		//findDraw();

	}

	@FXML
	void button4Press(ActionEvent event) { 
		if (x == 1) {textField4.setText("X");}
		if (x == 0) {textField4.setText("O");}
		button4.setDisable(true);
		switchTurns();
		setButtonText();
		findWinner();
		//findDraw();

	}

	@FXML
	void button5Press(ActionEvent event) {    	
		if (x == 1) {textField5.setText("X");}
		if (x == 0) {textField5.setText("O");}
		button5.setDisable(true);
		switchTurns();
		setButtonText();
		findWinner();
		//findDraw();

	}

	@FXML
	void button6Press(ActionEvent event) {    	
		if (x == 1) {textField6.setText("X");}
		if (x == 0) {textField6.setText("O");}
		button6.setDisable(true);
		switchTurns();
		setButtonText();
		findWinner();
		//findDraw();

	}

	@FXML
	void button7Press(ActionEvent event) {   	
		if (x == 1) {textField7.setText("X");}
		if (x == 0) {textField7.setText("O");}
		button7.setDisable(true);
		switchTurns();
		setButtonText();
		findWinner();
		//findDraw();
	}

	@FXML
	void button8Press(ActionEvent event) {    	
		if (x == 1) {textField8.setText("X");}
		if (x == 0) {textField8.setText("O");}
		button8.setDisable(true);
		switchTurns();
		setButtonText();
		findWinner();
		//findDraw();
	}

	@FXML
	void button9Press(ActionEvent event) { 
		if (x == 1) {textField9.setText("X");}
		if (x == 0) {textField9.setText("O");}
		button9.setDisable(true);
		switchTurns();
		setButtonText();
		findWinner();
		//findDraw();
	}


	@FXML
	void quitButton(ActionEvent event) {
		System.exit(0);
	}

	@FXML
	void buttonQuitWinner(ActionEvent event) {
		System.exit(0);
	}

	@FXML
	void buttonRestart(ActionEvent event) {

		try {
			GridPane gettwoplayer = FXMLLoader.load(getClass().getResource("TwoPlayer.fxml"));
			winner.getChildren().setAll(gettwoplayer);
		} catch(Exception e) 
		{
			System.out.println("Error Reloading TicTacToe Board!");
		}
	}
	@FXML
	void buttonDrawRestart(ActionEvent event) {

		try {
			GridPane gettwoplayer = FXMLLoader.load(getClass().getResource("TwoPlayer.fxml"));
			Draw.getChildren().setAll(gettwoplayer);
		} catch(Exception e) 
		{
			System.out.println("Error Reloading TicTacToe Board!");
		}
	}
	public void switchTurns()
	{
		if(x==1) {x = 0;}
		else if(x==0) {x = 1;}
	}

	public void setTextField()
	{
		if (x == 1)
		{
			button1.setText("X");

		}
	}

	public void setButtonText()
	{
		if(x==1) {
			button1.setText("X");
			button2.setText("X");
			button3.setText("X");
			button4.setText("X");
			button5.setText("X");
			button6.setText("X");
			button7.setText("X");
			button8.setText("X");
			button9.setText("X");
		}
		else if (x==0){
			button1.setText("O");
			button2.setText("O");
			button3.setText("O");
			button4.setText("O");
			button5.setText("O");
			button6.setText("O");
			button7.setText("O");
			button8.setText("O");
			button9.setText("O");
		}
	}


	public void findWinner(){

		//Row 1
		if (textField1.getText().equals(textField2.getText()) 
				&&	(textField2.getText().equals( textField3.getText()))){
			System.out.println("Winner Test 1");
			WinnerSlide();
		}
		//Row 2
		else if (textField4.getText().equals(textField5.getText()) 
				&& textField5.getText().equals(textField6.getText())){
			System.out.println("Winner Test 2");

			WinnerSlide();
		}
		//Row 3
		else if (textField7.getText().equals(textField8.getText())
				&& textField8.getText().equals(textField9.getText())){
			System.out.println("Winner Test 3");

			WinnerSlide();
		}
		//Column 1
		else if (textField1.getText().equals(textField4.getText()) 
				&& textField4.getText().equals(textField7.getText())){
			System.out.println("Winner Test 4");

			WinnerSlide();
		}
		//Column 2
		else if (textField2.getText().equals(textField5.getText())
				&& textField5.getText().equals(textField8.getText())){
			System.out.println("Winner Test 5");

			WinnerSlide();
		}
		//Column 3
		else if (textField3.getText().equals(textField6.getText()) 
				&& textField6.getText().equals(textField9.getText())){
			System.out.println("Winner Test 6");

			WinnerSlide();
		}
		//Diagonal 1
		else if (textField1.getText().equals(textField5.getText()) 
				&& textField5.getText().equals(textField9.getText())){
			System.out.println("Winner Test 7");

			WinnerSlide();
		}
		//Diagonal 2
		else if (textField3.getText().equals(textField5.getText()) 
				&& textField5.getText().equals(textField7.getText())){
			System.out.println("Winner Test 8");

			WinnerSlide();

		}
		else if ((textField1.getText().equals("X") || textField1.getText().equals("O")) && 
				(textField2.getText().equals("X") || textField2.getText().equals("O")) &&
				(textField3.getText().equals("X") || textField3.getText().equals("O")) &&
				(textField4.getText().equals("X") || textField4.getText().equals("O")) &&
				(textField5.getText().equals("X") || textField5.getText().equals("O")) &&
				(textField6.getText().equals("X") || textField6.getText().equals("O")) &&
				(textField7.getText().equals("X") || textField7.getText().equals("O")) &&
				(textField8.getText().equals("X") || textField8.getText().equals("O")) &&
				(textField9.getText().equals("X") || textField9.getText().equals("O"))){
			DrawSlide();
		}

	}	

	public void DrawSlide() {
		try {
			Pane getdraw = FXMLLoader.load(getClass().getResource("Draw.fxml"));
			twoplayer.getChildren().setAll(getdraw);

		} catch(Exception e) 
		{
			System.out.println("Error Loading Scene Draw!");
		}	
	}
	public void WinnerSlide(){
		try {
			Pane getsingleplayer = FXMLLoader.load(getClass().getResource("Winner.fxml"));
			twoplayer.getChildren().setAll(getsingleplayer);

		} catch(Exception e) 
		{
			System.out.println("Error Loading Class WinnerPage!");
		}		
	}

	@FXML
	void initialize() {
		assert textField1 != null : "fx:id=\"textField1\" was not injected: check your FXML file 'TwoPlayer.fxml'.";
		assert textField2 != null : "fx:id=\"textField2\" was not injected: check your FXML file 'TwoPlayer.fxml'.";
		assert textField3 != null : "fx:id=\"textField3\" was not injected: check your FXML file 'TwoPlayer.fxml'.";
		assert textField4 != null : "fx:id=\"textField4\" was not injected: check your FXML file 'TwoPlayer.fxml'.";
		assert textField5 != null : "fx:id=\"textField5\" was not injected: check your FXML file 'TwoPlayer.fxml'.";
		assert textField6 != null : "fx:id=\"textField6\" was not injected: check your FXML file 'TwoPlayer.fxml'.";
		assert textField7 != null : "fx:id=\"textField7\" was not injected: check your FXML file 'TwoPlayer.fxml'.";
		assert textField8 != null : "fx:id=\"textField8\" was not injected: check your FXML file 'TwoPlayer.fxml'.";
		assert textField9 != null : "fx:id=\"textField9\" was not injected: check your FXML file 'TwoPlayer.fxml'.";
		assert quitButton != null : "fx:id=\"quitButton\" was not injected: check your FXML file 'TwoPlayer.fxml'.";
		assert button1 != null : "fx:id=\"button1\" was not injected: check your FXML file 'TwoPlayer.fxml'.";
		assert button2 != null : "fx:id=\"button2\" was not injected: check your FXML file 'TwoPlayer.fxml'.";
		assert button3 != null : "fx:id=\"button3\" was not injected: check your FXML file 'TwoPlayer.fxml'.";
		assert button4 != null : "fx:id=\"button4\" was not injected: check your FXML file 'TwoPlayer.fxml'.";
		assert button5 != null : "fx:id=\"button5\" was not injected: check your FXML file 'TwoPlayer.fxml'.";
		assert button6 != null : "fx:id=\"button6\" was not injected: check your FXML file 'TwoPlayer.fxml'.";
		assert button7 != null : "fx:id=\"button7\" was not injected: check your FXML file 'TwoPlayer.fxml'.";
		assert button8 != null : "fx:id=\"button8\" was not injected: check your FXML file 'TwoPlayer.fxml'.";
		assert button9 != null : "fx:id=\"button9\" was not injected: check your FXML file 'TwoPlayer.fxml'.";
		assert buttonTwoPlayerX != null : "fx:id=\"buttonSinglePlayerX\" was not injected: check your FXML file 'TwoPlayer.fxml'.";
		assert buttonTwoPlayerO != null : "fx:id=\"buttonSinglePlayerO\" was not injected: check your FXML file 'TwoPlayer.fxml'.";

	}
}
