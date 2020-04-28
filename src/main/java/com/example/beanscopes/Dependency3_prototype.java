package com.example.beanscopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/* - for case with MainClass as prototype and this as prototype we need to use "Proxy"
 - this way Spring does not return "snapshot" of a dependency chain but rather a proxy object which
 when called - creates and returns a new instance of target class every time it is required.
*/

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Dependency3_prototype {
    public void hello(){
        System.out.println("hello from : " + this.getClass() + " / " + this.toString());
    }
}