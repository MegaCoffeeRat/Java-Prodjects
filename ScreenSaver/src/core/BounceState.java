package core;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;



public class BounceState extends BasicGameState
{
    private int id;
    private Ball[] balls;
    private StateBasedGame sbg;

    public BounceState(int id)
    {
        this.id = id;
    }

    public int getID()
    {
        return id;
    }

    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException
    {
        // This code happens when you enter a game state for the *first time.*
        gc.setShowFPS(true);
        balls = new Ball[500];

        for(int i = 0; i < balls.length; i++)
        {
            balls[i] = new Ball();
        }

    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException
    {
        // This is updates your game's logic every frame.  NO DRAWING.
        for(int i = 0; i < balls.length; i++)
        {
            balls[i].update();
        }
    }

    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException
    {
        // This code renders shapes and images every frame.
        for(int i = 0; i < balls.length; i++)
        {
            balls[i].render(g);
        }
    }

    public void enter(GameContainer gc, StateBasedGame sbg) throws SlickException
    {
        // This code happens when you enter a gameState.
    }

    public void leave(GameContainer gc, StateBasedGame sbg)
    {
        // This code happens when you leave a gameState.
    }

    public void keyPressed(int key, char c)
    {
        // This code happens every time the user presses a key

        if(key == Input.KEY_1) {
            sbg.enterState(Main.CONFETTI_id);
        }
        else if(key == Input.KEY_2) {
            sbg.enterState(Main.RAIN_ID);
        }


    }

    public void mousePressed(int button, int x, int y)
    {
        // This code happens every time the user presses the mouse
    }




}