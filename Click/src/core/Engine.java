package core;

import org.newdawn.slick.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import java.util.ArrayList;

public class Engine extends BasicGameState
{	
	private int id;
	private int timer =  20*60;
	boolean Active = true;
	Image bg;


	public Engine(int id)
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
		bg = new Image("res/bg.png");
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException
	{
		// This is updates your game's logic every frame.  NO DRAWING.
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException 
	{
		// This code renders shapes and images every frame.
		g.drawImage(bg, 0,0);
		g.setColor(Color.black);

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
	}
	
	public void mousePressed(int button, int x, int y)
	{
		// This code happens every time the user presses the mouse
	}
	
	


}
