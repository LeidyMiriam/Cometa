package PaqueteLibrerias;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class PrincipalController {

    @FXML
    private Button botonAConfiguracionPr;

    @FXML
    private Button botonALikesPr;

    @FXML
    private Button botonAMensajesPr;

    @FXML
    private Button botonAPerfilPr;

    @FXML
    private Button botonAPrincipalPr;

    @FXML
    private Button botonDesarrolladores;

    @FXML
    private Button botonEnviaMensaje;

    @FXML
    private Button botonFiltros;

    @FXML
    private Button botonLike;

    @FXML
    private Button botonNoup;

    @FXML
    private Button botonSuperLike;

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
    void onBotonAConfiguracionPrAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Configuracion.fxml");
    }

    @FXML
    void onBotonALikesPrAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Likes.fxml");
    }

    @FXML
    void onBotonAMensajesPrAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Mensajes.fxml");
    }

    @FXML
    void onBotonAPerfilPrAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Perfil.fxml");
    }

    @FXML
    void onBotonAPrincipalPrAction(ActionEvent event) {
        // Ya estamos en Principal, no se navega a ningún lado
    }

    @FXML
    void onBotonDesarrolladoresAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Integrantes.fxml");
    }

    @FXML
    void onBotonEnviaMensajeAction(ActionEvent event) throws IOException {
        cambiarVista(event, "/vistas/Mensajes.fxml");
    }

    @FXML
    void onBotonFiltrosAction(ActionEvent event) {

    }

    @FXML
    void onBotonLikeAction(ActionEvent event) {

    }

    @FXML
    void onBotonNoupAction(ActionEvent event) {

    }

    @FXML
    void onBotonSuperLikeAction(ActionEvent event) {

    }

    @FXML
    private void onLabelNombreAction(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/vistas/Perfil2.fxml")
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