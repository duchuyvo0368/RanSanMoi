package game;

/**
 * Creates the snake's tail conditions, 
 * getters and setters related to the
 * directions in which the body will move.
 * 
 * @author Kevin Mora
 */
public class Tail {
    //doi ran
    int x,y;
    boolean wait = true;

    public Tail(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }


    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }


    public boolean isWait() {
        return wait;
    }
    public void setWait(boolean wait) {
        this.wait = wait;
    }
}
