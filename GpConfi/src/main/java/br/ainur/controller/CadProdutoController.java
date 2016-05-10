package br.ainur.controller;

import br.ainur.DAO.ProdutoDAO;
import br.ainur.model.Produto;
import br.ainur.util.GenericAddModal;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class CadProdutoController implements Initializable {

    private GenericAddModal addmodal = new GenericAddModal();
    private ProdutoDAO dao;

    @FXML
    private AnchorPane painel;

    @FXML
    TableView tableView;

    @FXML
    TableColumn<Produto, Integer> colCod;

    @FXML
    TableColumn<Produto, String> colDescricao;

    @FXML
    Button btnBuscar;

    @FXML
    ComboBox cmbBusca;

    @FXML
    TextField txtBusca;

    @FXML
    private void handleAdd(ActionEvent evento) {
        addmodal.add(painel, "cadProdutoForm");
    }

    @FXML
    private void handleBusca(ActionEvent evento) {

        tableView.getItems().clear();

        tableView.getItems().add(dao.buscarId(Integer.parseInt(txtBusca.getText())));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList itmCombo = FXCollections.observableArrayList("Descrição");

        cmbBusca.setItems(itmCombo);

        dao = new ProdutoDAO();

        colCod.setCellValueFactory(new PropertyValueFactory<Produto, Integer>("id"));
        colDescricao.setCellValueFactory(new PropertyValueFactory<Produto, String>("descricao"));
        
        tableView.setItems(FXCollections.observableArrayList(dao.buscarTodos()));

    }

}
