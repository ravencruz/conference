package org.ground.play;

import org.ground.play.service.SpeakerService;
import org.ground.play.service.SpeakerServiceImpl;

public class Application {

    public static void main(String[] args) {
        SpeakerService service = new SpeakerServiceImpl();
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
