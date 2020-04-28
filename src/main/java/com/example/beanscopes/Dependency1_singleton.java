package com.example.beanscopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Dependency1_singleton {
    public void hello(){
        System.out.println("hello from : " + this.getClass() + " / " + this.toString());
    }
}
