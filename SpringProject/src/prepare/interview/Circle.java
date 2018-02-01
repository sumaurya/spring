package prepare.interview;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;


public class Circle implements Shape {

	Point center;
	
	public Point getCenter() {
		return center;
	}

	@Resource(name="pointC")
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
	
	@PostConstruct
	public void init(){
		System.out.println("init of Circle");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("destroy of Circle");
	}
}
