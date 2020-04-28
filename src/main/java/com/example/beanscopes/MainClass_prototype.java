package com.example.beanscopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) //unique every time DI is done!
public class MainClass_prototype {

    @Autowired
    private Dependency1_singleton dependency1Singleton;

    @Autowired
    private Dependency2_prototype dependency2Prototype;

    @Autowired
    private Dependency3_prototype dependency3Prototype;

    public void hello() {
        System.out.println("hello from : " + this.getClass() + " / " + this.toString());
        System.out.println("");

        System.out.println(" -- this instance never changes and we re-use the same memory --");
        dependency1Singleton.hello();
        dependency1Singleton.hello();
        dependency1Singleton.hello();

        System.out.println("\n -- this instance changes and we have new memory every time. Wait... Spring is broken!? --");
        dependency2Prototype.hello();
        dependency2Prototype.hello();
        dependency2Prototype.hello();

        System.out.println("\n -- We \"fixed\" Spring framework. Now it behaves as prototypes should. Fresh every time --");
        dependency3Prototype.hello();
        dependency3Prototype.hello();
        dependency3Prototype.hello();
    }
}