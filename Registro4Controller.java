package PaqueteLibrerias;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class Registro4Controller {

    @FXML
    private Button botonRegistro;

    @FXML
    private TextField cuadroBuscarTags;

    @FXML
    private TextField cuadroOtroBuscoGenero;

    @FXML
    private ToggleGroup grupoBusquedaGenero;

    @FXML
    void onBotonRegistro(ActionEvent event) {
        try {
            // Cargamos el nuevo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/Principal.fxml"));
            Parent root = loader.load();

            // Obtenemos el Stage actual a partir del botón que disparó el evento
            Stage stage = (Stage) botonRegistro.getScene().getWindow();

            // Creamos la nueva escena y la asignamos al stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}