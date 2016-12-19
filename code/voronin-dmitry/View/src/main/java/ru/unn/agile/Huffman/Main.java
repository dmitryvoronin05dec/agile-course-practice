package ru.unn.agile.Huffman;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(final Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ru/unn/agile/Huffman/view/Huffman.FXML"));
        primaryStage.setTitle("Операции над трёхмерными векторами");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        double height = primaryStage.getHeight();
        primaryStage.setMinHeight(height);
        primaryStage.setMaxHeight(height);
    }

    public static void main(final String[] args) {
        launch(args);
    }
}
