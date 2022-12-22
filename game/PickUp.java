package game;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Generates a randomized object
 * that will allow the snake to grow
 * by one unit if picked.
 * 
 * @author Kevin Mora
 */
public class PickUp {
    int x, y;


    public PickUp(){//tu dong tao thay doi vi tri moi
        this.x = ThreadLocalRandom.current().nextInt(0,15);
        this.y = ThreadLocalRandom.current().nextInt(0,15);
    }


    public void reset(){
        this.x = ThreadLocalRandom.current().nextInt(0,15);
        this.y = ThreadLocalRandom.current().nextInt(0,15);
    }

    /**
     * Gets/sets the X-movement 
     * of the object.
     */
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Gets/sets the Y-movement 
     * of the object.
     */
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}