package GUI;

import demo.Cat;
import demo.PetDiedException;
import demo.PetGrewUpException;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.lang.management.PlatformLoggingMXBean;
import java.security.Key;
import java.util.concurrent.CountDownLatch;

public class Controller {

    @FXML
    private ProgressBar happiness;

    @FXML
    private ProgressBar purity;

    @FXML
    private ProgressBar health;

    @FXML
    private ProgressBar satiety;

    @FXML
    private ProgressBar age;

    @FXML
    private ImageView catImage;

    private static final Duration TIME_TO_WAIT = Duration.millis(1000);
    private Cat cat = new Cat();
    private Image defaultImage = new Image("GUI/static/img/start.png");

    @FXML
    void toScoldButton(ActionEvent event) {

    }

    @FXML
    void toWashButton(ActionEvent event) {

    }

    @FXML
    void toPlayButton(ActionEvent event) {

    }

    @FXML
    void toHealButton(ActionEvent event) {

    }

    @FXML
    void toStrokeButton(ActionEvent event) {

    }

    @FXML
    void toFeedButton() throws PetGrewUpException, PetDiedException {
        cat.toFeed();
        changeImage("GUI/static/img/eat.png");
        changeProgresses();
    }

    private void changeImage(String urlImage) {
        catImage.setImage(new Image(urlImage));
        waitBeforeAction(e -> catImage.setImage(defaultImage));
    }

    private void waitBeforeAction(EventHandler<ActionEvent> actionEvent) {
        Timeline timeline = new Timeline(new KeyFrame(TIME_TO_WAIT, actionEvent));
        timeline.play();
    }


    private void changeProgressBarValue(double presentValue, int maxValue, ProgressBar progressBar) {
        double progress = presentValue / maxValue;
        if (progress > 0) {
            progressBar.setProgress(progress);
        }
    }

    private void changeProgresses() {
        waitBeforeAction(
                actionEvent -> {
                    changeProgressBarValue(cat.getHealthPoint(), Cat.MAX_HEALTH_POINT, health);
                    changeProgressBarValue(cat.getHappiness(), Cat.MAX_HAPPINESS, happiness);
                    changeProgressBarValue(cat.getSatiety(), Cat.MAX_SATIETY, satiety);
                    changeProgressBarValue(cat.getAge(), Cat.MAX_AGE, age);
                    changeProgressBarValue(cat.getPurity(), Cat.MAX_PURITY, purity);
                });
    }
}