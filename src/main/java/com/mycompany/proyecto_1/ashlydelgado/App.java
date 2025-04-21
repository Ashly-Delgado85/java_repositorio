package com.mycompany.proyecto_1.ashlydelgado;

import Modelos.Sonido;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
 
public class App extends Application {
  Sonido sound = new Sonido();
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("/fxml/menu"), 1200, 800);
        sonidoPrincipal();
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
    
        private void sonidoPrincipal(){
        sound.cargarSonido("/sonidos/batalla.wav",false);
        sound.sonar();
    }

}