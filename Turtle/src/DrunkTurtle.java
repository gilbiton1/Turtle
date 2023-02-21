import Turtle.*;
public class DrunkTurtle extends Turtle {

	protected void tailUpRegular() {
	super.tailUp();
}
	
	//move like regular turtle
	protected void moveSahi(double distance) {

		super.moveForward(distance);
	}
	//turn right like regular turtle
	protected void turnRightSahi(int x) {
		super.turnRight(x);
	}
	//turn left like regular turtle
	protected void turnLeftSahi(int x) {
		super.turnLeft(x);
	}
	//move forward with DrunkTurtle conditions
	public void moveForward(double distance) {
		
		double randomLength=(double)(Math.random()*distance);
		super.moveForward(randomLength);
		double random=Math.random();
		if(random<=0.45)
			super.turnRight(90);
		if(Math.random()<=0.35) {
			super.turnRight(180);
			super.moveForward(randomLength);
		}
		else {
			super.moveForward(randomLength);
		}
		}
		

//turn left with DrunkTurtle conditions
	public void turnLeft (int x) {
		int randomAngle=(int)(Math.random()*(1.5*x));
		super.turnLeft(randomAngle);
	}
//turn right with DrunkTurtle conditions
	public void turnRight (int x) {
		int randomAngle=(int)(Math.random()*(1.5*x));
		super.turnRight(randomAngle);
	}
}