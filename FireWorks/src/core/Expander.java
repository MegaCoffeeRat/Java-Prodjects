package core;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import java.util.concurrent.ThreadLocalRandom;
public class Expander {
    float xPos;
    float yPos;
    float xSpeed;
    float ySpeed;
    float gravity;
    int size;
    int alpha;

    Expander(float x, float y) {
        yPos = y;
        xPos = x;
        ySpeed = ThreadLocalRandom.current().nextInt(-5, 1 + 1);
        xSpeed = ThreadLocalRandom.current().nextInt(-2, 7 + 1);
        size = 10;
        gravity = 0.2F;
        alpha = 255;
    }
    void update()
    {
        yPos = yPos + ySpeed*2;
        ySpeed = ySpeed + gravity;
        xPos = xPos + xSpeed*2;
        alpha = alpha - 3;
        size = size + 5;
//        if(yPos < Main.getScreenHeight())
//        {
//            exp.remove(this);
//        }
    }
     void render(Graphics g)
    {
        g.setColor(new Color(200, 50, 220, alpha));
        g.fillOval(xPos-(size/2), yPos-(size/2), size, size);


    }
}
