

// Lab Chapter 19 -  Lab Pong    2021

// Uses files Main.java, Pong.java, Paddle.java, Ball.java, and Block.java

// IMPORTANT! PLEASE READ!!!!!!!
// YOU WILL NEED TO USE THE Java Swing compiler (scroll down)

// DO NOT DO ANYTHING WITH THIS FILE
// OTHER THAN PUT YOUR NAME ON IT AND RUN IT

// PLEASE READ!!!!!!!!!
// DO THE Block.java class first 
// then do Ball.java and Paddle.java

// My name is Ethan Gonzalez

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Component;

public class Main extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public Main()
	{
		super("PONG");
		setSize(WIDTH,HEIGHT);
		
		Pong game = new Pong();
		
		((Component)game).setFocusable(true);			
		getContentPane().add(game);
						
		setVisible(true);
		
			
		// DO NOT REMOVE THIS LINE OF CODE
		System.out.println("2021 version.");

		System.out.println("My name is Ethan Gonzalez");
	}
	
	public static void main( String args[] )
	{
		Main run = new Main();
	}
} // END of Main.java


// NOTE: PLEASE READ

// DO NOT DO ANYTHING WITH THIS FILE
// OTHER THAN:
// Change GTE to the Java Greater Than or Equal to symbol
// Change LTE to the Java Less Than or Equal to symbol
