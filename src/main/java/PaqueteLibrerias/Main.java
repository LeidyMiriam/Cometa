package PaqueteLibrerias;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public void start(Stage escenario) throws IOException {
       //cargamos archivo FXML que hicimos en el SceneBuilder
        Parent root = FXMLLoader.load(getClass().getResource("/Vista.fxml"));

       //Creamos una escena con los componentes que acabamos de cargar
        Scene escena = new Scene(root);

       //Colocamos la escena en el escenario
       escenario.setScene(escena);

      //Mostramos el escenario
      escenario.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
