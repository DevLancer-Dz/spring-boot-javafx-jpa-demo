package com.damine.javafxspringboottemplate.controllers;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    @FXML
    private TableView<?> tableStudent;

    @FXML
    private TableColumn<?, ?> sidC;

    @FXML
    private TableColumn<?, ?> nameC;

    @FXML
    private TableColumn<?, ?> tel1C;

    @FXML
    private TableColumn<?, ?> tel2C;

    @FXML
    private TableColumn<?, ?> addressC;

    @FXML
    private TableColumn<?, ?> statuC;

    @FXML
    private JFXTextField rechR;

    @FXML
    void getSelectedItems(MouseEvent event) {

    }

    @FXML
    void rechercherR(KeyEvent event) {

    }

    @FXML
    void remove(ActionEvent event) {

    }

    @FXML
    void save(ActionEvent event) {

    }

    @FXML
    void update(ActionEvent event) {

    }

}

