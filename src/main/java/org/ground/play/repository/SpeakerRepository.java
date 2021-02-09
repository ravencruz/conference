package org.ground.play.repository;

import org.ground.play.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
