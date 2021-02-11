package org.ground.play.repository;

import org.ground.play.model.Speaker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
@Profile("dev")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    private Calendar cal;

    //@Autowired As of Spring 4.3, classes with a single constructor can omit the @Autowired annotation.
    public HibernateSpeakerRepositoryImpl(Calendar cal) {
        this.cal = cal;
    }

    // dice que un caso de oso de esto podria ser usado para generar passwords!
    // mentira porq no varia entre llamadas
    @Value("#{ T(java.lang.Math).random() * 100 }")
    private double seedNum;

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Seba");
        speaker.setLastName("Torrico");
        speaker.setSeedNum(seedNum);
        speakers.add(speaker);

        System.out.println("cal " + cal.getTime());
        System.out.println("cal " + cal.getTime());

        return speakers;
    }

}
