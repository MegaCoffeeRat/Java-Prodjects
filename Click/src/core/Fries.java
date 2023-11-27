package core;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;


public class Fries extends GameObject
{

    Fries(float x, float y)  {
        super(x, y);
        ySpeed = 5;
        img = Images.Fries;
    }
    void update()
    {
        super.update();
    }

    public void render(Graphics g)
    {
        super.render(g);
    }
}
