package com.example.clock;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.util.Duration;
import java.time.LocalDateTime;

public class Controller {
    @FXML
    public Label label;
    @FXML
    void initialize(){
        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            int second = LocalDateTime.now().getSecond();
            int minute = LocalDateTime.now().getMinute();
            int hour = LocalDateTime.now().getHour();
            String time = String.format("%02d : %02d : %02d", hour , minute, second);
            label.setText(time);
        }),
                new KeyFrame(Duration.seconds(1))
        );
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }

}
