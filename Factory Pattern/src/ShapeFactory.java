
public class ShapeFactory {

	public Shape createShape(String shape){
		
		if(shape == null) return null; 
		if(shape.equalsIgnoreCase("CIRCLE")) return new Circle(); 
		if(shape.equalsIgnoreCase("TRIANGLE")) return new Triangle(); 
		if(shape.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
		
		return null;
	}
	
}
