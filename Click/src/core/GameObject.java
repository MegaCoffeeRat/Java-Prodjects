package core;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

public class GameObject {

    float xPos;
    float yPos;
    float ySpeed;
    protected Image img;

    GameObject(float x, float y)
    {
        x = xPos;
        y = yPos;
    }




    void update()
    {
        yPos = ySpeed + yPos;
    }



    void render(Graphics g)
    {

    }

}
