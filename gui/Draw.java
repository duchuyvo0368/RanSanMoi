package gui;

import game.Snake;

import javax.swing.*;
import java.awt.*;

/**
 * Creation of the GUI with 
 * Swing's JLabel components.
 * 
 * @author Kevin Mora
 */
public class Draw extends JLabel {

	// Warning suppression Serial Version.
	private static final long serialVersionUID = 1L;
	Point p;

	/**
	 * Creates the Graphical User Interface
	 * with properties such as dimensions, 
	 * colors, borders, etc.
	 */
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;//truyen doi tuong graphics duoi dang graphics2d
        g2d.setRenderingHint(
        		RenderingHints.KEY_ANTIALIASING,
        		RenderingHints.VALUE_ANTIALIAS_OFF);//khu rang cua

        // mau background
        g.setColor(new Color(255, 255, 255));
        g.fillRect(0, 0, Gui.width, Gui.height);

        // mau dau con ran
        g.setColor(new Color(39, 130, 141));
        for (int i = 0; i < Snake.tails.size(); i++) {
            p = Snake.ptc(Snake.tails.get(i).getX(),
            		Snake.tails.get(i).getY());
            g.fillRect(p.x, p.y, 32, 32);
        }

        // mau than con ran
        g.setColor(new Color(18, 93, 152));
        p = Snake.ptc(Snake.head.getX(),
        		Snake.head.getY());
        g.fillRect(p.x,p.y,32,32);

        // mau vien moi cua ran
        g.setColor(new Color(206, 18, 18));
        p = Snake.ptc(Snake.pickup.getX(),
        		Snake.pickup.getY());
        g.fillRect(p.x,p.y, 32,32);

        //
        g.setColor(Color.GRAY);
        //ve cac khoi o vuong nho
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                g.drawRect(i * 32 + Gui.xoff, j * 32 + Gui.yoff, 32, 32);
            }
        }
        //Border quanh 16x16
        g.setColor(Color.GRAY);
        g.drawRect(Gui.xoff, Gui.yoff, 512, 512);

        // diem so
        g.setFont(new Font("Futura", Font.BOLD, 20));
        g.setColor(Color.black);
        g.drawString("Score: " + Snake.score, 5,25);
        g.drawString("   Best: " + Snake.bestscore, 655,25);

        repaint();
    }

}
