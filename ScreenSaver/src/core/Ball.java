package core;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class Ball {
    float x;
    float y;

    int xSpeed;
    int ySpeed;


    Ball()
    {
        x = (float)(Math.random()*Main.getScreenWidth()-25);
        y = (float)(Math.random()*Main.getScreenHeight()-25);

        xSpeed = (int)(Math.random()*26);
        ySpeed = (int)(Math.random()*10);
    }



    void update()
    {
        x = x + xSpeed;
        y = y + ySpeed;

        if(x > Main.getScreenWidth()-10)
        {
            xSpeed = xSpeed *-1;
        }
        else if(x<10)
        {
            xSpeed = xSpeed * -1;
        }


        if(y > Main.getScreenHeight()-10)
        {
            ySpeed = ySpeed * -1;
        }
        else if(y < 10)
        {
            ySpeed = ySpeed *-1;
        }
    }
    void render(Graphics g)
    {
        g.setColor(new Color(0,0,0));
        g.fillOval(x,y,25,25);
    }
}
