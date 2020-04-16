package org.academiadecodigo.rhashtafaris.kakathon.controllers;

import org.academiadecodigo.rhashtafaris.kakathon.converters.LessonToDto;
import org.academiadecodigo.rhashtafaris.kakathon.converters.UserDtoToUser;
import org.academiadecodigo.rhashtafaris.kakathon.converters.UserToUserDto;
import org.academiadecodigo.rhashtafaris.kakathon.dto.LessonDto;
import org.academiadecodigo.rhashtafaris.kakathon.dto.UserDto;
import org.academiadecodigo.rhashtafaris.kakathon.exceptions.UserNotFoundException;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.User;
import org.academiadecodigo.rhashtafaris.kakathon.services.LessonService;
import org.academiadecodigo.rhashtafaris.kakathon.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/lesson")
public class LessonController {

    private static final int POINTS_FOR_WINNING_QUIZZ = 3;

    private LessonService lessonService;
    private LessonToDto lessonToDto;
    private UserService userService;
    private UserDtoToUser userDtoToUser;
    private UserToUserDto userToUserDto;

    @Autowired
    public void setUserDtoToUser(UserDtoToUser userDtoToUser) {
        this.userDtoToUser = userDtoToUser;
    }

    @Autowired
    public void setUserToUserDto(UserToUserDto userToUserDto) {
        this.userToUserDto = userToUserDto;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setLessonToDto(LessonToDto lessonToDto) {
        this.lessonToDto = lessonToDto;
    }

    @Autowired
    public void setLessonService(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    @GetMapping("/1/user={id}")
    public String showLessonOne(@PathVariable Integer id, Model model) throws UserNotFoundException {

        UserDto userDto = userToUserDto.convert(userService.get(id));

        LessonDto lessonDto = lessonToDto.convert(lessonService.get(1));

        model.addAttribute("userDto", userDto);
        model.addAttribute("lessonDto", lessonDto);

        return "lesson-one";
    }

    @GetMapping("/2/user={id}")
    public String showLessonTwo(@PathVariable Integer id, Model model) throws UserNotFoundException {

        UserDto userDto = userToUserDto.convert(userService.get(id));

        LessonDto lessonDto = lessonToDto.convert(lessonService.get(2));

        model.addAttribute("userDto", userDto);
        model.addAttribute("lessonDto", lessonDto);

        return "lesson-two";
    }

    @GetMapping("/3/user={id}")
    public String showLessonThree(@PathVariable Integer id, Model model) throws UserNotFoundException {

        UserDto userDto = userToUserDto.convert(userService.get(id));

        LessonDto lessonDto = lessonToDto.convert(lessonService.get(3));

        model.addAttribute("userDto", userDto);
        model.addAttribute("lessonDto", lessonDto);

        return "lesson-three";
    }

    @PostMapping("/{id}/quizz")
    public String addQuizzResult(@ModelAttribute UserDto userDto) throws UserNotFoundException{

        User user = userDtoToUser.convert(userDto);

        user.setRanking(user.getRanking() + POINTS_FOR_WINNING_QUIZZ);

        userService.save(user);

        return "redirect:/user/show/" + user.getId();
    }
}
