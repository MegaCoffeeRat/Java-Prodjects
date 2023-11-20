package core;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

public class object {

    float xPos;
    float yPos;
    float ySpeed;
    Image image;

    object(float x, float y)
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
