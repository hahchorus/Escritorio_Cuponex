/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuponex;

import cuponex.util.Utilidades;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author horus
 */
public class FXMLPrincipalController implements Initializable {

    @FXML
    private Button btnEmpresas;
    @FXML
    private Button btnAdministrador;
    @FXML
    private Button btnSucursales;
    @FXML
    private Button btnPromociones;
    @FXML
    private Button btnSalir;
    @FXML
    private StackPane contentArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clickEmpresas(ActionEvent event) {
        try{
            Parent fxml = FXMLLoader.load(getClass().getResource("FXMLAdminEmpresas.fxml"));      
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
        }catch(IOException e){
            Utilidades.mostrarAlertaSimple("Error al cargar ventana", e.getMessage(), Alert.AlertType.NONE);
        }
    }

    @FXML
    private void clickAdministrador(ActionEvent event) {
        try{
            Parent fxml = FXMLLoader.load(getClass().getResource("FXMLAdminUsuarios.fxml"));      
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
        }catch(IOException e){
            Utilidades.mostrarAlertaSimple("Error al cargar ventana", e.getMessage(), Alert.AlertType.NONE);
        }
    }

    @FXML
    private void clickSucursales(ActionEvent event) {
        try{
            Parent fxml = FXMLLoader.load(getClass().getResource("FXMLAdminSucursales.fxml"));      
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
        }catch(IOException e){
            Utilidades.mostrarAlertaSimple("Error al cargar ventana", e.getMessage(), Alert.AlertType.NONE);
        }
    }

    @FXML
    private void clickPromociones(ActionEvent event) {
        try{
            Parent fxml = FXMLLoader.load(getClass().getResource("FXMLAdminPromociones.fxml"));      
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
        }catch(IOException e){
            Utilidades.mostrarAlertaSimple("Error al cargar ventana", e.getMessage(), Alert.AlertType.NONE);
        }
    }

    @FXML
    private void clickSalir(ActionEvent event) {
        Stage stage = (Stage) this.btnSalir.getScene().getWindow();
        stage.close();
    }
    
}
