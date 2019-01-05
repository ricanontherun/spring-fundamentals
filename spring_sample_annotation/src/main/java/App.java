import com.ricanontherun.model.Customer;
import com.ricanontherun.service.CustomerService;
import com.ricanontherun.service.CustomerServiceImpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App
{

    public static void main( String[] args )
    {
        // Load the application context file.
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve a customerService bean.
        CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);

        for (Customer customer: customerService.findAll()) {
            System.out.println(String.format("Hello %s, nice to meet you", customer.getFullName()));
        }

    }
}