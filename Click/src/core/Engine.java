package core;
import java.util.Random;

import org.newdawn.slick.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Engine extends BasicGameState
{	
	private int id;

	public ArrayList<Fries> fries;
	Random 	rnd = new Random();

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
		Images.loadImages();
		gc.setShowFPS(true);

		fries = new ArrayList<Fries>();
		for(int i = 0; i < 25; i++)
		{
			fries.add(new Fries(rnd.nextInt(Main.getScreenWidth()), 10));
		}
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException
	{

		// This is updates your game's logic every frame.  NO DRAWING.
		for(Fries f :  fries)
		{
			f.update();
		}
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException 
	{
		// This code renders shapes and images every frame.
		g.drawImage(Images.scaledbg, 0,0);
		g.setColor(Color.black);
		for(Fries f :  fries)
		{
			f.render(g);
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
	}
	
	public void mousePressed(int button, int x, int y)
	{
		// This code happens every time the user presses the mouse
	}
	
	


}
