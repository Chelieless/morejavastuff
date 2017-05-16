package fx.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class principal extends Application {
	
	Button ok;
	
	public static void main(String[] args) {
		
		launch(args);
		
	}

	@Override
	public void start(Stage primary) throws Exception {
		
		primary.setTitle("JavaFX");
		
		ok = new Button();
		ok.setText("OK");
		
		StackPane layout = new StackPane();
		layout.getChildren().add(ok);
		
		Scene scena = new Scene(layout, 400, 300);
		primary.setScene(scena);
		primary.show();
		
	}

}
