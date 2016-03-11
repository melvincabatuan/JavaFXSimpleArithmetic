package ph.edu.dlsu;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent>{

    Button addButton;
    Button subtractButton;
    HBox pane;
    Label label;
    int counter;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        createPane();

        // Create scene
        Scene scene = new Scene(pane, 600, 480);

        // Stage the scene
        stage.setScene(scene);
        stage.setTitle("Simple Arithmetic App");
        stage.show();

    }

    private void createPane() {
        addButton = new Button("ADD");
        addButton.setOnAction(this);

        subtractButton = new Button("SUBTRACT");
        subtractButton.setOnAction(this);

        label = new Label();
        label.setText(Integer.toString(counter));

        pane = new HBox(10);
        pane.getChildren().addAll(label, addButton, subtractButton);
        pane.setAlignment(Pos.CENTER);
    }



    @Override
    public void handle(ActionEvent e) {
        if (e.getSource() == addButton){
            counter++;
        }
        if (e.getSource() == subtractButton){
            counter--;
        }
        label.setText(Integer.toString(counter));
    }
}
