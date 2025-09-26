package com.example.multiplewindows.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Window2Controller {
    @FXML
    private TextField window2TextField;

    private MainWindowController mainWindowController;

    @FXML
    private void sendDataBtnClicked(ActionEvent actionEvent) throws IOException {
        this.mainWindowController.setDataFromWindow2(window2TextField.getText());
    }

    public void setParent(MainWindowController mainWindowController) {
        this.mainWindowController = mainWindowController;
    }
}
