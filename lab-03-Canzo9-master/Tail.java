/**
 * A Tail is located at a certain (x, y) position and has a Tail.
 *
 * @author Irini Canzonieres
 * @version 0.1
 */
public class Tail {

    private final int x;
    private final int y;
    private final Tail tail;
    
    /*
     * First constructor of the tail
     */
    public Tail(int x, int y){
        this.x = x;
        this.y = y;
        tail =  null;
    }
    /**
     * Second constructor for the tail.
     */
    public Tail(int x, int y, Tail tail ){
        this.x = x;
        this.y = y;
        this.tail = tail;
        
    }
    /**
     * Draw myself with the given Painter.
     * @param painter The Painter to use for drawing.
     */
    public void draw(final Painter painter) {
        this.tail.draw(painter);
    }

    /**
     * Print myself to System.out.
     */
    public void print() {
        System.out.println("(" + x + ", " + y + ")");
        if(this.tail!=null){
        this.tail.print();
    }
    }

    /**
    * Method that prepends the tail.
    * @param direction, indicates the direction of the new Tail object
    */
    public Tail prepend(int direction){
         if(direction == 0){
             return new Tail(this.x+1, y, this);
             
        }else if(direction == 1){
            return new Tail(x, this.y - 1, this);
        }else if(direction == 2){
            return new Tail(this.x - 1, y, this);
        }else{
            return new Tail(x, this.y +1, this);
        }
        
    }


}
