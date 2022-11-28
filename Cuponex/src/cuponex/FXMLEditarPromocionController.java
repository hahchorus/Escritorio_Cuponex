/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuponex;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author horus
 */
public class FXMLEditarPromocionController implements Initializable {

    @FXML
    private TextField tfDescripcion;
    @FXML
    private TextField tfNombre;
    @FXML
    private Button btnCancelar;
    @FXML
    private Button btnAceptar;
    @FXML
    private TextField tfRestricciones;
    @FXML
    private TextField tfPorcentajeDescuento;
    @FXML
    private TextField tfCostoPromocion;
    @FXML
    private TextField tfCategoria;
    @FXML
    private TextField tfEstatus;
    @FXML
    private TextField tfAplicaSucursal;
    @FXML
    private TextField tfTipoPromocion;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clickCancelar(ActionEvent event) {
        Stage stage = (Stage) this.btnCancelar.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void clickAceptar(ActionEvent event) {
    }
    
}
