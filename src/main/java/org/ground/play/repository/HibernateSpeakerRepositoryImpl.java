package org.ground.play.repository;

import org.ground.play.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Seba");
        speaker.setLastName("Torrico");
        speakers.add(speaker);
        return speakers;
    }

}
