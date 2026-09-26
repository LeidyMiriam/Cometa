package PaqueteLibrerias;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class ConfiguracionController {

    @FXML
    private Button botonAConfiguracionCo;

    @FXML
    private Button botonALikesCo;

    @FXML
    private Button botonAMensajesCo;

    @FXML
    private Button botonAPerfilCo;

    @FXML
    private Button botonAPrincipalCo;

    @FXML
    private Button botonConfiguracion;

    @FXML
    private Button botonSuscripcion;

    @FXML
    private ComboBox<?> comboBoxIdioma;

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
    void onBotonAConfiguracionCoAction(ActionEvent event) {
        // Ya estamos en Configuracion, no se navega a ningún lado
    }

    @FXML
    void onBotonAConfiguracionPerfilAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/ConfiguracionPerfil.fxml");
    }

    @FXML
    void onBotonALikesCoAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Likes.fxml");
    }

    @FXML
    void onBotonAMensajesCoAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Mensajes.fxml");
    }

    @FXML
    void onBotonAPerfilCoAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Perfil.fxml");
    }

    @FXML
    void onBotonAPrincipalCoAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Principal.fxml");
    }

    @FXML
    void onBotonSuscripcionAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Suscripcion.fxml");
    }

}
