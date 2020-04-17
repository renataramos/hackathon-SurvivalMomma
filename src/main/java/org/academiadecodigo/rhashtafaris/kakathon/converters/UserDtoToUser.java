package org.academiadecodigo.rhashtafaris.kakathon.converters;

import org.academiadecodigo.rhashtafaris.kakathon.dto.UserDto;
import org.academiadecodigo.rhashtafaris.kakathon.exceptions.UserNotFoundException;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Client;
import org.academiadecodigo.rhashtafaris.kakathon.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDtoToUser {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public Client convert(UserDto userDto) throws UserNotFoundException {

        Client user = (userDto.getId() != null ? userService.get(userDto.getId()) : new Client());

        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPhone(userDto.getPhone());
        user.setRanking(userDto.getRanking());

        return user;
    }
}
