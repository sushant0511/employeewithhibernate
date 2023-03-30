import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DisplayData {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter Id");
//		Employee employee=session.get(Employee.class,scanner.nextInt());
//		System.out.println(employee.getName());
		Query query=session.createQuery("from Employee");
		List<Employee> list=query.list();
		for(Employee e:list)
		{
			System.out.println(e.getName());
		}
		
		factory.close();

	}

}
