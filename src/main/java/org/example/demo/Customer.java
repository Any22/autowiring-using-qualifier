package org.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {
    @Autowired
    @Qualifier("savingsAccount")
    private Register register;

    public void registerAccount(){
        if (register.registerToAccount()){
            System.out.println("Customer registered !!");
        } else {
            System.out.println("Customer not registered ");
        }

    }
}

