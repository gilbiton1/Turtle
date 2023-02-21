
public class JumpyTurtle extends IntelligentTurtle {
	
	public void moveWithoutDraw(double distance) {
		super.moveForward(distance);
	}
//moveForward  with IntelligentTurtle conditions
	public void moveForward(double distance) {
		this.tailDown();
		for(int i=0;i<distance;i++) {
			if (i%4==0) {
				this.tailUp();
				super.moveForward(4);
				i=i+4;
			}
			this.tailDown();
			super.moveForward(1);


		}
	}


}


