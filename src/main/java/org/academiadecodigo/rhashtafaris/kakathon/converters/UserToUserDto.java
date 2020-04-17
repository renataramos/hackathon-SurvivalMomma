package org.academiadecodigo.rhashtafaris.kakathon.converters;

import org.academiadecodigo.rhashtafaris.kakathon.dto.UserDto;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Client;
import org.springframework.stereotype.Component;

@Component
public class UserToUserDto extends AbstractConverter<Client, UserDto> {

    @Override
    public UserDto convert(Client user) {

        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        userDto.setPhone(user.getPhone());
        userDto.setRanking(user.getRanking());

        return userDto;
    }
}
