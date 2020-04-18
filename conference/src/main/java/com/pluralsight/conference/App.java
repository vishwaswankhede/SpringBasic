package com.pluralsight.conference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.service.SpeakerService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService service = context.getBean(SpeakerService.class);
        System.out.println(service.findAll().get(0).getFirstName());
        
    }
}
