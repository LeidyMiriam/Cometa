package PaqueteLibrerias;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class ConfPerfilController {

    @FXML
    private Button BotonEliminarF;

    @FXML
    private Button botonAPrincipal;

    @FXML
    private Label botonAgregar;

    @FXML
    private Button botonCambiaFoto;

    @FXML
    private Button botonEditarF;

    @FXML
    private Button botonEditarV;

    @FXML
    private Button botonEliminarV;

    @FXML
    private Button botonGuardar;

    @FXML
    private TextField cuadroBuscarTags;

    @FXML
    private TextArea cuadroDescripcion;

    @FXML
    private TextField cuadroIngresarTags;

    @FXML
    private TextField cuadroMiAlias;

    @FXML
    private TextField cuadroMiDireccion;

    @FXML
    private TextField cuadroMiNombreReal;

    @FXML
    private TextField cuadroOtroBuscoGenero;

    @FXML
    private TextField cuadroSoyOtroGenero;

    @FXML
    private ToggleGroup grupoBusquedaGenero;

    @FXML
    private ToggleGroup grupoGenero;

    @FXML
    private void cambiarVista(ActionEvent event, String ruta) throws IOException {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource(ruta)
        );

        Parent root = loader.load();

        Stage stage = (Stage)
                ((Node) event.getSource())
                        .getScene()
                        .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    void onBotonAPrincipalAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Principal.fxml");
    }

    @FXML
    void onBotonGuardarAction(ActionEvent event) {

    }

}