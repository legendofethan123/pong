import java.awt.Color;
import java.awt.Graphics;

public class Block
{
  // instance variables
	private int x;
	private int y;
	private int width;
	private int height;

	private Color color;

  // a constant variable
	public final Color defaultBlockColor = Color.RED;


  // NOTE: There are several Block constructors that can
  //       be called from some other class.  
  //       We will use default values in these constructors
  //       depending on the constructor called.
	public Block()
	{
		// set all variables to meaningful default values
		// use this to call the appropriate constructor		
		this(300,300,10,10,Color.RED);
	}


	public Block (int x, int y)
	{
		// call a constructor to init your instance variables
		this(x,y,10,10,Color.RED);
	}

	public Block (int x, int y, int width, int height)
	{
		// call a constructor to init your instance variables
		// use this(.....);
this(x, y, width, height, Color.RED);
	}

	public Block (int x, int y, int width, int height, Color color)
	{
		// use this.x  = x;  etc. since the parameter names are the same as the instance variables
		// this.x refers to the instance variable x
		// set all of your instance variables here
		this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.color = color;


	}
		
	
  


	  // getter (accessor) and setter (modifier) methods
	  // notice that I don't have to use the keyword abstract
	  // I also don't have to use the keyword public
	  
	  // FINISH THESE METHODS
	  
	  public void setColor(Color col)
	  {
	  this.color = col;
	  }
	  
	  
	  public Color getColor( )
	  {
	  return this.color;
	  }
	
    public void setPos( int x, int y)
    {
    this.x=x;
    this.y=y;
    }

    public int getX()
    {
    return this.x;
    }
    
    public void setX( int x )
    {
    this.x=x;
    }

    public int getY()
    {
    return this.y;
    }
    
    public void setY( int y )
    {
    this.y=y;
    }

    public int getWidth()
    {
    return this.width;
    }
    
    public void setWidth( int width )
    {
    this.width = width;
    }
    
    public int getHeight()
    {
    return this.height;
    }
    
    public void setHeight( int height )
    {
    this.height = height;
    }


   public void draw(Graphics window)
   {
      window.setColor(getColor());
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
      window.setColor(col);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block other = (Block) obj;
		
		// two block objects are considered equal if all
		// of their attributes (instance variables or properties or fields)
		// are the same
		 if (getX()==other.getX() && getY()==other.getY() && getWidth()==other.getWidth() && getHeight()==other.getHeight() && getColor()==other.getColor())
        return true;


		return false;
	}   
    

   //add a toString() method  - return x , y , width, height, color
   public String toString(){
    
   return ("strings = " + x + y + width +  height + color);
   
}
  }  // end of class Block
