/**
 * A Snake simply consists of a tail,
 * and it has a direction that tells us
 * in which way it will grow (move).
 *
 * @author Irini Canzoniere
 * @version 0.1
 */
public class Snake {

    private Tail tail;
    private int direction; // 0 right, 1 up, 2 left, 3 down


    /**
     * Create a Snake consisting of a single-block tail
     * located at position (x,y).
     * The Snake is facing upwards
     * (i.e., if it step()s, it will move to the block above).
     *
     * @param x the x-coordinate of the Snake's start position
     * @param y the y-coordinate of the Snake's start position
     */
    public Snake(final int x, final int y) {
        tail = new Tail(x, y, null);
        direction = 0;
    }

    /**
     * Take one step in my current direction.
     * @return true if ok, false if the Snake stepped on itself
     */
    public boolean step() {
      return true;  
    }


    /**
     * Modify my direction so I rotate by 1 (which is 90 degrees).
     */
    public void turnLeft() {
        this.direction = (direction + 1) % 4;
    }

    /**
     * Modify my direction so I rotate by -1 (which is -90 degrees).
     */
    public void turnRight() {
        this.direction = (direction + 3) % 4;
    }

    /**
     * Draw myself.
     * I don't need to draw anything myself,
     * because I only consist of a Tail,
     * and nothing else.
     * So I just ask the Tail to draw itself.
     *
     * @param painter The Painter to use for drawing
     */
    public void draw(final Painter painter) {
        this.tail.draw(painter);
    }

    /**
     * Print myself.
     * Make sure there is one line
     * (x,y)
     * for each part of the Tail,
     * with x the x-coordinate and y the y-coordinate
     * of that part of the Tail.
     */
    public void print() {
        System.out.println("Snake:");
        System.out.println("direction: " + direction);
        this.tail.print();
    }
} 
