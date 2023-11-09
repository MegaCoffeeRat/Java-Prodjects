package core;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.lwjgl.input.Mouse;

import java.util.ArrayList;

public class FireWorks extends BasicGameState
{
	public static ArrayList<Particle> particles;
	private int id;
	int Mx = Mouse.getX();
	int My = Mouse.getY();

	public FireWorks(int id)
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
		particles = new ArrayList<Particle>();


	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException
	{	




	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException 
	{
		g.setBackground(Color.blue);

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
//		particles.add(new Particle(Mouse.getX(), Main.getScreenHeight()-Mouse.getY()));
//		System.out.println(Mouse.getY());



	}
	
	


}
