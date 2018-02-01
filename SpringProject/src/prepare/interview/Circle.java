package prepare.interview;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {

	Point center;
	
	public Point getCenter() {
		return center;
	}

	@Required
	public void setCenter(Point center) {
		this.center = center;
	}


	@Override
	public void draw() {
		System.out.println("Circle drawn - " + toString());
	}

	@Override
	public String toString() {
		return center.toString();
	}
}
