package com.example;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class FaisonGridPane extends Application {
    
    @Override
    public void start(Stage stage){
        //Text Variables
        Text loginText = new Text("Login: ");
        Text passwordText = new Text("Password: ");

        //Text Feilds
        TextField loginField = new TextField();
        TextField passwordField = new TextField();

        //Buttons
        Button submitButton = new Button("Submit");
        Button forgotButton = new Button("Forgot Password?");

        //GridPane
        GridPane signinPane = new GridPane();

        signinPane.setMinSize(300,300);
        signinPane.setPadding(new Insets(10,10,10,10));
        signinPane.setVgap(5);
        signinPane.setHgap(5);
        signinPane.setAlignment(Pos.CENTER);

        //Adding elements to Gridpane
        signinPane.add(loginText, 0, 0);
        signinPane.add(loginField, 1, 0);

        signinPane.add(passwordText, 0, 1);
        signinPane.add(passwordField, 1, 1);

        signinPane.add(forgotButton, 0, 2);
        signinPane.add(submitButton, 1, 2);

        //Scene and Staging 
        Scene scene = new Scene(signinPane);
        
        stage.setTitle("Faison Grid Pane");

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
