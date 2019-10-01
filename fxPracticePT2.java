import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;

public class fxPracticePT2 extends Application{

  public void start(Stage stage){

    final Double CENTER = 100.0;
    Text greeting = new Text(10, 15, "Hello!!");
    Text compliment = new Text(75, 50, "Bees are dying at an alarming rate uwu");
    Circle circle = new Circle(CENTER, CENTER, 50.0);
    Rectangle box = new Rectangle(20, 20, 50, 25);
    Line line = new Line(CENTER, CENTER, 0.0, 0.0);
    Circle secondRing = new Circle(CENTER, CENTER, 40);
    Circle thirdRing = new Circle(CENTER, CENTER, 30);
    Circle bullsEye = new Circle(CENTER, CENTER, 20);

    bullsEye.setFill(Color.YELLOW);
    thirdRing.setFill(Color.RED);
    secondRing.setFill(Color.BLUE);
    greeting.setFill(Color.BROWN);
    box.setStroke(Color.YELLOW);
    box.setFill(Color.ORANGE);
    circle.setStroke(Color.GREEN);
    circle.setFill(Color.WHITE);

    Group group = new Group(greeting, compliment, circle, box, line, secondRing,
    thirdRing, bullsEye);
    Scene scene = new Scene(group, 100, 100, Color.LIGHTBLUE);

    stage.setTitle("fxPracticePT2");
    stage.setScene(scene);
    stage.show();

  }
  public static void main(String[] args){
    launch(args);
  }
}
