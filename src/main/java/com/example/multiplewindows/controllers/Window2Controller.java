package com.example.multiplewindows.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Window2Controller {
    @FXML
    private TextField window2TextField;

    private MainWindowController mainWindowController;

    @FXML
    private void sendDataBtnClicked(ActionEvent actionEvent) throws IOException {
        this.mainWindowController.setDataFromWindow2(window2TextField.getText());

        closeWindow(actionEvent);
    }

    public void setParent(MainWindowController mainWindowController) {
        this.mainWindowController = mainWindowController;
    }

    private void closeWindow(ActionEvent event) {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }
}
