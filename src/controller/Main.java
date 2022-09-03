/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;

import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

/**
 *
 * @author MontenegroCruz
 */
public class Main extends Application {

    double x, y = 0;

    @Override
    public void start(Stage primaryStage) {        
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/MainView.fxml"));
            primaryStage.setScene(new Scene(root));
            primaryStage.initStyle(StageStyle.UNDECORATED);

            root.setOnMousePressed(evt -> {
                x = evt.getSceneX();
                y = evt.getSceneY();
            });
            root.setOnMouseDragged(evt -> {
                primaryStage.setX(evt.getSceneX() - x);
                primaryStage.setY(evt.getSceneY() - y);
            });

            primaryStage.show();

        } catch (IOException e) {
            compilationMessage("Error", "The sale could no be loaded");
             JOptionPane.showMessageDialog(null, "Aqui tienes el error\n"+e);
            
        }

    }

    private void compilationMessage(String title, String contentText) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle(title);
        alert.setContentText(contentText);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
