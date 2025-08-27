import java.awt.*;

public class Food {

    public int type;
    public float x;
    public float y;
    public boolean toBeDeleted;
    public static Color red = new Color (255, 100, 100);
    public static Color green = new Color(50, 150, 50);
    public static Color blue = new Color(100, 150, 200);
    public static Color yellow = new Color(50, 50, 255);

    public static Color[] COLOR = {
            red, // eto morkovka
            green,
            blue,
            yellow 
    };

    public Food(float x, float y) {
        this.x = x;
        this.y = y;
        this.type = (int)(Math.random() * COLOR.length);
        this.toBeDeleted = false;
    }

}