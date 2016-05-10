package br.ainur.controller;

import br.ainur.DAO.DietaDAO;
import br.ainur.model.Dieta;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CadDietaFormController implements Initializable {
    
    AnchorPane sup;
    DietaDAO dao = new DietaDAO();
        
    @FXML
    TextField txtDescricao;
    @FXML
    TextField txtPeriodo;
    @FXML
    TextField txtMatSeca;
    @FXML
    TextField txtMatNat;
    @FXML
    CheckBox chkAtiva;
            
    @FXML
     private AnchorPane painel;

    @FXML
    private AnchorPane anchoForm;

    @FXML
    private void handleClose(ActionEvent evento) {
        sup = (AnchorPane) painel.getParent();
        sup.getChildren().remove(painel);
    }
    
    @FXML
    private void handleSalvar (ActionEvent evento){
        Dieta dieta = new Dieta();
        
        dieta.setDescricao(txtDescricao.getText());
        dieta.setAtiva(chkAtiva.isSelected());
        
        dao.salvar(dieta);
        
        sup = (AnchorPane) painel.getParent();
        sup.getChildren().remove(painel);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {   
        anchoForm.getStyleClass().add("backgroundPane");
    }

    public void setSup(AnchorPane sup) {
        this.sup = sup;
    }
}
