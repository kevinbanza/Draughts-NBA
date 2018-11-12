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


public class Game extends StateBasedGame{ //inherited class for state based game
    //variables
	public static final String gameName = "DraughtsNBA!"; 
	public static final int menu = 0;
	public static final int play = 1;
	
	public Game(String gamename){
		super(gamename);
		this.addState(new Menu(menu));
		this.addState(new Play(play));
	} 
	
	public void initStatesList(GameContainer gc) throws SlickException{
		this.getState(menu).init(gc, this);
		this.getState(play).init(gc, this);
		this.enterState(menu); //display's main menu as first screen
	}
	
	public static void main(String[] args) {
		 
		AppGameContainer appgc;
		try{
			appgc = new AppGameContainer(new Game(gameName));
			appgc.setDisplayMode(1000, 600, false); //change to 'true' for full screen display
			appgc.start();
		}catch(SlickException e){
			e.printStackTrace();
		} 
		
	  }
   }


