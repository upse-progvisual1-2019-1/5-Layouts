package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			VBox root = FXMLLoader.load(getClass().getResource("/ViewLayouts.fxml"));
			Scene scene = new Scene(root,400,400);
			Button botoncito = new Button("Boton Programatico");
			botoncito.setOnAction(e -> System.out.println("Hola Lambda"));
			root.getChildren().add(botoncito);
			scene.getStylesheets().add(getClass().getResource("/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		String s;
	}
}
