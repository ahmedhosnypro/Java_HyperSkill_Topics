package spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class ApplicationContextDemo {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
        context.getBean(Person.class); // returns a Person object
        context.getBean("personMary"); // returns an Object
        context.getBean("personMary", Person.class);// returns a Person object
    }
}
