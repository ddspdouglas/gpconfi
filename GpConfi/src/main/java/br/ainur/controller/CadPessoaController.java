package br.ainur.controller;

import br.ainur.DAO.GenericDAO;
import br.ainur.DAO.GenericDAO;
import br.ainur.model.Pessoa;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public class CadPessoaController implements Initializable {

    @FXML
    private Button btnNovo;
    
    
    
    @FXML
    private void handleAddNovo(ActionEvent event) {
        
/*       GenericDAO<Pessoa> dao = new GenericDAO<Pessoa>();
        
        System.out.println("Clicou");
        
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNomePessoa("Douglas Daniel");
        
        
        dao.salvar(pessoa);*/
        
    }
    
    
        @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ImageView icone = new ImageView( new Image(getClass().getResourceAsStream("/images/add-user-button.png")));
                
        btnNovo.setGraphic(icone);
        
    }    
    
}
