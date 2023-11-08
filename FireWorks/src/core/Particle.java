package core;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class Particle {
    float xPos;
    float yPos;




    float xSpeed;
    float ySpeed;




    Particle(float x, float y)
    {
        xPos = x;
        yPos = y;



    }


    void update()
    {


    }


    void render(Graphics g)
    {
        g.setColor(Color.green);
        g.fillOval(xPos, yPos, 10,10);
    }
}
