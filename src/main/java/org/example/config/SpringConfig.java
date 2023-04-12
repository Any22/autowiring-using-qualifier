package org.example.config;
import org.example.demo.CurrentAccount;
import org.example.demo.Customer;
import org.example.demo.Register;
import org.example.demo.SavingsAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SpringConfig {
    @Bean
    public Register currentAccount(){
        return new CurrentAccount();
    }
    @Bean
    public Register savingsAccount(){
        return new SavingsAccount();
    }
    @Bean
    public Customer customer(){

        return new Customer();
    }
}
