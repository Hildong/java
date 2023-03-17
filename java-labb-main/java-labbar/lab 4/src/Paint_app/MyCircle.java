import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyCircle extends Shape {
    public MyCircle (int X, int Y){
        super(X, Y);

    }
    // Överskuggar metoden från superklassen Shape och ritar en cirkel
    @Override
    public void drawYourselt(GraphicsContext brush, Color color) {
        brush.setFill(color);
        brush.fillOval(getX(), getY(), 30, 30);

    }
}
