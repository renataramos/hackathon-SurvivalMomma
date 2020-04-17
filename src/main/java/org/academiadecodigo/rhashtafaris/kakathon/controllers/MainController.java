package org.academiadecodigo.rhashtafaris.kakathon.controllers;

import org.academiadecodigo.rhashtafaris.kakathon.converters.UserDtoToUser;
import org.academiadecodigo.rhashtafaris.kakathon.converters.UserToUserDto;
import org.academiadecodigo.rhashtafaris.kakathon.dto.UserDto;
import org.academiadecodigo.rhashtafaris.kakathon.exceptions.UserNotFoundException;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Client;
import org.academiadecodigo.rhashtafaris.kakathon.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class MainController {

    private UserService userService;
    private UserToUserDto userToUserDto;
    private UserDtoToUser userDtoToUser;

    @Autowired
    public void setUserToUserDto(UserToUserDto userToUserDto) {
        this.userToUserDto = userToUserDto;
    }

    @Autowired
    public void setUserDtoToUser(UserDtoToUser userDtoToUser) {
        this.userDtoToUser = userDtoToUser;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/signup")
    public ModelAndView signUp () {

        UserDto userDto = userToUserDto.convert(new Client());

        return new ModelAndView("signup", "userDto", userDto);
    }

    @PostMapping("/signup")
    public String addUser(@Valid @ModelAttribute UserDto userDto, BindingResult bindingResult) throws UserNotFoundException {

        if (bindingResult.hasErrors()) {
            return "signup";
        }

        Client user = userDtoToUser.convert(userDto);

        userService.save(user);

        return "redirect:/" + user.getId();
    }
}
