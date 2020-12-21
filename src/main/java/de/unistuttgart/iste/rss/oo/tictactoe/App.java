package de.unistuttgart.iste.rss.oo.tictactoe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Main class which starts the app.
 */
public class App extends Application {

    @Override
    public void start(final Stage primaryStage) throws Exception {
        final Parent sceneRoot = getSceneRoot();
        final Scene defaultScene = new Scene(sceneRoot);

        primaryStage.setWidth(450);
        primaryStage.setHeight(200);
        primaryStage.setScene(defaultScene);
        primaryStage.show();
    }

    /**
     * Generates a sample JavaFX {@link Parent} object which displays two texts: "Hello Santa" and "Hohoho".
     * 
     * @return Generates {@link Parent} object.
     */
    private Parent getSceneRoot() {
        final VBox root = new VBox();
        final Text helloSanta = new Text("Hello Santa");
        final Text hohoho = new Text("Hohoho");

        root.setPadding(new Insets(16));
        root.setSpacing(8);
        root.getChildren().addAll(helloSanta, hohoho);
        return root;
    }

    public static void main(final String[] args) {
        launch();
    }
}
