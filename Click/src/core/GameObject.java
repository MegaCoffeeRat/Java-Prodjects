package core;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;


public class GameObject {

    float x;
    float y;
    float ySpeed;
    protected Image img;

    GameObject(float x, float y)
    {
        this.x = x;
        this.y=y;
    }




    void update()
    {
        y = ySpeed + y;
    }



    void render(Graphics g)
    {
        g.drawImage(img, x,y);
    }

}
