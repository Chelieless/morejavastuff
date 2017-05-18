package fx.main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class fourth extends Application {

	static Stage window;
	
	public static void main(String[] args) {
		
		launch(args);
		
	}
	
	
	@Override
	public void start(Stage stage) throws Exception {
		
		window = stage;
		
		window.setTitle("Login Interface");
		window.setMinHeight(150);
		window.setMinWidth(350);
		window.setResizable(false);
		window.setOnCloseRequest(e -> {
			e.consume();
			quitProgram();
			
			
		});
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(15);
		grid.setHgap(15);
		
		// Nume
		Label numeText = new Label("Nume: ");
		GridPane.setConstraints(numeText, 3, 2);
		
		TextField numeField = new TextField();
		numeField.setPromptText("Username aici");
		GridPane.setConstraints(numeField, 4, 2);
		
		// Parola 
		Label parolaText = new Label("Parola: ");
		GridPane.setConstraints(parolaText, 3, 3);
		
		TextField parolaField = new TextField();
		parolaField.setPromptText("Parola aici");
		GridPane.setConstraints(parolaField, 4, 3);
		
		// Buton - login
		
		Button login = new Button("Login");
		login.setOnAction(e -> {
			
			if(numeField.getText().isEmpty()) {
				
				boxes.alert("Login failed!", "Login failed!\nPlease enter your username!");
				
			}
			if(parolaField.getText().isEmpty()) {
				
				boxes.alert("Login failed!", "Login failed!\nPlease enter your password!");
				
			}
			
			if(!(numeField.getText().isEmpty() && parolaField.getText().isEmpty())) {
				
				boxes.alert("Login success!", "You have been successfully logged in!\nWelcome back, " + numeField.getText() + "!");
				
			}
			
		});
		
		// Buton - quit
		
		Button quit = new Button("Quit");
		quit.setOnAction(e -> quitProgram());
		
		HBox butoane = new HBox();
		butoane.getChildren().addAll(login, quit);
		butoane.setSpacing(15);
		GridPane.setConstraints(butoane, 4, 4);
		
		grid.getChildren().addAll(numeText, numeField, parolaText, parolaField, butoane);
		
		Scene scena = new Scene(grid);
		
		window.setScene(scena);
		window.show();
	}
	
	private static void quitProgram() {
		
		boolean answer = boxes.quit("Quit", "Are you sure you want to quit?");
		if(answer) {
			
			window.close();
			
		}
		
	}

}
