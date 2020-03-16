package GUI;

import demo.Cat;
import demo.PetDiedException;
import demo.PetGrewUpException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;

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
    private Cat cat = new Cat();

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
            changeProgresses();
    }

    private void changeProgressBarValue(double presentValue, int maxValue, ProgressBar progressBar){
        double progress = presentValue/ maxValue;
        if (progress > 0) {
            progressBar.setProgress(progress);
        }
    }

    private void changeProgresses() {
        changeProgressBarValue(cat.getHealthPoint(), Cat.MAX_HEALTH_POINT, health);
        changeProgressBarValue(cat.getHappiness(), Cat.MAX_HAPPINESS, happiness);
        changeProgressBarValue(cat.getSatiety(), Cat.MAX_SATIETY, satiety);
        changeProgressBarValue(cat.getAge(), Cat.MAX_AGE, age);
        changeProgressBarValue(cat.getPurity(), Cat.MAX_PURITY, purity);
    }
}