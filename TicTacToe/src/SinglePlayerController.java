import java.io.IOException;
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class SinglePlayerController {
	@FXML
	Pane loser;
	@FXML
	GridPane singleplayer;
	@FXML
	Pane winner2;
	@FXML
	private Pane Draw2;
	@FXML
	private AnchorPane MainMenu;

	@FXML
	private TextField textField1 = null;

	@FXML
	private TextField textField2 = null;

	@FXML
	private TextField textField3 = null;

	@FXML
	private TextField textField4 = null;

	@FXML
	private TextField textField5 = null;

	@FXML
	private TextField textField6 = null;

	@FXML
	private TextField textField7 = null;

	@FXML
	private TextField textField8 = null;

	@FXML
	private TextField textField9 = null;

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
	private Button buttonSinglePlayerX;

	@FXML
	private Button buttonSinglePlayerO;

	int x = 1;

	Random roll = new Random();		//import the randon class from java.util and made the object, roll.
	int button = roll.nextInt(9) + 1;	//the int that rolls the random number (0 - 8) + 1

	public void compTurn()		//method that determinds which button the computer will pick.
	{
		if (button1.isDisabled()&&button2.isDisabled()&&button3.isDisabled()&&
				button4.isDisabled()&&button5.isDisabled()&&button6.isDisabled()&&
				button7.isDisabled()&&button8.isDisabled()&&button9.isDisabled())
		{
			System.out.println("comp checked if all are disabled");
			return;
		}
		else
		{
			button = roll.nextInt(9) + 1;
			if(x == 0) { // o is the comp turn when you are x

				switch (button) {

				case 1:	
					System.out.println("roll 1");
					checkDisable();
					button1.fire();
					break;

				case 2:
					System.out.println("roll 2");
					checkDisable();
					button2.fire();
					break;

				case 3:
					System.out.println("roll 3");
					checkDisable();
					button3.fire();
					break;

				case 4:
					System.out.println("roll 4");
					checkDisable();			
					button4.fire();
					break;

				case 5:
					System.out.println("roll 5");
					checkDisable();
					button5.fire();
					break;

				case 6:
					System.out.println("roll 6");
					checkDisable();
					button6.fire();
					break;

				case 7:
					System.out.println("roll 7");
					checkDisable();
					button7.fire();
					break;

				case 8:
					System.out.println("roll 8");
					checkDisable();
					button8.fire();
					break;

				case 9:
					System.out.println("roll 9");
					checkDisable();
					button9.fire();
					break;
				}
			}
		}
	}
	public void checkDisable()	//method that checks for the comp if the button is disabled
	{
		if ((button == 1) && (button1.isDisabled()))
		{
			compTurn();
		}
		else if ((button == 2) && (button2.isDisabled()))
		{
			compTurn();
		}
		else if ((button == 3) && (button3.isDisabled()))
		{
			compTurn();
		}
		else if ((button == 4) && (button4.isDisabled()))
		{
			compTurn();
		}
		else if ((button == 5) && (button5.isDisabled()))
		{
			compTurn();
		}
		else if ((button == 6) && (button6.isDisabled()))
		{
			compTurn();
		}
		else if ((button == 7) && (button7.isDisabled()))
		{
			compTurn();
		}
		else if ((button == 8) && (button8.isDisabled()))
		{
			compTurn();
		}
		else if ((button == 9) && (button9.isDisabled()))
		{
			compTurn();
		}
	}
	@FXML
	void MainMenuDraw2(ActionEvent event) throws IOException {
		AnchorPane getmainmenu = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
		Draw2.getChildren().setAll(getmainmenu);
	}
	@FXML
	void MainMenuWinner2(ActionEvent event) throws IOException {
		AnchorPane getmainmenu = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
		winner2.getChildren().setAll(getmainmenu);
	}
	@FXML
	void buttonQuitWinner2(ActionEvent event) {
		System.exit(0);
	}
	@FXML
	void buttonRestart(ActionEvent event) throws IOException
		{
			GridPane getrestartsingle = FXMLLoader.load(getClass().getResource("SinglePlayer.fxml"));
			Draw2.getChildren().setAll(getrestartsingle);
		} 
		@FXML
		void button1Press(ActionEvent event) { 
			if (x == 1) {textField1.setText("X");}
			if (x == 0) {textField1.setText("O");}
			button1.setDisable(true);
			switchTurns();
			setButtonText();
			compTurn();
			findWinner();
		}

		@FXML
		void button2Press(ActionEvent event) {     	
			if (x == 1) {textField2.setText("X");}
			if (x == 0) {textField2.setText("O");}
			button2.setDisable(true);
			switchTurns();
			setButtonText();
			compTurn();
			findWinner();
		}

		@FXML
		void button3Press(ActionEvent event) {    	
			if (x == 1) {textField3.setText("X");}
			if (x == 0) {textField3.setText("O");}
			button3.setDisable(true);
			switchTurns();
			setButtonText();
			compTurn();
			findWinner();
		}

		@FXML
		void button4Press(ActionEvent event) { 
			if (x == 1) {textField4.setText("X");}
			if (x == 0) {textField4.setText("O");}
			button4.setDisable(true);
			switchTurns();
			setButtonText();
			compTurn();
			findWinner();
		}

		@FXML
		void button5Press(ActionEvent event) {    	
			if (x == 1) {textField5.setText("X");}
			if (x == 0) {textField5.setText("O");}
			button5.setDisable(true);
			switchTurns();
			setButtonText();
			compTurn();
			findWinner();
		}

		@FXML
		void button6Press(ActionEvent event) {    	
			if (x == 1) {textField6.setText("X");}
			if (x == 0) {textField6.setText("O");}
			button6.setDisable(true);
			switchTurns();
			setButtonText();
			compTurn();
			findWinner();
		}

		@FXML
		void button7Press(ActionEvent event) {   	
			if (x == 1) {textField7.setText("X");}
			if (x == 0) {textField7.setText("O");}
			button7.setDisable(true);
			switchTurns();
			setButtonText();
			compTurn();
			findWinner();
		}

		@FXML
		void button8Press(ActionEvent event) {    	
			if (x == 1) {textField8.setText("X");}
			if (x == 0) {textField8.setText("O");}
			button8.setDisable(true);
			switchTurns();
			setButtonText();
			compTurn();
			findWinner();

		}

		@FXML
		void button9Press(ActionEvent event) { 
			if (x == 1) {textField9.setText("X");}
			if (x == 0) {textField9.setText("O");}
			button9.setDisable(true);
			switchTurns();
			setButtonText();
			compTurn();
			findWinner();
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
		void buttonWinRestart(ActionEvent event) {

			try {
				GridPane getsingleplayer = FXMLLoader.load(getClass().getResource("SinglePlayer.fxml"));
				winner2.getChildren().setAll(getsingleplayer);
			} catch(Exception e) 
			{
				System.out.println("Error Reloading TicTacToe Board!");
			}
		}

		@FXML
		void MainMenuLoser(ActionEvent event) throws IOException {
			AnchorPane getmainmenu = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
			loser.getChildren().setAll(getmainmenu);
		}

		@FXML
		void buttonQuitLoser(ActionEvent event) {
			System.exit(0);
		}

		@FXML
		void buttonLoserRestart(ActionEvent event) {
			try {
				GridPane getrestartsingle = FXMLLoader.load(getClass().getResource("SinglePlayer.fxml"));
				loser.getChildren().setAll(getrestartsingle);
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
			if (textField1.getText().equals("X") 
					&&	(textField2.getText().equals("X") && (textField3.getText().equals("X")))){
				System.out.println("Winner Test 1");
				WinnerSlide();
			}
			else if (textField1.getText().equals("O") 
					&&	(textField2.getText().equals("O") && (textField3.getText().equals("O")))){
				System.out.println("Loser Test 1");
				LoserSlide();
			}
			//Row 2
			else if (textField4.getText().equals("X") 
					&&	(textField5.getText().equals("X") && (textField6.getText().equals("X")))){
				System.out.println("Winner Test 1");
				WinnerSlide();
			}
			else if (textField4.getText().equals("O") 
					&&	(textField5.getText().equals("O") && (textField6.getText().equals("O")))){
				System.out.println("Loser Test 1");
				LoserSlide();
			}
			//Row 3
			else if (textField7.getText().equals("X") 
					&&	(textField8.getText().equals("X") && (textField9.getText().equals("X")))){
				System.out.println("Winner Test 1");
				WinnerSlide();
			}
			else if (textField7.getText().equals("O") 
					&&	(textField8.getText().equals("O") && (textField9.getText().equals("O")))){
				System.out.println("Loser Test 1");
				LoserSlide();
			}
			//Column 1
			else if (textField1.getText().equals("X") 
					&&	(textField4.getText().equals("X") && (textField7.getText().equals("X")))){
				System.out.println("Winner Test 1");
				WinnerSlide();
			}
			else if (textField1.getText().equals("O") 
					&&	(textField4.getText().equals("O") && (textField7.getText().equals("O")))){
				System.out.println("Loser Test 1");
				LoserSlide();
			}
			//Column 2
			else if (textField2.getText().equals("X") 
					&&	(textField5.getText().equals("X") && (textField8.getText().equals("X")))){
				System.out.println("Winner Test 1");
				WinnerSlide();
			}
			else if (textField2.getText().equals("O") 
					&&	(textField5.getText().equals("O") && (textField8.getText().equals("O")))){
				System.out.println("Loser Test 1");
				LoserSlide();
			}
			//Column 3

			else if (textField3.getText().equals("X") 
					&&	(textField6.getText().equals("X") && (textField9.getText().equals("X")))){
				System.out.println("Winner Test 1");
				WinnerSlide();
			}
			else if (textField3.getText().equals("O") 
					&&	(textField6.getText().equals("O") && (textField9.getText().equals("O")))){
				System.out.println("Loser Test 1");
				LoserSlide();
			}
			//Diagonal 1
			else if (textField1.getText().equals("X") 
					&&	(textField5.getText().equals("X") && (textField9.getText().equals("X")))){
				System.out.println("Winner Test 1");
				WinnerSlide();
			}
			else if (textField1.getText().equals("O") 
					&&	(textField5.getText().equals("O") && (textField9.getText().equals("O")))){
				System.out.println("Loser Test 1");
				LoserSlide();
			}
			//Diagonal 2

			else if (textField3.getText().equals("X") 
					&&	(textField5.getText().equals("X") && (textField7.getText().equals("X")))){
				System.out.println("Winner Test 1");
				WinnerSlide();
			}
			else if (textField3.getText().equals("O") 
					&&	(textField5.getText().equals("O") && (textField7.getText().equals("O")))){
				System.out.println("Loser Test 1");
				LoserSlide();
			}
			else if ((textField1.getText().equals("X") || textField1.getText().equals("O")) && 
					(textField2.getText().equals("X") || textField2.getText().equals("O")) &&
					(textField3.getText().equals("X") || textField3.getText().equals("O")) &&
					(textField4.getText().equals("X") || textField4.getText().equals("O")) &&
					(textField5.getText().equals("X") || textField5.getText().equals("O")) &&
					(textField6.getText().equals("X") || textField6.getText().equals("O")) &&
					(textField7.getText().equals("X") || textField7.getText().equals("O")) &&
					(textField8.getText().equals("X") || textField8.getText().equals("O")) &&
					(textField9.getText().equals("X") || textField9.getText().equals("O")))		
				DrawSlide();

		}

		public void DrawSlide() {
			System.out.println("step1");
			try {
				Pane getDraw = FXMLLoader.load(getClass().getResource("Draw2.fxml"));
				singleplayer.getChildren().setAll(getDraw);

			} catch(Exception e) 
			{
				System.out.println("Error Loading Scene Draw2.fxml!");
			}
		}
		public void WinnerSlide(){
			try {
				Pane getWinner = FXMLLoader.load(getClass().getResource("Winner2.fxml"));
				singleplayer.getChildren().setAll(getWinner);

			} catch(Exception e) 
			{
				System.out.println("Error Loading Scene Winner2!");
			}	
		}

		public void LoserSlide(){
			try {
				Pane getloser = FXMLLoader.load(getClass().getResource("Loser.fxml"));
				singleplayer.getChildren().setAll(getloser);

			} catch(Exception e) 
			{
				System.out.println("Error Loading Scene loser!");
			}		
		}

		@FXML
		void initialize() {
			assert button1 != null : "fx:id=\"button1\" was not injected: check your FXML file 'SinglePlayer.fxml'.";
			assert button2 != null : "fx:id=\"button2\" was not injected: check your FXML file 'SinglePlayer.fxml'.";
			assert button3 != null : "fx:id=\"button3\" was not injected: check your FXML file 'SinglePlayer.fxml'.";
			assert button4 != null : "fx:id=\"button4\" was not injected: check your FXML file 'SinglePlayer.fxml'.";
			assert button5 != null : "fx:id=\"button5\" was not injected: check your FXML file 'SinglePlayer.fxml'.";
			assert button6 != null : "fx:id=\"button6\" was not injected: check your FXML file 'SinglePlayer.fxml'.";
			assert button7 != null : "fx:id=\"button7\" was not injected: check your FXML file 'SinglePlayer.fxml'.";
			assert button8 != null : "fx:id=\"button8\" was not injected: check your FXML file 'SinglePlayer.fxml'.";
			assert button9 != null : "fx:id=\"button9\" was not injected: check your FXML file 'SinglePlayer.fxml'.";
			assert textField1 != null : "fx:id=\"textField1\" was not injected: check your FXML file 'SinglePlayer.fxml'.";
			assert textField2 != null : "fx:id=\"textField2\" was not injected: check your FXML file 'SinglePlayer.fxml'.";
			assert textField3 != null : "fx:id=\"textField3\" was not injected: check your FXML file 'SinglePlayer.fxml'.";
			assert textField4 != null : "fx:id=\"textField4\" was not injected: check your FXML file 'SinglePlayer.fxml'.";
			assert textField5 != null : "fx:id=\"textField5\" was not injected: check your FXML file 'SinglePlayer.fxml'.";
			assert textField6 != null : "fx:id=\"textField6\" was not injected: check your FXML file 'SinglePlayer.fxml'.";
			assert textField7 != null : "fx:id=\"textField7\" was not injected: check your FXML file 'SinglePlayer.fxml'.";
			assert textField8 != null : "fx:id=\"textField8\" was not injected: check your FXML file 'SinglePlayer.fxml'.";
			assert textField9 != null : "fx:id=\"textField9\" was not injected: check your FXML file 'SinglePlayer.fxml'.";
			assert buttonSinglePlayerX != null : "fx:id=\"buttonSinglePlayerX\" was not injected: check your FXML file 'SinglePlayer.fxml'.";
			assert buttonSinglePlayerO != null : "fx:id=\"buttonSinglePlayerO\" was not injected: check your FXML file 'SinglePlayer.fxml'.";
		}
	}
