package org.ground.play;

import org.ground.play.repository.HibernateSpeakerRepositoryImpl;
import org.ground.play.repository.SpeakerRepository;
import org.ground.play.service.SpeakerService;
import org.ground.play.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    //optionally a name
    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        //SpeakerService service = new SpeakerServiceImpl();
        SpeakerServiceImpl service = new SpeakerServiceImpl(getRepository());
//        service.setRepository(getRepository());
        return service;
    }

    @Bean(name="speakerRepository")
    public SpeakerRepository getRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
}
