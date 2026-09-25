package PaqueteLibrerias;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SuscripcionController {

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
    private void onBotonElegirGratis(ActionEvent event) throws  IOException {
        cambiarVista(event, "/vistas/Configuracion.fxml");
    }

    @FXML
    private void onBotonElegirPagar(ActionEvent event) throws  IOException {
        cambiarVista(event, "/vistas/Configuracion.fxml");
    }

    @FXML
    private void onBotonSalirSuscripcion(ActionEvent event) throws  IOException {
        cambiarVista(event, "/vistas/Principal.fxml");
    }

}
