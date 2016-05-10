package br.ainur.controller;

import br.ainur.DAO.DietaDAO;
import br.ainur.model.Dieta;
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
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.util.Callback;

public class CadDietaController implements Initializable {

    private GenericAddModal addmodal = new GenericAddModal();
    private DietaDAO dao;

    @FXML
    private AnchorPane painel;

    @FXML
    TableView tableView;

    @FXML
    TableColumn<Dieta, Integer> colCod;

    @FXML
    TableColumn<Dieta, String> colDescricao;

    @FXML
    TableColumn<Dieta, Boolean> colAtiva;
    
    @FXML
    Button btnBuscar;
    
    @FXML
    ComboBox cmbBusca;
    
    @FXML
    TextField txtBusca;

    @FXML
    private void handleAdd(ActionEvent evento) {
        addmodal.add(painel, "cadDietaForm");
    }
    
    @FXML
    private void handleBusca(ActionEvent evento){
       
        tableView.getItems().clear();
        
        tableView.getItems().add(dao.buscarId(Integer.parseInt(txtBusca.getText())));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList itmCombo = FXCollections.observableArrayList("Descrição");
        
        cmbBusca.setItems(itmCombo);
        
        dao = new DietaDAO();

        colCod.setCellValueFactory(new PropertyValueFactory<Dieta, Integer>("id"));
        colDescricao.setCellValueFactory(new PropertyValueFactory<Dieta, String>("descricao"));
        colAtiva.setCellValueFactory(new PropertyValueFactory<Dieta, Boolean>("ativa"));

        colAtiva.setCellFactory(new Callback<TableColumn<Dieta, Boolean>, TableCell<Dieta, Boolean>>() {
            @Override
            public TableCell<Dieta, Boolean> call(TableColumn<Dieta, Boolean> param) {
                return new TableCell<Dieta, Boolean>() {
                    @Override
                    protected void updateItem(Boolean item, boolean empty) {
                        super.updateItem(item, empty);

                        if (!empty) {
                            if (item != null) {
                                if (item) {
                                    setText("Sim");
                                    setTextFill(Color.GREEN);
                                } else {
                                    setText("Não");
                                    setTextFill(Color.RED);
                                }
                            } else {
                                setText(null);
                            }
                        } else {
                            setText(null);
                        }
                    }
                };
            }
        });

        tableView.setItems(FXCollections.observableArrayList(dao.buscarTodos()));

    }

}
