package intermediate;

import java.awt.*;
import java.applet.*;

public class Anim extends Applet implements Runnable {

    Thread runner;
    int xpos = 500;

    //Creating the Start method.
    @Override
    public void start() {
        if (runner == null) {
            runner = new Thread(this);
            runner.start();
        }
    }

    // Creating the  stop method.
    @Override
    public void stop() {
        if (runner != null) {
            runner = null;
        }
    }

    //Creating the run method.
    @Override
    public void run() {
        while (true) {
            repaint();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
            }
        }
    }

    // Creating the paint class.
    @Override
    public void paint(Graphics g) {
        g.drawString("WELCOME TO JAVA APPLET PROGRAMMING", xpos, 30);
        xpos--;
        if (xpos < -20) {
            xpos = 500;
        }

    }
}
