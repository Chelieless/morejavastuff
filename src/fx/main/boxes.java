package fx.main;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class boxes {
	
	static boolean answer = false;
	
	public static void alert(String title, String message) {
		
		Stage window = new Stage();
		window.setTitle(title);
		window.initModality(Modality.APPLICATION_MODAL);
		window.setMinWidth(300);
		window.setMinHeight(150);
		window.setResizable(false);
		
		Label text = new Label();
		text.setText(message);
		Button close = new Button();
		close.setText("OK!");
		close.setOnAction(e -> window.close());
		
		VBox panel = new VBox();
		panel.getChildren().addAll(text, close);
		panel.setAlignment(Pos.CENTER);
		panel.setSpacing(25);
		
		Scene scena = new Scene(panel);
		window.setScene(scena);
		window.showAndWait();
		
		
		
	}
	
	public static boolean quit(String title, String message) {
		
		
		Stage window = new Stage();
		window.setTitle(title);
		window.initModality(Modality.APPLICATION_MODAL);
		window.setMinWidth(300);
		window.setMinHeight(150);
		window.setResizable(false);
		
		Label text = new Label();
		text.setText(message);
		Button yes = new Button("Yes");
		Button no = new Button("No");
		
		yes.setOnAction(e -> {
			
			answer = true;
			window.close();
			
		});
		no.setOnAction(e -> {
			
			answer = false;
			window.close();
			
		});
		
		VBox panel = new VBox();
		panel.getChildren().addAll(yes, no);
		panel.setAlignment(Pos.CENTER);
		panel.setSpacing(25);
		
		Scene scena = new Scene(panel);
		window.setScene(scena);
		window.showAndWait();
		
		return answer;
		
	}
}
