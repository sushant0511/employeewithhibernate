import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {

		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		session.getTransaction().begin();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter name");
		String newName=scanner.next();
		System.out.println("Enter id to update name");
		Employee employee=session.get(Employee.class,scanner.nextInt() );
		employee.setName(newName);
		session.save(employee);
		session.getTransaction().commit();
		

	}

}
