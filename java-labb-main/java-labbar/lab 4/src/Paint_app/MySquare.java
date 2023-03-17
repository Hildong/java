import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MySquare extends Shape {
    public MySquare (int X, int Y){
        super(X, Y);

    }

    @Override
    public Shape copy(int x, int y, Color c) {
        return new MySquare(x, y);
    }

    // Överskuggar metoden från superklassen Shape och ritar en fyrkant
    @Override
    public void drawYourselt(GraphicsContext brush, Color color) {
        brush.setFill(color);
        brush.fillRect(getX(), getY(), 30, 30);
    }
}
