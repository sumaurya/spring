package prepare.interview;

import java.util.List;

public class Triangle {

	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw(){
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Triangle [points=" + points + "]";
	}

	
}
