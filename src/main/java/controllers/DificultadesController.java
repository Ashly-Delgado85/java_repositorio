/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controllers;

import com.mycompany.proyecto_1.ashlydelgado.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Ashly
 */
public class DificultadesController implements Initializable {
    @FXML
    private TextArea textInstrucciones;
    @FXML
    private Button btnRegresarPrincipal;
    @FXML
    private Button btnIniciarDificultad;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Para que no se pueda editar el texto en los campos de instrucciones
        
        textInstrucciones.setEditable(false);
         mostrarInstrucciones();
    }
   
    @FXML
    private void btnRegresarPrincipalClick(ActionEvent event) throws IOException {
        App.setRoot("/fxml/menu");
    }

    @FXML
    private void btnClickIniciarDificultad(ActionEvent event) throws IOException  {
        App.setRoot("/fxml/IniciarJuego"); 
    }
 
    private void mostrarInstrucciones(){
        textInstrucciones.setText(
                
          "Regla del Juego: Turno Extra por Acierto\n\n" +
          " Si durante tu turno logras acertar un disparo a un barco enemigo,\n" +
          "¡obtienes un turno extra y puedes disparar de nuevo inmediatamente!\n\n" +
          " Mientras sigas acertando, ¡seguirás tirando sin perder el turno!\n" +
          " Pero si fallas obtines una casilla (Agua), tu turno termina y pasa al otro jugador o a la computadora\n\n"+
          "-Unicamente se puede seleccionar una opción de dificultad\n"+
          "-Antes de iniciar debe elegir el tipo de jugador y colocar el nombre\n"+
          "-Si deseas ver un tablero,darle al botón ver/ocultar\n"+
          "-Al realizar todo lo anterior, proceda a darle al botón de \"Acomodar barcos aleatoriamente\"\n"+
          "-Barcos aleatorios es la opcion para empezar el juego, se acomodan los barcos y empieza la batalla"
        );
    }
}