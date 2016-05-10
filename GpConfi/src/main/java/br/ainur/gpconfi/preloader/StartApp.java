/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ainur.gpconfi.preloader;

import java.io.IOException;
import javafx.application.Preloader;
import javafx.application.Preloader.StateChangeNotification;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressIndicator;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Simple Preloader Using the ProgressBar Control
 *
 * @author ddspd
 */
public class StartApp extends Preloader {

    ProgressIndicator bar;
    Stage stage = new Stage();

    private Scene createPreloaderScene() throws IOException {
        /*bar = new ProgressIndicator();
        bar.isIndeterminate();
        BorderPane p = new BorderPane();
        p.setCenter(bar);
        return new Scene(p, 300, 150);*/

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Inicio.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");
        return scene;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setScene(createPreloaderScene());
        stage.show();

    }

    @Override
    public void handleStateChangeNotification(StateChangeNotification scn) {
        if (scn.getType() == StateChangeNotification.Type.BEFORE_START) {
            stage.close();
        }
    }

}
