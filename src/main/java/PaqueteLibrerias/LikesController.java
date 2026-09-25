package PaqueteLibrerias;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LikesController {

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
    private void onBotonALikesLiAction(ActionEvent event) throws IOException {

    }

    @FXML
    private void onBotonAMensajesLiAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Mensajes.fxml");
    }

    @FXML
    private void onBotonAPerfilLiAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Perfil.fxml");
    }

    @FXML
    private void onBotonAConfiguracionLiAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Configuracion.fxml");
    }

}
