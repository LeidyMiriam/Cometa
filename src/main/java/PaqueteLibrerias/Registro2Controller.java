package PaqueteLibrerias;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Registro2Controller {

    @FXML
    private Button botonSiguiente;

    @FXML
    private PasswordField cuadroAlias;

    @FXML
    private TextField cuadroNombre;

    @FXML
    void onBotonSiguienteAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/Registro3.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void onCuadroAliasKeyTyped(KeyEvent event) {

    }

    @FXML
    void onCuadroNombreKeyTyped(KeyEvent event) {

    }

}
