package core;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;


public class rainDrop {

    private float x;
    private float y;
    private int ySpeed;

    rainDrop()
    {
        x = (float) (Math.random() * Main.getScreenWidth());
        y = (float) (Math.random() * Main.getScreenHeight());
        ySpeed = 25;
    }


    void update()
    {
        y = y + ySpeed;
        if(y>Main.getScreenHeight())
        {
            y = -10;
        }
    }



    void render(Graphics g)
    {
        g.setColor(Color.blue);
        g.fillRect(x,y, 10, 25);
    }



}
