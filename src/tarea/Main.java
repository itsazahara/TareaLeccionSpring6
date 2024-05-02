package tarea;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Zoologico zoo = context.getBean("zoo", Zoologico.class);
		
		zoo.mostrarAnimales();
		
		}
	}
