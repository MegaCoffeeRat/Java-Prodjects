package core;
import java.util.Random;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Engine extends BasicGameState
{	
	private int id;



	public static float AxPos = 1920/2;

	public ArrayList<Fries> fries;
	public ArrayList<Weight> lbs;



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
		lbs = new ArrayList<Weight>();
		for(int i = 0; i < 10; i++)
		{
			fries.add(new Fries(rnd.nextInt(Main.getScreenWidth()), 10));
		}

	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException
	{
		for(Fries f :  fries)
		{
			f.update();
		}

		for(Weight lbs : lbs)
		{
			lbs.update();
		}



	}

	public void ArnoldMove(float MxPos)
	{
		boolean gThan = false;//arnie greater than mouse pos etc
		boolean lThan = false;
		if(AxPos > MxPos)
		{
			gThan = true;
		}
		else
		{
			lThan = true;
		}

		if(gThan)
		{
			while(AxPos != MxPos)
			{
				AxPos = AxPos - 1;
			}
		}
		else if(lThan)
		{
			while(AxPos != MxPos)
			{
				AxPos = AxPos + 1;
			}
		}
	}


	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException 
	{
		// This code renders shapes and images every frame.
		g.drawImage(Images.scaledbg, 0,0);
		g.setColor(Color.black);
		g.drawImage(Images.arnold, AxPos, Main.getScreenHeight()-500);
		for(Fries f :  fries)
		{
			f.render(g);
		}
		for(Weight lbs : lbs)
		{
			lbs.render(g);
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

		if(button == 0) {
			ArnoldMove(Mouse.getX());
			for(int i = 0; i < 1; i++)
			{
				lbs.add(new Weight(AxPos, Main.getScreenHeight()-100));
			}
		}





	}
	
	


}
