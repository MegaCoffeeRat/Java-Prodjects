package core;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
public class Confett {

    float x;
    float y;
    int xSpeed;
    int ySpeed;
    int size;
    Confett()
    {
        x = (float)(Math.random()*Main.getScreenWidth());
        y = (float)(Math.random()*Main.getScreenHeight());
        size = 6;


        xSpeed = (int)(Math.random()*7);
        ySpeed = (int)(Math.random()*7);

    }


    void update()
    {
        x = x + xSpeed;
        y = y+ ySpeed;

        if(x>Main.getScreenWidth())
        {
            x = -10;
        }
        if(y>Main.getScreenHeight())
        {
            y = -10;
        }
    }



    void render(Graphics g)
    {
        g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
        g.fillRect(x, y, 25, 10+15);
    }
}
