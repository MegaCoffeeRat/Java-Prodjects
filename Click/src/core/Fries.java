package core;
import org.newdawn.slick.Graphics;


public class Fries extends GameObject
{
    Fries(float x, float y)  {
        super(1000, y);
        ySpeed = 2;
        img = Images.Fries;
    }
    void update()
    {
        super.update();
    }

    public void render(Graphics g)
    {
        super.render(g);
        System.out.println(xPos);
    }
}
