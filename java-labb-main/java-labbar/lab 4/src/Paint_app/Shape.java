import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape {
    private int X;
    private int Y;

    public Shape (int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public abstract Shape copy(int x, int y, Color c);

    // Abstrakt metod som definierar hur formen ska ritas ut
    public abstract void drawYourselt(GraphicsContext brush, Color color);

    public int getX() {
        return X;
    }
    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }
    public void setY(int y) {
        Y = y;
    }
}
