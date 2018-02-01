package prepare.interview;

public class Triangle implements Shape{

	private Point pointA, pointB, pointC;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw(){
		System.out.println("Triangle drawn - " + toString());
	}

	@Override
	public String toString() {
		return "[pointA=" + pointA + ", pointB=" + pointB
				+ ", pointC=" + pointC + "]";
	}
}
