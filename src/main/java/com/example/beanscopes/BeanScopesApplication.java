package com.example.beanscopes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/* - retrieve 3 times Bean which is configured with default scope which is... singleton
 - nest dependencies and observe behaviour - dependency with default SCOPE - all works fine
 - we want to have prototypes in NESTED dependencies - works fine with BOTH prototypes and BOTH singletons
 - it works fine if MainClass is prototype and dependency is singleton
 - we want dependency to be prototype but MainClass to be singleton? - IT DOESN'T WORK - dependency is always the same
*/

@SpringBootApplication
public class BeanScopesApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(BeanScopesApplication.class, args);
        System.out.println(" -- 1 run of our application's top-level class: ");
        ctx.getBean(MainClass_prototype.class).hello();

        System.out.println();
        System.out.println(" -- 2 run of our application's top-level class: ");
        ctx.getBean(MainClass_prototype.class).hello();

        System.out.println();
        System.out.println(" -- 3 run of our application's top-level class: ");
        ctx.getBean(MainClass_prototype.class).hello();
	}
}
