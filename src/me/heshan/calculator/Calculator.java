package me.heshan.calculator;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox layout = new VBox();

        Label calculation = new Label();

        TextField input = new TextField("0");

        HBox numberRow0 = new HBox();
        Button seven = new Button("7");
        Button eight = new Button("8");
        Button nine = new Button("9");
        Button dev = new Button("÷");
        numberRow0.getChildren().addAll(seven, eight, nine, dev);
        numberRow0.setAlignment(Pos.TOP_CENTER);

        HBox numberRow1 = new HBox();
        Button four = new Button("4");
        Button five = new Button("5");
        Button six = new Button("6");
        Button multi = new Button("x");
        numberRow1.getChildren().addAll(four, five, six, multi);
        numberRow1.setAlignment(Pos.TOP_CENTER);

        HBox numberRow2 = new HBox();
        Button one = new Button("1");
        Button two = new Button("2");
        Button three = new Button("3");
        Button min = new Button("-");
        numberRow2.getChildren().addAll(one, two, three, min);
        numberRow2.setAlignment(Pos.TOP_CENTER);

        HBox numberRow3 = new HBox();
        Button zero = new Button("0");
        Button dot = new Button(".");
        Button submit = new Button("=");
        submit.setId("EqualButton");
        Button add = new Button("+");
        numberRow3.getChildren().addAll(zero, dot, submit, add);
        numberRow3.setAlignment(Pos.TOP_CENTER);


        layout.getChildren().addAll(calculation, input , numberRow0, numberRow1, numberRow2, numberRow3);
        Scene scene = new Scene(layout, 300, 400);
        scene.getStylesheets().add(Calculator.class.getResource("cal.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.show();
    }
}
