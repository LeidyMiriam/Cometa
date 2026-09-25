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

public class LikesController {

    @FXML
    private Button botonAConfiguracionLi;

    @FXML
    private Button botonALikesLi;

    @FXML
    private Button botonAMensajesLi;

    @FXML
    private Button botonAPerfilLi;

    @FXML
    private Button botonAPrincipalLi;

    @FXML
    private Button botonDiLike;

    @FXML
    private Button botonMeDieronLike;

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
    void onBotonAConfiguracionLiAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Configuracion.fxml");
    }

    @FXML
    void onBotonALikesLiAction(ActionEvent event) {
        // Ya estamos en Likes, no se navega a ningún lado
    }

    @FXML
    void onBotonAMensajesLiAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Mensajes.fxml");
    }

    @FXML
    void onBotonAPerfilLiAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Perfil.fxml");
    }

    @FXML
    void onBotonAPrincipalLiAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Principal.fxml");
    }

    @FXML
    void onBotonDiLike(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Suscripcion.fxml");
    }

    @FXML
    void onBotonMeDieronLikeAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Suscripcion.fxml");
    }

}