/**********************************************************************************************************************
 * Autowired using Qualifiers
 * In the context of dependency injection (DI) in Java, a qualifier is a way to distinguish between multiple
 * beans of the same type that are registered in a dependency injection container.
 * Qualifiers are annotations or other metadata that are applied to beans in order to provide additional information
 * that can be used by the DI container during the injection process.
 **********************************************************************************************************************/
package org.example.demo;
import org.example.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Customer customer = applicationContext.getBean(Customer.class);
        customer.registerAccount();

    }
}