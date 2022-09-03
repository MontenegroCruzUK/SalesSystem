/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import model.AppModel;

/**
 * FXML Controller class
 *
 * @author MontenegroCruz
 */
public class MainController implements Initializable {

    @FXML
    private Button btn_AllItems;
    @FXML
    private Button btn_Favorites;
    @FXML
    private Button btn_Trash;
    @FXML
    private Button btn_Login;
    @FXML
    private Button btn_Card;
    @FXML
    private Button btn_Identity;
    @FXML
    private Button btn_SecureNote;
    @FXML
    private Button btn_Work;
    @FXML
    private Button btn_Social;
    @FXML
    private Button btn_Personal;
    @FXML
    private TextField txt_Search;
    @FXML
    private Button btn_Add;
    @FXML
    private VBox vb_Items;
    @FXML
    private ImageView ivLogo;
    @FXML
    private Label lb_ComanyName;
    @FXML
    private TextField txt_Username;
    @FXML
    private PasswordField txt_Password;
    @FXML
    private Label lb_Website;
    @FXML
    private Label lb_Notes;
    @FXML
    private Button btn_Delete;
    @FXML
    private Button btn_Edit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO        

    }

    @FXML
    private void handleButtonClicks(ActionEvent event) {
        System.out.println("hello");
    }

}
