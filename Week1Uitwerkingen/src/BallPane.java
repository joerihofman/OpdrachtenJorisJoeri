import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.DoubleProperty;
import javafx.embed.swing.JFXPanel;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.stage.StageBuilder;
import javafx.util.Duration;

import javax.swing.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BallPane extends Pane {
  public final double radius = 20;
  private double x = radius, y = radius;
  private double dx = 1, dy = 1;
  private Circle circle = new Circle(x, y, radius);
  private Timeline animation;

  public BallPane() {
    circle.setFill(Color.GREEN); // Set ball color
    getChildren().add(circle); // Place a ball into this pane

    // Create an animation for moving the ball
    animation = new Timeline(
      new KeyFrame(Duration.millis(50), e -> moveBall()));
    animation.setCycleCount(Timeline.INDEFINITE);
    animation.play(); // Start animation
  }

  public void play() {
    animation.play();
  }

  public void pause() {
    animation.pause();
  }

  public void increaseSpeed() {
    animation.setRate(animation.getRate() + 0.1);
  }

  public void decreaseSpeed() {
    animation.setRate(
      animation.getRate() > 0 ? animation.getRate() - 0.1 : 0);
  }

  public DoubleProperty rateProperty() {
    return animation.rateProperty();
  }

    protected void moveBall() {
    // Check boundaries
    if (x < radius || x > getWidth() - radius) {
      dx *= -1; // Change ball move direction
    }
    if (y < radius || y > getHeight() - radius) {
      dy *= -1; // Change ball move direction
    }

    // Adjust ball position
    x += dx;
    y += dy;
    circle.setCenterX(x);
    circle.setCenterY(y);
  }
}

















//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                BallPane ballPane = new BallPane();
//                Platform.runLater(new Runnable() {
//                    @Override
//                    public void run() {
//                        ballPane.moveBall();
//                    }
//                });
//            }
//        }).start();
//        ExecutorService executorService = Executors.newFixedThreadPool(1);
//      while (true){
//          executorService.execute(new Thread(moveBall));
//      }
//        thread aanmaken
//    }
//}

//class MoveBall implements Runnable {
//
//    @Override
//    public void run() {
//        ballPane.();
//        ball bewegen
//    }
//}
