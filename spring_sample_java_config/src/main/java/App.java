import com.ricanontherun.model.Customer;
import com.ricanontherun.service.CustomerService;
import com.ricanontherun.service.CustomerServiceImpl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App
{

    public static void main( String[] args )
    {
        // Load the application context from the AppConfig configuration class.
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve a customerService bean.
        CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);

        customerService.findAll().forEach(customer -> {
            System.out.println(customer.getFullName());
        });
    }
}