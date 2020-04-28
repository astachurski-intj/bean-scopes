package com.example.beanscopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Dependency2_prototype {
    public void hello(){
        System.out.println("hello from : " + this.getClass() + " / " + this.toString());
    }
}