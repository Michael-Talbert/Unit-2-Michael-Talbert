import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;

public class snowman extends Application{
  public void start(Stage stage){

    final int CENTERX = 100;
    final int CENTERY1 = 100;
    final int RADIUS1 = 30;
    final int RADIUS2 = 2*(RADIUS1/3);
    final int RADIUS3 = RADIUS1/3;
    final int ARM_Y = CENTERY1-RADIUS1-RADIUS2;
    final int ARM1_X = CENTERX+RADIUS2;
    final int ARM2_X = CENTERX+RADIUS2;
    final int EYE_RADIUS = RADIUS3/5;
    final int EYEY = CENTERY1-RADIUS1-RADIUS2-RADIUS3;
    final int EYE1_X = CENTERX-(RADIUS3/3);
    final int EYE2_X = CENTERX+(RADIUS3/3);
    final int SCENESIZE = RADIUS1*6;
    final int SCENEHEIGHT = RadiusS1*4;

    //Making the body of the snowman
    Circle bottom = new Circle(CENTERX, CENTERY1, RADIUS1);
    Circle middle = new Circle(CENTERX, ARM_Y, RADIUS2);
    Circle top = new Circle(CENTERX, EYEY, RADIUS3);
    bottom.setFill(Color.WHITE);
    middle.setFill(Color.WHITE);
    top.setFill(Color.WHITE);
    Group body = new group(bottom, middle, top);

    //making the eyes
    Circle eyeLeft = new Circle(EYE1_X, EYEY, EYE_RADIUS);
    Circle eyeRight = new Circle(EYE2_X, EYEY, EYE_RADIUS);
    eyeLeft.setFill(Color.BLACK);
    eyeRight.setFill(Color.BLACK);
    Group eyes = new group(eyeLeft, eyeRight);

    //making the arms
    Line leftArm = new line(ARM1_X, ARM_Y, (ARM1_X-(ARM1_X/5)), ARM_Y);
    Line rightArm = new line(ARM2_X, ARM_Y, (ARM2_X+(ARM2_X/5)), ARM_Y);
    leftArm.setStroke(Color.LIGHTBROWN);
    rightArm.setStroke(Color.LIGHTBROWN);
    Group arms = new group(leftArm, rightArm);

    //Making background
    Rectangle snow = new rectangle((CENTERX-RADIUS1*3),
    (CENTERY1-RADIUS2),
    (CENTERX+RADIUS1*6),
    (CENTERY1*RADIUS2));
    snow.setFill(Color.WHITE);
    Group ground = new group(snow);

    //setting the scene
    Scene scene = new scene(snow, body, arms, eyes, SCENESIZE, SCENEHEIGHT,
     Color.LIGHTBLUE);

     //showing the Scene
     stage.setTitle("Snowman");
     stage.setScene(scene);
     stage.show();
  }
  public static void main(String[] args){
    launch(args);
  }

}
