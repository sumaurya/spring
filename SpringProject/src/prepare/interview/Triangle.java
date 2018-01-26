package prepare.interview;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;

public class Triangle implements InitializingBean, DisposableBean{

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
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Triangle [pointA=" + pointA + ", pointB=" + pointB
				+ ", pointC=" + pointC + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init method");
	}
	
	public void myInit() {
		System.out.println("my init method");
	}
	
	public void cleanUp(){
		System.out.println("my cleanUp method");
	}
}
