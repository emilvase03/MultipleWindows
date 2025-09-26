package com.example.multiplewindows.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Window1Controller {
    @FXML
    private Label window1Label;

    public void setWindow1Label(String window1Label) {
        this.window1Label.setText("Welcome to Window 1: " + window1Label);
    }
}
