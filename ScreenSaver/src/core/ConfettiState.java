package core;

import org.newdawn.slick.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class ConfettiState extends BasicGameState
{	
	private int id;
	private Confett[] Confetti;
	private StateBasedGame sbg;

	public ConfettiState(int id)
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
		this.sbg = sbg;
		gc.setShowFPS(true);
		Confetti = new Confett[1000];

		for(int i = 0; i < Confetti.length; i ++)
		{
			Confetti[i] = new Confett();
		}
//		windSpeed = 3;
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException
	{	
		// This is updates your game's logic every frame.  NO DRAWING.
		for(int i = 0; i < Confetti.length; i++)
		{
			Confetti[i].update();
		}

	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException 
	{

		// This code renders shapes and images every frame.
//		g.setBackground(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
		g.setBackground(Color.black);
		for(int i = 0; i < Confetti.length; i++)
		{
			Confetti[i].render(g);
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
		if(key == Input.KEY_2) {
			sbg.enterState(Main.RAIN_ID);
		}
		else if(key == Input.KEY_3) {
			sbg.enterState(Main.BOUNCE_ID);
		}

	}
	
	public void mousePressed(int button, int x, int y)
	{
		// This code happens every time the user presses the mouse
	}
	
	


}
