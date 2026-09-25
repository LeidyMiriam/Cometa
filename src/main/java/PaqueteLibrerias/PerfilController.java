package PaqueteLibrerias;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PerfilController {

    @FXML
    private Button botonAConfiguracionPe;

    @FXML
    private Button botonALikesPe;

    @FXML
    private Button botonAMensajesPe;

    @FXML
    private Button botonAPerfilPe;

    @FXML
    private Button botonAPrincipalPe;

    @FXML
    private Button botonConfiguraPerfil;

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
    void onBotonAConfiguracionPeAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Configuracion.fxml");
    }

    @FXML
    void onBotonALikesPeAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Likes.fxml");
    }

    @FXML
    void onBotonAMensajesPeAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Mensajes.fxml");
    }

    @FXML
    void onBotonAPerfilPeAction(ActionEvent event) {
        // Ya estamos en Perfil, no se navega a ningún lado
    }

    @FXML
    void onBotonAPrincipalPeAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Principal.fxml");
    }

    public void onBotonConfiguraPe(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/ConfiguracionPerfil.fxml");
    }
}
