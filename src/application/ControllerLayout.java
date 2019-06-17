package application;



import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControllerLayout {

	//mamarre de controles
	@FXML Label lblSaludo;
	@FXML TextField txtNombre;
	
	public void saludar()
	{
		String nombreIngresado = txtNombre.getText();
		String saludo = "habla pelao " + nombreIngresado + "!";
		System.out.println(saludo);
		lblSaludo.setText(saludo);
	}
}
