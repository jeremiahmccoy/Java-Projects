// Code by Jeremiah McCoy //
public class Frame 
{
	
	
	// First, create instance variables //
	private Double Size;
	private String Type;
	
	// Next, create a default constructor //
	public Frame() 
	{
		Size = 18.5;
		Type = "Diamond";
	}
	
	//Next, create a parameterized constructor //
	public Frame(Double Size, String Type)
	{
		setSize(Size);
		setType(Type);
	}
	
	// Create accessors for the instance variables //
	public Double getSize()
	{
		return Size;
	}
	
	public String getType()
	{
		return Type;
	}
	
	// Create mutators for the instance variables //
	public void setSize(Double Size)
	{
		if(Size>=18.5 && Size <=60)
		{
			this.Size = Size;
		}
		else
		{
			this.Size = 18.5;
		}
	}
	
	public void setType(String Type)
	{
		if(Type.equals("Diamond"))
		{
			this.Type = Type;
		}
		else if(Type.equals("Step-Through"))
		{
			this.Type = Type;
		}
		else if(Type.equals("Truss"))
		{
			this.Type = Type;
		}
		else if(Type.equals("Penny-Farthing"))
		{
			this.Type = Type;
		}
		else
		{
			this.Type = "Diamond";
		}
	}
	
	// Create an equals method that compares two Frames //
	public boolean equals(Frame frame)
	{
		if(this.Size == frame.getSize())
		{
			if(this.Type == frame.getType())
			{
				return true;
			}
		}
		return true;
	}
	
	// Create a toString method for the class Frame //
	public String toString()
	{
		return("Frame size: " + this.Size + " Frame Type: " + this.Type);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
