package me.jayasanka.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class KohedaInne extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        VBox layout = new VBox();




        Scene scene = new Scene(layout,200,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Koheda Inne");
        primaryStage.show();
    }
}
