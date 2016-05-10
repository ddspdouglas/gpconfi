package br.ainur.gpconfi;

import br.ainur.util.EntitySingleton;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Principal.fxml"));
        
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");

        stage.setTitle("GPConfi 1.0");
        stage.setScene(scene);

        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent we) {
                EntitySingleton.getInstance().close();
                System.exit(0);
            }
        });
        stage.setMaximized(true);
        stage.show();
    }

    @Override
    public void init() throws InterruptedException {
        EntitySingleton.getInstance();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
