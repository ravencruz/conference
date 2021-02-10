package org.ground.play.service;

import org.ground.play.model.Speaker;
import org.ground.play.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
@Profile("dev")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl parameterized constructor");
        this.repository = repository;
    }

    @PostConstruct
    /**
     * Post construct no es para obetener conecciones a la base de datos
     * like close conections
     * config after all constructors
     */
    private void init() {
        System.out.println("supuestamente luego de los contructores - INIT");
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }


    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl SETTER");
        this.repository = repository;
    }
}
