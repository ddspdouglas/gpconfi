/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ainur.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressIndicator;

public class InicioController implements Initializable {

    @FXML
    ProgressIndicator progressInicio;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        progressInicio.isIndeterminate();

    }

}
