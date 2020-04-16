package org.academiadecodigo.rhashtafaris.kakathon.controllers;

import org.academiadecodigo.rhashtafaris.kakathon.converters.UserDtoToUser;
import org.academiadecodigo.rhashtafaris.kakathon.converters.UserToUserDto;
import org.academiadecodigo.rhashtafaris.kakathon.dto.UserDto;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.User;
import org.academiadecodigo.rhashtafaris.kakathon.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {

    private UserService userService;
    private UserDtoToUser userDtoToUser;
    private UserToUserDto userToUserDto;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setUserDto(UserToUserDto userToUserDto) {
        this.userToUserDto = userToUserDto;
    }

    @Autowired
    public void setUserDtoToUser(UserDtoToUser userDtoToUser) {
        this.userDtoToUser = userDtoToUser;
    }

    @GetMapping("/")
    public ModelAndView userList () {

        //model.addAttribute("user", userService.listUsers());

        return new ModelAndView("test");
    }
}
