package com.littlejohnny.aspects;

import com.littlejohnny.aspects.components.IUser;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Config.class);
        context.refresh();

        System.out.println(context.getBean(IUser.class).doWork("......"));

        for(String element : context.getBeanDefinitionNames()) {
            System.out.println(element);
        }
    }
}
