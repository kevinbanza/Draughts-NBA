/* 
 *
 *   Title:       DraughtsNBA 
 *   Creator:     Kevin Banza
 *   Date:        10th March 2014
 *
 **********************************/
 
package Javagame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.Mouse;


public class Menu extends BasicGameState{
	
	public String mouse = "No input yet!";
	
	public Menu(int state){
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{	
	} 
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{ //methods which draws stuff on screen
		Image background = new Image("res/nba2K14.png");
		g.drawImage(background, 0,0); //0,0 
		
		g.fillOval(861, 270, 100, 100);
		g.drawString("Play Now!", 873, 304);
		
		g.drawString(mouse, 0, 580);
		g.drawString("Welcome To DraughtsNBA Playoffs!?!?",657,0);
		
	}
      
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{ //updates images on screen e.g. animations
		Input input = gc.getInput(); 
		int xpos = Mouse.getX();//get 'X' position x, y and store it in a variable called X position (xpos) 
		int ypos = Mouse.getY();//get 'Y' position y, x and store it in a variable called Y position (ypos)
		if((xpos>861 && xpos<961) && (ypos>270 && ypos<370)){//if 'ypos' is in oval and 'ypos' is inside oval go to different state.
			if (input.isMouseButtonDown(0)){//'0'left click
				sbg.enterState(1);//'1' right click
			}
		}
		mouse = "Mouse position x: " + xpos + "y: " + ypos; //mouse input 
		
	} 
	
	public int getID(){
		return 0;
	}
}
