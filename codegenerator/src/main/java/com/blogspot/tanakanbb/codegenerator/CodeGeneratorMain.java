package com.blogspot.tanakanbb.codegenerator;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CodeGeneratorMain {

    public static void main(String[] args) {
        AbstractApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext.xml");

        applicationContext.registerShutdownHook();

        
        SqlCodeListGenerator generator = (SqlCodeListGenerator) applicationContext.getBean("sqlCodeListGenerator");
        String result = generator.generate();
        System.out.println(result);
        
        applicationContext.close();
    }

}
