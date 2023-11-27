package core;
import org.newdawn.slick.Graphics;

public class Weight extends GameObject
{
    public static float xPos;
    Weight(float x, float y)
    {
        super(x,y);
        ySpeed = 20;
        this.y = y;
        xPos = x;
        img = Images.weight;
    }

    void update()
    {
        y = y - ySpeed;
    }


    void render(Graphics g)
    {
        super.render(g);
    }



}
