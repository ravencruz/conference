package org.ground.play;

import org.ground.play.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        SpeakerService service = applicationContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service);
        System.out.println(service.findAll().get(0).getFirstName());

        SpeakerService service2 = applicationContext.getBean("speakerService", SpeakerService.class);
        System.out.println(service2);
    }
}
