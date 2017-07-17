package interfaces;

/**
 * Created by Sh-Java on 12/22/2016.
 */
public class MovablePoint implements Movable{
    // Private member variables
    private int x, y;   // (x, y) coordinates of the point

    // Constructor
    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    // Need to implement all the abstract methods defined in the interface Movable
    @Override
    public void moveUp() {
        y++;
    }
    @Override
    public void moveDown() {
        y--;
    }
    @Override
    public void moveLeft() {
        x--;
    }
    @Override
    public void moveRight() {
        x++;
    }
}
