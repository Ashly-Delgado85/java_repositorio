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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Ashly
 */
public class MenuController implements Initializable {

    @FXML
    private Button btnAcercaDe;
    @FXML
    private Button btnEmpezar;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    

    @FXML
    //manda a pantalla del acerca
    private void btnAcercaDeClick(ActionEvent event) throws IOException {
        App.setRoot("/fxml/acercaDe");
    }

    @FXML
    //manda a pantalla de dificultad
    private void btnEmpezarClick(ActionEvent event) throws IOException{
        App.setRoot("/fxml/Dificultades");
    }

    


    

}
