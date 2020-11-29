package Controlador;



import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    @FXML
    private Label l1;
    @FXML
    private Button btnEn;
    @FXML
    private Button btnEl;
    @FXML
    private TextField tf1;
    String nombre = "Francisco";
    

    public void initialize() {
		 btnEn.setOnAction(e ->{
			if(nombre.equalsIgnoreCase(tf1.getText()))
			{
				l1.setText("�Buenos d�as, Francisco! Este es un mensaje de informaci�n");
			} else
			{
				Alert a = new Alert(Alert.AlertType.ERROR); a.setContentText("�Su nombre no es el correcto! Int�ntelo de nuevo");
				a.show();
			}
			clearFields();});
		 
		 btnEl.setOnAction(e ->{
			 clearFields();});
		 
}

	private void clearFields() {
		tf1.clear();

	}
}