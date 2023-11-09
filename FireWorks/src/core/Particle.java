package core;


public class Particle {
    float xPos;
    float yPos;
    float xSpeed;

    Particle(float x, float y)
    {
        xPos = x;
        yPos = y;

        xSpeed = (float)(Math.random()*(7 - -5)+-15);
    }

    void update()
    {
        xPos = xPos + xSpeed;
    }

}
