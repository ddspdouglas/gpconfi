package br.ainur.util;

import br.ainur.controller.PrincipalController;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;

public class GenericAddTable {
    
    private Map<String, Tab> abas = new HashMap<>();
    private Tab novaAba;
        
    public void Add(TabPane principal, String fxml, final String titulo){
        
        novaAba = abas.get(titulo);
        
        if(novaAba == null){
            
            novaAba = new Tab(titulo);
            
            
            novaAba.setOnClosed(new EventHandler<Event>() {
                @Override
                public void handle(Event event) {
                   novaAba = null;
                   abas.remove(titulo);
                }
            });
            
            try {
                AnchorPane painel = (AnchorPane) FXMLLoader.load(getClass().getResource("/fxml/"+fxml+".fxml"));
                novaAba.setContent(painel);    
            } catch (IOException ex) {
                Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            principal.getTabs().add(novaAba); 
            principal.getSelectionModel().select(novaAba);
            abas.put(titulo, novaAba);
            
        } else {
            principal.getSelectionModel().select(novaAba);
        }
        
    }
    
}
