// Code by Jeremiah McCoy //
public class Wheel 
{
	// First, create instance variables //
	private Double Diameter;
	private Double Width;
	
	// Next, create a default constructor //
	public Wheel() 
	{
		Diameter = 16.0;
		Width = 1.0;
	}
	
	//Next, create a parameterized constructor //
	public Wheel(Double Diameter, Double Width)
	{
		setDiameter(Diameter);
		setWidth(Width);
	}
	public Wheel(int Diameter, int Width)
	{
		Double d = (double)Diameter;
		Double w = (double)Width;
		setWidth(w);
		setDiameter(d);
	}
	
	// Create accessors for the instance variables //
	public Double getDiameter()
	{
		return Diameter;
	}
	
	public Double getWidth()
	{
		return Width;
	}
	
	// Create mutators for the instance variables //
	public void setDiameter(Double Diameter)
	{
		if(Diameter>=16 && Diameter <=55)
		{
			this.Diameter = Diameter;
		}
		else
		{
			this.Diameter = 16.0;
		}
	}
	
	public void setWidth(Double Width)
	{
		if(Width>=1 && Width <=2.5)
		{
			this.Width = Width;
		}
		else
		{
			this.Width = 1.0;
		}
	}
	
	// Create a toString method for the class Wheel //
	public String toString()
	{
		return("Diameter: " + this.Diameter + " Width: " + this.Width);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
