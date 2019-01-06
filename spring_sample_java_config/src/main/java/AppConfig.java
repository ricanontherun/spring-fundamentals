import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

// @Configuration tells Spring that this class should be used for
// configuration and dependency injection.
@Configuration

// Allows Autowire
@ComponentScan({"com.ricanontherun"})
@PropertySource("app.properties")
public class AppConfig {
    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}