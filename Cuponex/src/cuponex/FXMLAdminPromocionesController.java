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
public class FXMLAdminPromocionesController implements Initializable {

    @FXML
    private TableColumn<?, ?> tcNombre;
    @FXML
    private TableColumn<?, ?> tcDescripcion;
    @FXML
    private TableColumn<?, ?> tcFechaInicio;
    @FXML
    private TableColumn<?, ?> tcFechaFin;
    @FXML
    private TableColumn<?, ?> tcRestricciones;
    @FXML
    private TableColumn<?, ?> tcTipoPromocion;
    @FXML
    private TableColumn<?, ?> tcPorcentajeDescuento;
    @FXML
    private TableColumn<?, ?> tcCostoPromocion;
    @FXML
    private TableColumn<?, ?> tcCategoria;
    @FXML
    private TableColumn<?, ?> tcEstatus;
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
    private TableView<?> twPromociones;
    @FXML
    private TableColumn<?, ?> tcAplicaSucursal;

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
            Parent vistaPaciente = FXMLLoader.load(getClass().getResource("FXMLRegistroPromocion.fxml"));
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
            Parent vistaPaciente = FXMLLoader.load(getClass().getResource("FXMLEditarPromocion.fxml"));
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
