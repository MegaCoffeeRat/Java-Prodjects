package core;

import java.awt.*;

public class Star {
    float x;
    float y;
    int size;

    Star()
    {
        x = (float) (Math.random()*Main.getScreenWidth());
        y = (float)(Math.random()*Main.getScreenWidth());
        size = 2;
    }

    void update()
    {

    }



    void render(Graphics g)
    {

    }
}
