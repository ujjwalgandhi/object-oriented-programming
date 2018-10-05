import java.util.*;

interface Movable {
// abstract methods to be implemented by the subclasses
	public void moveUp();
	public void moveDown();
	public void moveLeft();
	public void moveRight();
}

class MovablePoint implements Movable{
	// Private member variables
	int x, y, xSpeed, ySpeed; // (x, y) coordinates of the point
	
	// Constructor
	public MovablePoint(int x, int y, int xS, int yS) {
		this.x = x;
		this.y = y;
		this.xSpeed = xS;
		this.ySpeed = yS;
	}

	@Override
	public String toString() {
		return "Point at (" + x + "," + y + ") with speed (" + xSpeed + "," + ySpeed + ")";
	}
	
	// Implement abstract methods defined in the interface Movable
	@Override
	public void moveUp() {
		y-=ySpeed;
	}
	@Override
	public void moveDown() {
		y+=ySpeed;
	}
	@Override
	public void moveLeft() {
		x-=xSpeed;
	}
	@Override
	public void moveRight() {
		x+=xSpeed;
	}
}

class xSpeedComp implements Comparator<MovablePoint>{
	public int compare(MovablePoint m1, MovablePoint m2){
		if (m1.xSpeed < m2.xSpeed)
			return -1;
		return 1;
	}
}

class ySpeedComp implements Comparator<MovablePoint>{
	public int compare(MovablePoint m1, MovablePoint m2){
		if (m1.ySpeed < m2.ySpeed)
			return -1;
		return 1;
	}
}

class MovableCircle implements Movable, Comparable<MovableCircle> {
	// instance variables
	 private MovablePoint center; // can use center.x, center.y directly
	 							  // because they are package accessible
	 private int radius;
	 
	// Constructor
	 public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		 // Call the MovablePoint's constructor to allocate the center instance.
		 center = new MovablePoint(x, y, xSpeed, ySpeed);
		 this.radius = radius;
	 }
	 
	// Implement abstract methods declared in the interface Movable
	 @Override
	 public void moveUp() {
		 center.y -= center.ySpeed;
	 }
	 @Override
	 public void moveDown() {
		 // TODO Auto-generated method stub
		 center.y += center.ySpeed;
	 }
	 @Override
	 public void moveLeft() {
		 // TODO Auto-generated method stub
		 center.x -= center.xSpeed;
	 }
	 @Override
	 public void moveRight() {
		 // TODO Auto-generated method stub
		 center.x += center.ySpeed;
	 }
	 
	 @Override
	 public String toString() {
		 return "Circle's center at (" + center.x + "," + center.y + "), Radius is " + this.radius;
	 }
	 
	 @Override
	 public int compareTo(MovableCircle mc){
		 return this.radius - mc.radius;
	 }
}

public class TestMovable {
	 public static void main(String[] args) {
		 
		 /*Movable m1 = new MovablePoint(5, 6, 5, 10); // upcast
		 System.out.println(m1);
		 m1.moveLeft();
		 System.out.println(m1);

		 Movable m2 = new MovableCircle(2, 1, 2, 2, 20); // upcast
		 System.out.println(m2);
		 m2.moveRight();
		 System.out.println(m2);

		 ArrayList<MovableCircle> list = new ArrayList<MovableCircle>();
		 list.add(new MovableCircle(2, 1, 2, 2, 20));
		 list.add(new MovableCircle(2, 1, 3, 5, 25));
		 list.add(new MovableCircle(2, 1, 2, 2, 4));
		 list.add(new MovableCircle(2, 1, 2, 2, 16));

		 Collections.sort(list);

		 System.out.println("After sorting:-");
		 for (MovableCircle m: list)
			 System.out.println(m);*/
		 
		 ArrayList<MovablePoint> list = new ArrayList<MovablePoint>();
		 list.add(new MovablePoint(1, 2, 2, 3));
		 list.add(new MovablePoint(3, 4, 4, 9));
		 list.add(new MovablePoint(5, 6, 6, 8));
		 list.add(new MovablePoint(7, 8, 5, 4));
		 
		 xSpeedComp xComp = new xSpeedComp();
		 ySpeedComp yComp = new ySpeedComp();
		 Collections.sort(list, xComp);
		 System.out.println("Sorting by xSpeed:-");
		 for (MovablePoint m: list)
			 System.out.println(m);
		 System.out.println();
		 Collections.sort(list, yComp);
		 System.out.println("Sorting by ySpeed:-");
		 for (MovablePoint m: list)
			 System.out.println(m);
		 
	 
	 }
}

