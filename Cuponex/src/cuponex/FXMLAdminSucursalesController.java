/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuponex;

import cuponex.util.Utilidades;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author horus
 */
public class FXMLAdminSucursalesController implements Initializable {

    @FXML
    private TableColumn<?, ?> tcNombre;
    @FXML
    private Button btnAgregar;
    @FXML
    private Button btnEliminar;
    @FXML
    private Button btnEditar;
    @FXML
    private Button btnBuscar;
    @FXML
    private TextField tfBusqueda;
    @FXML
    private TableView<?> twSucursales;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void clickAgregar(ActionEvent event) {
        try {
            Parent vistaPaciente = FXMLLoader.load(getClass().getResource("FXMLRegistroSucursal.fxml"));
            Scene scenaPaciente = new Scene(vistaPaciente);
            Stage escenarioBase = new Stage();
            escenarioBase.setScene(scenaPaciente);
            escenarioBase.initModality(Modality.APPLICATION_MODAL);
            escenarioBase.showAndWait();
        } catch (Exception e) {
            Utilidades.mostrarAlertaSimple("Error al cargar la ventana", e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    @FXML
    private void clickEliminar(ActionEvent event) {
    }

    @FXML
    private void clickEditar(ActionEvent event) {
        try {
            Parent vistaPaciente = FXMLLoader.load(getClass().getResource("FXMLEditarSucursal.fxml"));
            Scene scenaPaciente = new Scene(vistaPaciente);
            Stage escenarioBase = new Stage();
            escenarioBase.setScene(scenaPaciente);
            escenarioBase.initModality(Modality.APPLICATION_MODAL);
            escenarioBase.showAndWait();
        } catch (Exception e) {
            Utilidades.mostrarAlertaSimple("Error al cargar la ventana", e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    @FXML
    private void clickBuscar(ActionEvent event) {
    }
    
}
