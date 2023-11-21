package core;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
public class GameObject {
    float x;
    float y;
    protected Image img;
    float ySpeed;

    GameObject(float x, float y)
    {
        this.x = x;
        this.y=y;
    }
    void update()
    {
        y = y + ySpeed;
    }
    void render(Graphics g)
    {
        g.drawImage(img, x,y);
    }
}
