package game;

/**
 * Creates the snake's head conditions, 
 * getters and setters related to the
 * directions in which the body will move.
 * 
 * @author Kevin Mora
 */
public class Head {
    //dau ran
    Dir dir = Dir.RIGHT;
    int x,y;


    public Head(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Dir getDir() {
        return dir;
    }
    public void setDir(Dir dir) {
        this.dir = dir;
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
