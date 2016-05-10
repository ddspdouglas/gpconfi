package br.ainur.controller;

import br.ainur.util.GenericAddTable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TabPane;

public class PrincipalController implements Initializable {
    
    private GenericAddTable addTable = new GenericAddTable();
    
    private Scene scene;

    public void setScene(Scene scene) {
        this.scene = scene;
    }
    
    
    @FXML
    private TabPane principalPane;
    
    @FXML
    private SplitPane splitPane;
    
        
    @FXML
    private void handleBtnPessoa(ActionEvent evento){
       addTable.Add(principalPane, "cadPessoa", "Cadastro de Pessoa");
    }
    
    @FXML
    private void handleBtnDieta(ActionEvent evento){
        addTable.Add(principalPane, "cadDieta", "Cadastro de Dieta");
    }
    
    @FXML
    private void handleBtnArmazem(ActionEvent evento){
        addTable.Add(principalPane, "cadArmazem", "Cadastro de Armazem");
    }
    
    @FXML
    private void handleBtnProduto(ActionEvent evento){
        addTable.Add(principalPane, "cadProduto", "Cadastro de Produto");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        splitPane.setDividerPositions(0.25);
        
    }    
}
