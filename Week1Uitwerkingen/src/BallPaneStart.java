import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by MSI on 1-3-2017.
 */
public class BallPaneStart extends Application{
    public static void main(String args[]){launch(args);}

    @Override
    public void start(Stage primaryStage) throws Exception{
        BallPane ballPane = new BallPane();
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                primaryStage.setTitle("BOUNCING BALL");
                primaryStage.setWidth(400);
                primaryStage.setHeight(400);
                ballPane.moveBall();

                GridPane gridPane = new GridPane();
                gridPane.setAlignment(Pos.CENTER);

                Scene s = new Scene(gridPane, 401,401);
                primaryStage.setScene(s);
                primaryStage.show();
            }
        });
    }
}
