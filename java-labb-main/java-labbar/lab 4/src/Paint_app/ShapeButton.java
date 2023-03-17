import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.util.ArrayList;

public class ShapeButton extends Canvas {
    private static final int BUTTON_WIDTH = 40;
    private static final int BUTTON_HEIGHT = 40;
    private static final int STROKE_WIDTH = 1;

    private final Shape shape; // formen som representeras av knappen
    private final Model model; // håller reda på den valda formen
    private final ArrayList<ShapeButton> shapeButtonList; // lista över alla formknappar

    public ShapeButton(Shape shape, Model model, ArrayList<ShapeButton> shapeButtonList) {
        super(BUTTON_WIDTH, BUTTON_HEIGHT);
        this.shape = shape;
        this.model = model;
        this.shapeButtonList = shapeButtonList;

        drawButton();
        setOnClickBehavior();
    }

    private void drawButton() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setFill(Color.LIGHTGRAY);
        gc.fillRect(0, 0, BUTTON_WIDTH, BUTTON_HEIGHT);
        shape.setX(4);
        shape.setY(4);
        shape.drawYourselt(gc, Color.BLACK); // rita formerna i panelen

        /*
        gc.setStroke(Color.GRAY);
        gc.setLineWidth(STROKE_WIDTH);
        gc.strokeRect(0, 0, BUTTON_WIDTH, BUTTON_HEIGHT);
         */
    }

    private void setOnClickBehavior() {
        setOnMouseClicked(event -> {
            for (ShapeButton shapeButton : shapeButtonList) {
                shapeButton.deselect();
            }
            select(); // markera den valda formen
            model.setShape(shape);
        });
    }

    public Shape getShape() {
        return shape;
    }

    public void select() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(STROKE_WIDTH);
        gc.strokeRect(0, 0, BUTTON_WIDTH, BUTTON_HEIGHT);
    }

    public void deselect() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setStroke(Color.LIGHTGRAY);
        gc.setLineWidth(STROKE_WIDTH);
        gc.strokeRect(0, 0, BUTTON_WIDTH, BUTTON_HEIGHT);
    }
}
