package PaqueteLibrerias;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Registro3Controller {

    @FXML
    private Button botonSiguiente;

    @FXML
    private TextField cuadroCP;

    @FXML
    private TextField cuadroCiudad;

    @FXML
    private TextField cuadroDireccion;

    @FXML
    private TextField cuadroPais;

    @FXML
    private TextField cuadroSoyOtroGenero;

    @FXML
    private ToggleGroup grupoGenero;

    @FXML
    void onBotonSiguienteAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/Registro4.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void onCuadroCPKeyTyped(KeyEvent event) {

    }

    @FXML
    void onCuadroCiudadKeyTyped(KeyEvent event) {

    }

    @FXML
    void onCuadroDireccionKeyTyped(KeyEvent event) {

    }

    @FXML
    void onCuadroPaisKeyTyped(KeyEvent event) {

    }

    @FXML
    void oncuadroTextoContrasena2KeyTyped(KeyEvent event) {

    }

}
