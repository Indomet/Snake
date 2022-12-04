package com.example.projectserpent.gui;

import javafx.application.Application;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.scene.Scene;

public class MainMenu extends Application {
    private Stage window;
    private Scene mainMenuScene;

    public static void main(String[] args) {
        launch(args);
    }

    // primaryStage can be changed to window to remove redundancy, currently kept
    // for readability.
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Serpent");
        window.setResizable(false);

        // PLAY BUTTON
        Button playBtn = new Button("Start Game");
        playBtn.setBackground(Background.fill(Color.LIGHTGREEN));
        playBtn.setOnAction(e -> {
            Game newGame = new Game();
            newGame.startGame(window);
        });

        // MAIN MENU SETUP
        StackPane mainMenuLayout = new StackPane();
        mainMenuLayout.getChildren().addAll(playBtn);
        mainMenuLayout.setStyle("-fx-background-color: #000000");
        mainMenuScene = new Scene(mainMenuLayout, 600, 600);

        window.setScene(mainMenuScene);
        window.show();
    }
}

