
public class BurmeseTurtle extends IntelligentTurtle {
//draw a regular polygon with BurmeseTurtle conditions 
	protected void draw (int sides,double size) {
		if (Math.random()<=0.5)
			super.draw(sides-1, size);
		else
			super.draw(sides, 18);
	}	
	
	
}
