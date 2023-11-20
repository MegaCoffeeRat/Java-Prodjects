package core;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class fries extends object
{

    fries(float x, float y) throws SlickException {
        super(x, y);
        ySpeed = 2;
        image = new Image("res/fries.png");
    }

    void update()
    {
        super.update();
    }


    void render(Graphics g)
    {
        super.render(g);
    }
}
