package fx.main;

import java.util.Random;

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


@SuppressWarnings("unused")

public class third extends Application{
	
	Button bt1, bt2;
	Scene sc1, sc2;
	Label label1, label2;
	static Stage window;
	
	String[] nume = {"ABC", "BCA", "CBA"};
	
	int picker;
	
	public static void main(String[] args) {
		
		launch(args);
		
	}

	@Override
	public void start(Stage primary) throws Exception {
		window = primary;
		
		window.setTitle("TEST");
		window.setResizable(false);
		
		window.setOnCloseRequest(e -> {
			
			e.consume();
			quitProgram();
			
		});
		
		bt1 = new Button("JUS' A TEST");
		
		bt2 = new Button("Quit Program");
		
		bt2.setOnAction(e -> {
			quitProgram();
		});
		
		picker = (int)(Math.random() * nume.length);
		String iname = nume[picker];
		label1 = new Label("Program's Baby: " + iname);
		
		bt1.setOnAction(e -> {
			picker = (int)(Math.random() * nume.length);
			String fnume = nume[picker];
			label1.setText("Program's Baby: " + fnume);
			boxes.alert("You motherf...", "You just changed my baby's text :(");
		});
		
		VBox panou = new VBox();
		panou.getChildren().addAll(label1, bt1, bt2);
		panou.setAlignment(Pos.CENTER);
		panou.setSpacing(25);
		
		
		Scene scena = new Scene(panou, 250, 150);
		
		window.setScene(scena);
		window.show();
	}

	public static void quitProgram() { 
		
		boolean answer = boxes.quit("Quit", "Are you sure you want to quit?");
		if(answer) {
			
			window.close();
			
		}
		
		
	}
	
	
}
