package core;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
public class Snow {

    float x;
    float y;

    int size;
    Snow()
    {
        x = (float)(Math.random()*Main.getScreenWidth());
        y = (float)(Math.random()*Main.getScreenHeight());
        size = 6;

    }


    void update()
    {
        y = y+ size/2.0f;
        if(y>Main.getScreenHeight())
        {
            y = 0;
        }
    }



    void render(Graphics g)
    {
        g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
        g.fillOval(x, y, size+5, size+15);
    }
}
