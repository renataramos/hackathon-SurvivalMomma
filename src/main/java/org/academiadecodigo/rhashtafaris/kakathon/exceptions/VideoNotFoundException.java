package org.academiadecodigo.rhashtafaris.kakathon.exceptions;

import org.academiadecodigo.rhashtafaris.kakathon.errors.ErrorMessage;

public class VideoNotFoundException extends SurvivorException {

    public VideoNotFoundException() {
        super(ErrorMessage.VIDEO_NOT_FOUND);
    }
}
