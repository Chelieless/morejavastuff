package fx.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.*;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.*;


public class third extends Application{
	
	Button bt1, bt2;
	Scene sc1, sc2;
	Label label1, label2;
	Stage window;
	
	public static void main(String[] args) {
		
		launch(args);
		
	}

	@Override
	public void start(Stage primary) throws Exception {
		window = primary;
		
		window.setTitle("TEST");
		
		bt1 = new Button("JUS' A TEST");
		
		label1 = new Label("Test label");
		
		bt1.setOnAction(e -> {
			label1.setText("IT'S WURKING");
			boxes.alert("You motherf...", "You just changed my baby's text :(");
		});
		
		VBox panou = new VBox();
		panou.getChildren().addAll(label1, bt1);
		panou.setAlignment(Pos.CENTER);
		panou.setSpacing(25);
		
		
		Scene scena = new Scene(panou, 250, 150);
		
		window.setScene(scena);
		window.show();
	}

}
