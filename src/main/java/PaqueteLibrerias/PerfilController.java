package PaqueteLibrerias;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PerfilController {

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
    private void onBotonConfiguraPe(ActionEvent event) throws  IOException {
        cambiarVista(event, "/vistas/ConfiguracionPerfil.fxml");
    }

    //Botones de la Parte de abajo para todas las vistas

    @FXML
    private void onBotonALikesPeAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Likes.fxml");
    }

    @FXML
    private void onBotonAMensajesPeAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Mensajes.fxml");
    }

    @FXML
    private void onBotonAPerfilPeAction(ActionEvent event) throws IOException {

    }

    @FXML
    private void onBotonAConfiguracionPeAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Configuracion.fxml");
    }

}
