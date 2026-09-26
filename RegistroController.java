package PaqueteLibrerias;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistroController {

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
    private void onBotonSiguienteAction(ActionEvent event) throws  IOException {
        cambiarVista(event, "/vistas/Registro2.fxml");
    }

    @FXML
    private void onBotonInicioSesion(ActionEvent event) throws  IOException {
        cambiarVista(event, "/vistas/Login.fxml");
    }


    @FXML
    private void onMouseAvisoPrivacidad(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/vistas/AvisoPrivacidad.fxml")
        );

        Parent root = loader.load();

        Stage stage = (Stage)
                ((Node) event.getSource())
                        .getScene()
                        .getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
}
