package br.ainur.util;

import br.ainur.controller.CadDietaFormController;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class GenericAddModal {

    public void add(AnchorPane painel, String fxmlNome) {

        try {

            FXMLLoader fxml = new FXMLLoader(getClass().getResource("/fxml/" + fxmlNome + ".fxml"));

            fxml.load();

            AnchorPane modalAdd = fxml.getRoot();
            
            //modalAdd.setStyle("-fx-background-color: rgba(0, 100, 100, 0.5);");
            
            modalAdd.opacityProperty().add(0);
            
            modalAdd.prefWidthProperty().bind(painel.widthProperty());
            modalAdd.prefHeightProperty().bind(painel.heightProperty());

            CadDietaFormController controller = fxml.getController();

            controller.setSup(painel);

            painel.getChildren().add(modalAdd);
            
            painel.requestFocus();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
