import Turtle.*;
import java.util.Scanner;
public class Army {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Turtle[] Army=new Turtle[5];//build new Turtle array
		int move=0;
		for (int i=0;i<Army.length;i++) {
			System.out.println(
					"Choose the type of a turtle:\r\n"
							+ "1.	Simple\r\n"
							+ "2.	Intelligent\r\n"
							+ "3.	Drunk\r\n"
							+ "4.	Jumpy\r\n"
							+ "5.	Lazy\r\n"
							+ "6.	Burmese\r\n"
							+ "");	
			int input=sc.nextInt();
			if(input==1) {
				Turtle simple=new Turtle();
				Army[i]=simple;
			}
			if (input==2) {
				Turtle intelligent=new IntelligentTurtle();
				Army[i]=intelligent;
			}
			if(input==3){
				Turtle drunk=new DrunkTurtle();
				Army[i]=drunk;
			}
			if(input==4) {
				Turtle jumpy=new JumpyTurtle();
				Army[i]=jumpy;
			}
			if(input==5) {
				Army[i]=new LazyTurtle();
			}
			if(input==6) {
				Turtle burmese=new BurmeseTurtle();
				Army[i]=burmese;
			}
			//place the DrunkTurtle at line
			if(Army[i] instanceof DrunkTurtle) {
				((DrunkTurtle)Army[i]).tailUpRegular();
				((DrunkTurtle)Army[i]).turnRightSahi(90);
				((DrunkTurtle)Army[i]).moveSahi(move);
				((DrunkTurtle)Army[i]).turnLeftSahi(90);
			}
			//place the JumpyTurtle at line
			else if(Army[i]instanceof JumpyTurtle) {
				Army[i].tailUp();
				Army[i].turnRight(90);
				((JumpyTurtle)Army[i]).moveWithoutDraw(move);
				Army[i].turnLeft(90);
			}
			//place the other turtles at line
			else {
				Army[i].tailUp();
				Army[i].turnRight(90);
				Army[i].moveForward(move);
				Army[i].turnLeft(90);

			}
			move=move+120; //distance between the turtles
		}

		//Army steps
		for(int i=0;i<Army.length;i++) {
			Army[i].tailDown();
			Army[i].moveForward(65);
		}
		for(int i=0;i<Army.length;i++) {
			Army[i].turnLeft(40);
		}
		for(int i=0;i<Army.length;i++) {
			Army[i].tailDown();
			Army[i].moveForward(75);
		}
		for(int i=0;i<Army.length;i++) {
			//draw a polygon with the painters
			if(Army[i] instanceof IntelligentTurtle) 
				((IntelligentTurtle)Army[i]).draw(6, 40);
		}
		for(int i=0;i<Army.length;i++) {
			Army[i].hide();
		}

	}

}
