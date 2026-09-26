package PaqueteLibrerias;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MensajesController {

    @FXML
    private HBox hboxAceptarRechazar;

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

    //Botones de la Parte de abajo para todas las vistas

    @FXML
    private void onBotonALikesMnAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Likes.fxml");
    }

    @FXML
    private void onBotonAMensajesMnAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Mensajes.fxml");
    }

    @FXML
    private void onBotonAPerfilMnAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Perfil.fxml");
    }

    @FXML
    private void onBotonAConfiguracionMnAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Configuracion.fxml");
    }

    @FXML
    private void onBotonRechazoAction(ActionEvent event) {
        hboxAceptarRechazar.setVisible(false);
        hboxAceptarRechazar.setManaged(false);
    }

    @FXML
    private void onBotonAceptoAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Principal.fxml");
    }

    public void onBotonAPrincipalMnAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Principal.fxml");
    }

    @FXML
    public void onBotonAPerfilAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Perfil2.fxml");
    }
}