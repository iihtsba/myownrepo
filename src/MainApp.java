import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		//Load configuration from XML
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		//retrieve Bean from Spring
		Employee emp = (Employee) ctx.getBean("e");
		
		//invoke methods
		System.out.println(emp.getId());
		System.out.println(emp.getName());
	}
}
