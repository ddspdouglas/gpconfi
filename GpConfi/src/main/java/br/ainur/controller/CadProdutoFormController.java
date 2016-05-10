package br.ainur.controller;

import br.ainur.DAO.ProdutoDAO;
import br.ainur.model.Produto;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CadProdutoFormController implements Initializable {

    AnchorPane sup;
    ProdutoDAO dao = new ProdutoDAO();

    @FXML
    TextField txtDescricao;
    @FXML
    TextField txtMatSeca;

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
    private void handleSalvar(ActionEvent evento) {
        Produto produto = new Produto();

        produto.setDescricao(txtDescricao.getText());

        dao.salvar(produto);

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
