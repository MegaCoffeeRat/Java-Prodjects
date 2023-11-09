package core;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import java.util.concurrent.ThreadLocalRandom;
public class FireCloud {
    float xPos;
    boolean isExpired = false;
    float yPos;
    float xSpeed;
    float ySpeed;
    float gravity;
    int size;
    int time = 60;
    FireCloud(float x, float y) {
        yPos = y;
        xPos = x;
        ySpeed = ThreadLocalRandom.current().nextInt(-10, 1 + 1);
        size = 10;
        gravity = 0.2F;
    }
    void update()
    {

        ySpeed = ThreadLocalRandom.current().nextInt(-10, 1 + 1) *-1;


        xSpeed = ThreadLocalRandom.current().nextInt(-7, 7 + 1);
        yPos = yPos + ySpeed*2;
        ySpeed = ySpeed + gravity;
        xPos = xPos + xSpeed*2;


    }
    void render(Graphics g)
    {
        g.setColor(new Color( (int)ThreadLocalRandom.current().nextInt(150, 200 + 1), (int)ThreadLocalRandom.current().nextInt(100, 254 + 1), 0));
        g.fillRect(xPos-(size/2), yPos-(size/2), size*2, size*2);

    }
}
