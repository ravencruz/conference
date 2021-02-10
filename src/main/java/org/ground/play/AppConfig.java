package org.ground.play;

import org.ground.play.repository.HibernateSpeakerRepositoryImpl;
import org.ground.play.repository.SpeakerRepository;
import org.ground.play.service.SpeakerService;
import org.ground.play.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"org.ground.play"})
public class AppConfig {

    //optionally a name
//    @Bean(name = "speakerService") //method level
//    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
//    public SpeakerService getSpeakerService() {
//        SpeakerService service = new SpeakerServiceImpl();
////        SpeakerServiceImpl service = new SpeakerServiceImpl(getRepository());
////        service.setRepository(getRepository());
//        return service;
//    }

//    @Bean(name="speakerRepository")
//    public SpeakerRepository getRepository() {
//        return new HibernateSpeakerRepositoryImpl();
//    }
}
