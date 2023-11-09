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
	public  ArrayList<basic> bigBois;
	public ArrayList<FireCloud> clouds;
	public ArrayList<Expander> exp;
	private int id;



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
		bigBois = new ArrayList<basic>();
		clouds = new ArrayList<FireCloud>();
		exp = new ArrayList<Expander>();


	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {

		for (basic b : bigBois)
		{
			b.update();
		}

		for (FireCloud b : clouds)
		{
			b.update();
		}
		for (Expander b : exp)
		{
			b.update();
		}


	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException 
	{
		g.setBackground(Color.black);
		for (basic b : bigBois)
		{
			b.render(g);
		}
		for (FireCloud b : clouds)
		{
			b.render(g);
		}
		for (Expander b : exp)
		{
			b.render(g);
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
		if(button == 0) {
			for (int i = 0; i < (int) (Math.random() * 78); i++) {
				bigBois.add(new basic(Mouse.getX(), Main.getScreenHeight() - Mouse.getY()));


			}
		}


		if(button == 2) {
			for (int i = 0; i < 15; i++) {
				exp.add(new Expander(Mouse.getX(), Main.getScreenHeight() - Mouse.getY()));
			}
		}


		if(button == 1) {
			for (int i = 0; i < 100; i++) {
				clouds.add(new FireCloud(Mouse.getX(), Main.getScreenHeight() - Mouse.getY()));

			}
		}
	}
	

}
