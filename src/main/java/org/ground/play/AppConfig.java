package org.ground.play;

import org.ground.play.repository.HibernateSpeakerRepositoryImpl;
import org.ground.play.repository.SpeakerRepository;
import org.ground.play.service.SpeakerService;
import org.ground.play.service.SpeakerServiceImpl;
import org.ground.play.util.CalendarFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Calendar;

@Configuration
@ComponentScan({"org.ground.play"})
public class AppConfig {

    @Bean(name = "cal")
    public CalendarFactory calFactory() {
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return factory;
    }

    @Bean
    public Calendar cal() throws Exception {
        return calFactory().getObject();
    }
}
