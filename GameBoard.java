    package sample;

    import javafx.geometry.Insets;
    import javafx.scene.control.Button;
    import javafx.scene.control.Label;
    import javafx.scene.image.Image;
    import javafx.scene.image.ImageView;
    import javafx.scene.layout.*;
    import javafx.scene.text.Font;
    import javafx.scene.paint.Color;

    import java.util.Random;

    public class GameBoard extends BorderPane {
        public GameBoard(){
            GridPane pane = new GridPane();
            ImageView ALetterView = new ImageView();
            Image ALetterImg = new Image("ALetter.png");
            ImageView BLetterView = new ImageView();
            Image BLetterImg = new Image("BLetter.png");
            ImageView ELetterView = new ImageView();
            Image ELetterImg = new Image("ELetter.png");
            ImageView FLetterView = new ImageView();
            Image FLetterImg = new Image("FLetter.png");
            ImageView HLetterView = new ImageView();
            Image HLetterImg = new Image("HLetter.png");
            ImageView RLetterView = new ImageView();
            Image RLetterImg = new Image("RLetter.png");
            ImageView TLetterView = new ImageView();
            Image TLetterImg = new Image("TLetter.png");
            ALetterView.setImage(ALetterImg);
            BLetterView.setImage(BLetterImg);
            ELetterView.setImage(ELetterImg);
            FLetterView.setImage(FLetterImg);
            HLetterView.setImage(HLetterImg);
            RLetterView.setImage(RLetterImg);
            TLetterView.setImage(TLetterImg);

            ALetterView.setFitWidth(55);
            ALetterView.setFitHeight(55);

            BLetterView.setFitWidth(55);
            BLetterView.setFitHeight(55);

            TLetterView.setFitWidth(55);
            TLetterView.setFitHeight(55);

            ELetterView.setFitWidth(55);
            ELetterView.setFitHeight(55);

            RLetterView.setFitWidth(55);
            RLetterView.setFitHeight(55);

            FLetterView.setFitWidth(55);
            FLetterView.setFitHeight(55);

            HLetterView.setFitWidth(55);
            HLetterView.setFitHeight(55);

            Button button1 = new Button();
            Button button2 = new Button();
            Button button3 = new Button();
            Button button4 = new Button();
            Button button5 = new Button();
            Button button6 = new Button();
            Button button7 = new Button();

            button1.setStyle("-fx-background-color: transparent");
            button2.setStyle("-fx-background-color: transparent");
            button3.setStyle("-fx-background-color: transparent");
            button4.setStyle("-fx-background-color: transparent");
            button5.setStyle("-fx-background-color: transparent");
            button6.setStyle("-fx-background-color: transparent");
            button7.setStyle("-fx-background-color: transparent");

            AnchorPane anchorPane = new AnchorPane();
            anchorPane.getChildren().add(button1);
            anchorPane.getChildren().add(button2);
            anchorPane.getChildren().add(button3);
            anchorPane.getChildren().add(button4);
            anchorPane.getChildren().add(button5);
            anchorPane.getChildren().add(button6);
            anchorPane.getChildren().add(button7);
            button1.setGraphic(ALetterView);
            button2.setGraphic(BLetterView);
            button3.setGraphic(FLetterView);
            button4.setGraphic(TLetterView);
            button5.setGraphic(HLetterView);
            button6.setGraphic(RLetterView);
            button7.setGraphic(ELetterView);
            button1.setLayoutX(450);
            button2.setLayoutX(400);
            button2.setLayoutY(30);
            button3.setLayoutX(400);
            button3.setLayoutY(90);
            button4.setLayoutX(500);
            button4.setLayoutY(30);
            button5.setLayoutX(500);
            button5.setLayoutY(90);
            button6.setLayoutX(450);
            button6.setLayoutY(120);
            button7.setLayoutX(450);
            button7.setLayoutY(60);
            Button enterAnswer = new Button("Enter");
            enterAnswer.setFont(Font.font(15));
            Label label = new Label();
            Label answerLabel = new Label("Your answer: ");
            answerLabel.setFont(Font.font(18));
            anchorPane.getChildren().add(label);
            anchorPane.getChildren().add(answerLabel);
            anchorPane.getChildren().add(enterAnswer);

            label.setLayoutX(454);
            label.setLayoutY(200);
            label.setFont(Font.font(18));
            label.setTextFill(Color.web("#003eb2"));

            Label score = new Label("Score: ");
            score.setFont(Font.font(18));

            Label scoreBoard = new Label("");
            scoreBoard.setFont(Font.font(18));

            answerLabel.setLayoutX(350);   // your answer bölümü
            answerLabel.setLayoutY(200);

            enterAnswer.setLayoutX(500);   //enter butonu
            enterAnswer.setLayoutY(250);

            score.setLayoutX(350);         // score bölümü
            score.setLayoutY(254);

            scoreBoard.setLayoutX(400);    // score answer bölümü
            scoreBoard.setLayoutY(255);
            scoreBoard.setTextFill(Color.web("#003eb2"));

            anchorPane.getChildren().add(score);
            anchorPane.getChildren().add(scoreBoard);
            pane.add(anchorPane,0,0);
            pane.setPadding(new Insets(100,100,100,0));
            this.getChildren().add(pane);

            button1.setOnAction(e->{
                label.setText(label.getText()+"A");
            });
            button2.setOnAction(e->{
                label.setText(label.getText()+"B");
            });
            button3.setOnAction(e->{
                label.setText(label.getText()+"F");
            });
            button4.setOnAction(e->{
                label.setText(label.getText()+"T");
            });
            button5.setOnAction(e->{
                label.setText(label.getText()+"H");
            });
            button6.setOnAction(e->{
                label.setText(label.getText()+"R");
            });
            button7.setOnAction(e->{
                label.setText(label.getText()+"E");
            });
            enterAnswer.setOnAction(e->{
                Random rand = new Random();
                label.setText("");
                int random = rand.nextInt(50);
                scoreBoard.setText(String.valueOf(random));
            });

        }
    }
