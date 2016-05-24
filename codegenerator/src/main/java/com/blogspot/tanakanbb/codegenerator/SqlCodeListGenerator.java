package com.blogspot.tanakanbb.codegenerator;

import javax.inject.Inject;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import freemarker.template.Configuration;

@Component
public class SqlCodeListGenerator implements CodeListGenerator {

    @Inject
    Configuration freemarkerConfiguration;
    
    @Inject
    MessageSource messageSource;
    
    @Override
    public String generate() {
        
        return "sql";
    }

}
