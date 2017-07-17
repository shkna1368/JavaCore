package polymorphism;

/**
 * Created by Sh-Java on 12/22/2016.
 */
public class Circle extends Shape{

        private int x, y, r;



     Circle(int x, int y, int r)
        {
            this.x = x;
            this.y = y;
            this.r = r;
            System.out.println("create circle");
        }

        // For brevity, I've omitted getX(), getY(), and getRadius() methods.

        @Override
     public   void draw()
        {
            System.out.println("Drawing circle (" + x + ", "+ y + ", " + r + ")");
        }
}
