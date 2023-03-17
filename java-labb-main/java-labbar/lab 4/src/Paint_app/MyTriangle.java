import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyTriangle extends Shape {
    public MyTriangle (int X, int Y){
        super(X, Y);

    }

    @Override
    public void drawYourselt(GraphicsContext brush, Color color) {
        brush.setFill(color);
        brush.fillPolygon(new double[]{getX()+15, getX(), getX()+35}, new double[]{getY()+2, getY()+30, getY()+30}, 3);
    }
}
