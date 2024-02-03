package in.ineuron.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
 

import in.ineuron.comp.Employee;

public class TestApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee);
		
		((AbstractApplicationContext)context).close();
	}

}
