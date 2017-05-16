package fx.main;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class boxes {
	
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

}
