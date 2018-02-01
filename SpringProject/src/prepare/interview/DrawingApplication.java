package prepare.interview;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

	public static void main(String[] args) {
		
		//Triangle t = new Triangle();
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Shape shape = (Shape)context.getBean("circle");
		shape.draw();

	}

}
