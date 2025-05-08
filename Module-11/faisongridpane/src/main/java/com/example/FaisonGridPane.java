package com.example;
import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class FaisonGridPane extends Application {
    
    @Override
    public void start (@SuppressWarnings("exports") Stage stage){

        GridPane gridPane = new GridPane();
        gridPane.setMaxSize(300, 50);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
