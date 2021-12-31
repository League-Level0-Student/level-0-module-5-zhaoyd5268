package _03_method_writing._1_obedient_robot;


import org.jointheleague.graphical.robot.Robot;
public class ObediantRobot {
public static void main(String[] args) {

drawsquare();
drawtriangle();







}

private static void drawtriangle() {
	Robot rob = new Robot();
	rob.penDown();
	rob.setSpeed(15);
	rob.turn(30);
	for (int ii = 0; ii<3; ii++) {

		rob.move(150);
		rob.turn(120);
	}
rob.hide();
	
}

private static void drawsquare() {
Robot rob = new Robot();
rob.penDown();
rob.setSpeed(15);
for ( int i = 0; i<4; i++) {
		rob.move(150);
		rob.turn(90);
		}
rob.hide();
}
}

