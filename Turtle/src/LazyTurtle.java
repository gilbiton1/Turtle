import Turtle.*;
public class LazyTurtle extends DrunkTurtle {
	public double random;

	//Methods that runs over the drunkTurtle MoveForward and move with LazyTurtle conditions
//moveForward with lazyTurtle condtions
	public void moveForward(double distance)  {
		random=Math.random();
		if (random<=0.3) {
			super.moveForward(distance);
		}
		else if(random>0.3&&random<=0.5) 
			((Turtle)this).moveForward(distance);

	}
	//tailDown Random
	public void tailDown()  {
		random=Math.random();
		if (random<0.3) {
			super.tailDown();
		}
		else if(random>0.3&&random<=0.5) 
			super.tailDown();
	}
	//	tailUp Random
	public void tailUp()  {
		random=Math.random();
		if (random<0.3) {
			super.tailUp();
		}
		else if(random>0.3&&random<=0.5) 
			super.tailUp();

	}
	//turnRight Random
	public void turnRight(int x)  {
		random=Math.random();
		if (random<0.3) {
			super.turnRight(x);
		}
		else if(random>0.3&&random<=0.5) 
			super.turnRight(x);

	}
	//turnLeft Random
	public void turnLeft(int x)  {
		random=Math.random();
		if (random<0.3) {
			super.turnLeft(x);
		}
		else if(random>0.3&&random<=0.5) 
			super.turnLeft(x);

	}

}
