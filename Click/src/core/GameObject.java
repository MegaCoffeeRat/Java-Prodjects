package core;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

import java.util.Random;

public class GameObject {
    float x;
    float y;
    protected Image img;
    float ySpeed;
    Random rnd = new Random();


    GameObject(float x, float y)
    {
        this.x = x;
        this.y=y;
    }
    void update()
    {
        y = y + ySpeed;
        if(y>Main.getScreenHeight())
        {
            y = -10;
            x = rnd.nextInt(Main.getScreenWidth());
        }
    }
    void render(Graphics g)
    {
        g.drawImage(img, x,y);
    }
}
