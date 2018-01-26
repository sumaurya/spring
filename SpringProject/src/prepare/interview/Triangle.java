package prepare.interview;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware{

	private Point pointA, pointB, pointC;
	private ApplicationContext context;
	
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
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Triangle [pointA=" + pointA + ", pointB=" + pointB
				+ ", pointC=" + pointC + "]";
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
		
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("beanName is - " + beanName);
	}
	
}
