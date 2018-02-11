import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class P2L7_Canvas extends Application
{

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("huisje tekenens");
        Group root = new Group();
        Canvas canvas = new Canvas(1400, 800);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawShapes(GraphicsContext gc)
    {
        gc.setStroke(Color.RED);
        gc.setLineWidth(5);
        gc.strokeRoundRect(500, 400, 100, 100, 10, 10);
        gc.strokeLine(450, 450, 550, 350);
        gc.strokeLine(650, 450, 550, 350);
    }
}
// hulp van zack
