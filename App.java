import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
	
	// Window dimensions
	public int windowSizeH = 500;
	public int windowSizeV = 800;
	
	public static void main (String[] args) {
		launch(args);
	}
	
	// Draw the window
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Window Title");
		StackPane layout = new StackPane();
		Scene scene = new Scene(layout, windowSizeH, windowSizeV);
		primaryStage.setScene(scene);
		primaryStage.show();

	}
}
