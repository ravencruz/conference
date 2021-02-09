package org.ground.play.service;

import org.ground.play.model.Speaker;
import org.ground.play.repository.HibernateSpeakerRepositoryImpl;
import org.ground.play.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

}
