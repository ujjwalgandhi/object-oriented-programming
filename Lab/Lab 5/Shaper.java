abstract public class Shaper {
	// Private member variable
	private String color;

	// Constructor
	public Shaper (String color) {
		this.color = color;
	}
 
	@Override
	public String toString() {
		return "Shape of color=\"" + color + "\"";
	}

	// All Shape subclasses must implement a method called getArea()
	abstract public double getArea();
}
