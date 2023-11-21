package core;
import org.newdawn.slick.Graphics;


public class Fries extends GameObject
{
    Fries(float x, float y)  {
        super(x, y);
        img = Images.Fries;
    }
    void update()
    {
        super.update();
    }

    public void render(Graphics g)
    {
        super.render(g);
        System.out.println(x);
    }
}
