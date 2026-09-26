package PaqueteLibrerias;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public void start(Stage stage) throws IOException {

        FXMLLoader loader = new FXMLLoader(
                Main.class.getResource("/vistas/Registro.fxml")
        );

        Parent root = loader.load();

        Scene scene = new Scene(root);

        stage.setTitle("Cometa");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
