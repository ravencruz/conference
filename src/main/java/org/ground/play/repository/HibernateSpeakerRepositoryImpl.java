package org.ground.play.repository;

import org.ground.play.model.Speaker;
import org.springframework.aop.scope.ScopedObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Autowired
    private Calendar cal;

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Seba");
        speaker.setLastName("Torrico");
        speakers.add(speaker);

        System.out.println("cal " + cal.getTime());
        System.out.println("cal " + cal.getTime());

        return speakers;
    }

}
