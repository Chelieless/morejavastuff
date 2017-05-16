package fx.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class secundar extends Application{

	Button ok;
	
	public static void main(String[] args) {
		
		launch(args);
		
	}
	
	@Override
	public void start(Stage primary) throws Exception {
		
		primary.setTitle("JavaFX v2");
		
		ok = new Button();
		ok.setText("OK");
		
		StackPane panou = new StackPane();
		panou.getChildren().add(ok);
		
		Scene scena = new Scene(panou, 400, 300);
		
		primary.setScene(scena);
		primary.show();
		
	}

}
