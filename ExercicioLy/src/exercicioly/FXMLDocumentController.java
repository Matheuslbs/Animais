/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioly;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author ifnmg
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button adicionar;
    @FXML
    private Button editar;
    @FXML
    private Button excluir;
    @FXML
    private Button salvar;
    @FXML
    private Button cancelar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void adicionar(ActionEvent event) {
        
        Alert alertaZ = new Alert(Alert.AlertType.INFORMATION);
        alertaZ.setTitle("Adicionar"); //Caixa de informação
        alertaZ.setHeaderText(null);
        alertaZ.setContentText("Você Adicionou"); //Mensagm de informação
        alertaZ.showAndWait();
        
    }

    @FXML
    private void editar(ActionEvent event) {
        
        Alert alertaA = new Alert(Alert.AlertType.INFORMATION);
        alertaA.setTitle("Editar"); //Caixa de informação
        alertaA.setHeaderText(null);
        alertaA.setContentText("Você Editou"); //Mensagm de informação
        alertaA.showAndWait();
        
    }

    @FXML
    private void excluir(ActionEvent event) {
        
        Alert alertaB = new Alert(Alert.AlertType.INFORMATION);
        alertaB.setTitle("Excluir"); //Caixa de informação
        alertaB.setHeaderText(null);
        alertaB.setContentText("Você Excluiu"); //Mensagm de informação
        alertaB.showAndWait();
        
    }

    @FXML
    private void salvar(ActionEvent event) {
        
        Alert alertaC = new Alert(Alert.AlertType.INFORMATION);
        alertaC.setTitle("Salvar"); //Caixa de informação
        alertaC.setHeaderText(null);
        alertaC.setContentText("Você Salvou"); //Mensagm de informação
        alertaC.showAndWait();
        
    }

    @FXML
    private void cancelar(ActionEvent event) {
        
        Alert alertaD = new Alert(Alert.AlertType.INFORMATION);
        alertaD.setTitle("Cancelar"); //Caixa de informação
        alertaD.setHeaderText(null);
        alertaD.setContentText("Você Cancelou"); //Mensagm de informação
        alertaD.showAndWait();
        
    }
    
}
