package org.ground.play.service;

import org.ground.play.model.Speaker;
import org.ground.play.repository.HibernateSpeakerRepositoryImpl;
import org.ground.play.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository; // = new HibernateSpeakerRepositoryImpl()

    public SpeakerServiceImpl(SpeakerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
