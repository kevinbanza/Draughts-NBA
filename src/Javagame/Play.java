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


public class Play extends BasicGameState{
	

	public Play(int state){
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{	
	} 
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{ //methods which draws stuff on screen
		g.drawString("This is the Play State!", 100, 100);
		
	}
      
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{ //updates images on screen e.g. animations
		
	} 
	
	public int getID(){
		return 0;
	}
}
