package core;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class BigBoi extends Particle{


    float xSpeed;
    float ySpeed;

    float gravity;
    int size;
    BigBoi(float x, float y) {
        super(x, y);
        ySpeed = (int) ((Math.random() * (5 - -10 + 1)) + -10);
        size = 10;
        gravity = 0.2F;
    }

    void update()
    {
        super.update();
        yPos = yPos + ySpeed;
        ySpeed = ySpeed + gravity;

    }

    void render(Graphics g)
    {
        g.setColor(new Color((int)(Math.random()*255), 20,20));
        g.fillOval(xPos-(size/2), yPos-(size/2), size, size);

    }
}
