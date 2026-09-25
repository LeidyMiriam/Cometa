package PaqueteLibrerias;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.IOException;

public class ConfiguracionController {

    @FXML
    private ComboBox<String> comboBoxIdioma;

    @FXML
    private void initialize() {
        comboBoxIdioma.getItems().addAll(
                "Español",
                "Inglés",
                "Francés"
        );
    }

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
    private void onBotonAConfiguracionPerfilAction(ActionEvent event) throws  IOException {
        cambiarVista(event, "/vistas/ConfiguracionPerfil.fxml");
    }

    @FXML
    private void onBotonSuscripcionAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Suscripcion.fxml");
    }

    //Botones de la Parte de abajo para todas las vistas

    @FXML
    private void onBotonALikesCoAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Likes.fxml");
    }

    @FXML
    private void onBotonAMensajesCoAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Mensajes.fxml");
    }

    @FXML
    private void onBotonAPerfilCoAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Perfil.fxml");
    }

    @FXML
    private void onBotonAConfiguracionCoAction(ActionEvent event) throws IOException {

    }
}
