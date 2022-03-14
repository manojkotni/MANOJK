package SpringDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Mobile {

	public static void main(String[] args) {
		
		ApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");
	System.out.println("config loaded");
	Sim sim = Context.getBean( "sim", Sim.class);
	sim.calling();
	sim.data();
	}
}