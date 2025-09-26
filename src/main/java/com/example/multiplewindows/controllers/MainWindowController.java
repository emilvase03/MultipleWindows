package com.example.multiplewindows.controllers;

import com.example.multiplewindows.MainWindow;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindowController {
    @FXML
    private Stage window1Stage;
    @FXML
    private Stage window2Stage;
    @FXML
    private TextField dataFromWindow2Txt;
    @FXML
    private TextField nameTxt;

    @FXML
    private void onWindowOneButtonClicked(ActionEvent actionEvent) throws IOException {
        if (window1Stage == null) {
            FXMLLoader fxmlLoader = new FXMLLoader(MainWindow.class.getResource("/views/Window1View.fxml"));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            window1Stage = new Stage();
            window1Stage.setTitle("Window 1");
            window1Stage.setScene(scene);

            Window1Controller controller = fxmlLoader.getController();
            controller.setWindow1Label(nameTxt.getText());

            window1Stage.initModality(Modality.APPLICATION_MODAL);
            window1Stage.setOnCloseRequest(e -> window1Stage = null);
            window1Stage.show();
        }
        else {
            window1Stage.toFront();
        }
    }

    @FXML
    private void onWindowTwoButtonClicked(ActionEvent actionEvent) throws IOException {
        if (window2Stage == null) {
            FXMLLoader fxmlLoader = new FXMLLoader(MainWindow.class.getResource("/views/Window2View.fxml"));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            window2Stage = new Stage();
            window2Stage.setTitle("Window 2");
            window2Stage.setScene(scene);

            Window2Controller controller = fxmlLoader.getController();
            controller.setParent(this);

            window2Stage.initModality(Modality.APPLICATION_MODAL);
            window2Stage.setOnCloseRequest(e -> window2Stage = null);
            window2Stage.show();
        }
        else {
            window2Stage.toFront();
        }
    }

    public void setDataFromWindow2(String data) {
        dataFromWindow2Txt.setText(data);
    }
}
