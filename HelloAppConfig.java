package net.rodor.HelloWorldRest;

import java.util.HashSet;
import java.util.Set;

public class HelloAppConfig extends javax.ws.rs.core.Application {
	
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(net.rodor.HelloWorldRest.Hello.class);
        
        
        return classes;
    }


}
