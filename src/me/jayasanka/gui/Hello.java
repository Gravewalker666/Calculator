package me.jayasanka.gui;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Hello extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        VBox layout = new VBox(10);
        HBox row = new HBox(10);
        layout.getChildren().add(row);

        Button btn = new Button("Click");
        row.getChildren().add(btn);

        Button btn1 = new Button("Click1");
        row.getChildren().add(btn1);



        Scene scene = new Scene(layout, 300, 400);
        primaryStage.setTitle("Hello kohomada koheda inne");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}