// Code by Jeremiah McCoy //
public class Bicycle 
{
	// Create instance variables for the class Bicycle //
	private String Make;
	private Wheel FrontWheel;
	private Wheel BackWheel;
	private Frame Frame;
	
	// Create a default constructor for the class Bicycle //
	public Bicycle()
	{
		Make = "none";
		FrontWheel = new Wheel();
		BackWheel = new Wheel();
		Frame = new Frame();
		
	}
	
	// Create a parameterized constructor //
	public Bicycle(String Make, Wheel FrontWheel, Wheel BackWheel, Frame Frame)
	{
		setMake(Make);
		setFrontWheel(FrontWheel);
		setBackWheel(BackWheel);
		setFrame(Frame);
	}
	
	// Create accessors for class Bicycle //
	public String getMake()
	{
		return Make;
	}
	public Wheel getFrontWheel()
	{
		return FrontWheel;
	}
	public Wheel getBackWheel()
	{
		return BackWheel;
	}
	public Frame getFrame()
	{
		return Frame;
	}
	
	// Create mutators for the class Bicycle //
	public void setMake(String Make)
	{
		this.Make = Make;
	}
	
	public void setFrontWheel(Wheel FrontWheel)
	{
		this.FrontWheel = FrontWheel;
	}
	public void setBackWheel(Wheel BackWheel)
	{
		this.BackWheel = BackWheel;
	}
	public void setFrame(Frame Frame)
	{
		this.Frame = Frame;
	}
	
	// Create an equals method to compare //
	
	public boolean equals(Bicycle Bicycle)
	{
		if(this.FrontWheel == Bicycle.getFrontWheel()) 
		{
			if(this.BackWheel == Bicycle.getBackWheel()) 
			{
				if(this.Frame == Bicycle.getFrame())
				{
					if(this.Make == Bicycle.getMake())
					{
						return true;
					}
				}
			}
		}
		return true;
	}
	
	// Create a toString method for the Bicycle class //
	
	public String toString()
	{
		return ("Bicycle Make: " + this.Make + " Front Wheel: " + this.FrontWheel + " Back Wheel: " + this.BackWheel + " Frame: " + this.Frame);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
