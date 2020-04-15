package org.academiadecodigo.rhashtafaris.kakathon.exceptions;

import org.academiadecodigo.rhashtafaris.kakathon.errors.ErrorMessage;

public class UserNotFoundException extends SurvivorException {

    public UserNotFoundException() {
        super(ErrorMessage.USER_NOT_FOUND);
    }
}
