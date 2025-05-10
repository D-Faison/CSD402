package faison.accordian;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class AccordionApp extends Application {
    @Override
    public void start(@SuppressWarnings("exports") Stage stage){

        //Initialize Tilted Panes
        TitledPane aboutPane = new TitledPane();
        aboutPane.setText("About US");
        aboutPane.setContent(new Label("Lorem ipsum dolor sit amet consectetur adipiscing elit."));

        TitledPane servicePane = new TitledPane();
        servicePane.setText("Services");
        servicePane.setContent(new Label("Lorem ipsum dolor \nSit amet consectetur \nAdipiscing elit."));

        TitledPane contactPane = new TitledPane();
        contactPane.setText("Contact Us");
        contactPane.setContent(new Label("Lorem ipsum dolor sit amet consectetur adipiscing elit."));

        //Accordion
        Accordion accordion = new Accordion();
        accordion.getPanes().addAll(aboutPane,servicePane,contactPane);

        //Create Scene and set the stage
        VBox root = new VBox(accordion);
        Scene scene = new Scene(root, 500, 500, Color.BLUEVIOLET);

        stage.setTitle("Faison Accordion Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
