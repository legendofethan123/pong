import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
  // Instance variables (attributes, properties, fields, global)
	private int xSpeed;
	private int ySpeed;

  // default constructor to give beginning values
  // to our instance variables (No parameters)
	public Ball()
	{
	  // You must always call the super constructor first!
	  // The Block super class holds your x and y variables
		super(200,200); // calls the Block constructor
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x, int y)
	{
		// initialize your super variables in the Block portion of your object
		super(x,y);
		// now set your xSpeed and ySpeed
		this.xSpeed = 3;
		
		// do ySpeed right here and give it the default value of 1
		this.ySpeed = 1;
	}

	public Ball(int x, int y, int width, int height)
	{
		// initialize your super variables in the Block portion of your object
		super(x,y,width,height);
		
		// now set your xSpeed and ySpeed
		this.xSpeed = 3;
		
		// do ySpeed right here
			this.ySpeed = 1;
	}

	public Ball(int x, int y, int width, int height, Color color)
	{
		// initialize your super variables in the Block portion of your object
		super(x,y,width,height,color);
		
		// now set your xSpeed and ySpeed
		this.xSpeed = 3;
		
		// do ySpeed right here
			this.ySpeed = 1;
	}

	public Ball(int x, int y, int width, int height, Color color, int xSpeed, int ySpeed)
	{
		// initialize your super variables in the Block portion of your object
		super(x,y,width,height,color);
		
		// now set your xSpeed and ySpeed
		this.xSpeed = xSpeed;
		
		// do ySpeed right here
		this.ySpeed = ySpeed;
	}
	
	
   // DO NOT REWRITE getX(), setX(), etc. 
   // you did those in the Block class and you inherited them	   
   // add the set methods for xSpeed and ySpeed
   // add the get methods for xSpeed and ySpeed
   public void setXSpeed(int xSpeed)
   {
     this.xSpeed = xSpeed;
   }


   public void setYSpeed(int ySpeed)
   {
     this.ySpeed = ySpeed;
   }

public int getXSpeed()
   {
     return this.xSpeed;
   }


   public int getYSpeed()
   {
     return this.ySpeed;
   }

   
   // NOTE: THERE ARE 2 draw methods that we will write
   // we will override the draw method in the Block class
   public void draw(Graphics window)
   {
      window.setColor(getColor());
      // change me so that I draw a round ball
      window.fillOval(getX(), getY(), getWidth(), getHeight());
   }

   // we will override the draw method in the Block class
   public void draw(Graphics window, Color col)
   {
      // pass it the parameter col
      window.setColor(col);
      // change me so that I draw a round ball
      window.fillOval(getX(), getY(), getWidth(), getHeight());
   }

   public void moveAndDraw(Graphics window)
   {
   	  // draw a white ball at old ball location
   	  // so that we erase the current ball
	  draw(window,Color.WHITE);

      // change your x and y variables
      setX(getX()+xSpeed);
	  // now call setY to change your y value
 setY(getY()+ySpeed);
	  // draw the ball at its new location
	  // by calling the draw method
	  // do not pass it a color, let the draw method 
	  // use the Block color
    draw(window);
    
   }
   
	public boolean equals(Object obj)
	{
		Ball other = (Ball) obj;
		// 2 ball objects are considered equal if their attributes (properties,
		// instance variables are the same
		 if (getX()==other.getX() && getY()==other.getY() && getWidth()==other.getWidth() && getHeight()==other.getHeight())
        return true;
     else
	    	return false;
	}   


   // add a toString() method and return your super.toString() and xSpeed and ySpeed
   // remember that toString() methods should return the values of your instance variables
   public String toString()
   {
     return super.toString() + " "
+xSpeed + " " + ySpeed;
   }
}  // end of class Ball
