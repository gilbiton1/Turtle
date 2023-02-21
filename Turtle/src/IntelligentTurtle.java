import Turtle.*;
public class IntelligentTurtle extends Turtle {
//private int sides;
//private double size;


//draw a regular polygon
protected void draw(int sides,double size) {
int angle=360/sides; 
this.turnRight(90); 	
for (int i=0;i<sides;i++) {
	this.moveForward(size);
 	this.turnLeft(angle);
	}

}

}
