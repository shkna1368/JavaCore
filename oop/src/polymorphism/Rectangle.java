package polymorphism;

/**
 * Created by Sh-Java on 12/22/2016.
 */
public class Rectangle extends Shape{
    private int x, y, w, h;

    Rectangle(int x, int y, int w, int h)
    {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        System.out.println("create rectangle");
    }

    // For brevity, I've omitted getX(), getY(), getWidth(), and getHeight()
    // methods.

    @Override
   public void draw()
    {
        System.out.println("Drawing rectangle (" + x + ", "+ y + ", " + w + "," +
                h + ")");
    }
}
