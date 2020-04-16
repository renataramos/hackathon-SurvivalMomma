package org.academiadecodigo.rhashtafaris.kakathon.controllers;

import org.academiadecodigo.rhashtafaris.kakathon.converters.DtoToVideo;
import org.academiadecodigo.rhashtafaris.kakathon.converters.UserDtoToUser;
import org.academiadecodigo.rhashtafaris.kakathon.converters.UserToUserDto;
import org.academiadecodigo.rhashtafaris.kakathon.converters.VideoToDto;
import org.academiadecodigo.rhashtafaris.kakathon.dto.UserDto;
import org.academiadecodigo.rhashtafaris.kakathon.dto.VideoDto;
import org.academiadecodigo.rhashtafaris.kakathon.exceptions.UserNotFoundException;
import org.academiadecodigo.rhashtafaris.kakathon.exceptions.VideoNotFoundException;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.User;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Video;
import org.academiadecodigo.rhashtafaris.kakathon.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    private static final int POINTS_FOR_POSTING_VIDEO = 5;

    private UserService userService;
    private UserDtoToUser userDtoToUser;
    private UserToUserDto userToUserDto;
    private VideoToDto videoToDto;
    private DtoToVideo dtoToVideo;

    @Autowired
    public void setVideoToDto(VideoToDto videoToDto) {
        this.videoToDto = videoToDto;
    }

    @Autowired
    public void setDtoToVideo(DtoToVideo dtoToVideo) {
        this.dtoToVideo = dtoToVideo;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setUserDtoToUser(UserDtoToUser userDtoToUser) {
        this.userDtoToUser = userDtoToUser;
    }

    @Autowired
    public void setUserToUserDto(UserToUserDto userToUserDto) {
        this.userToUserDto = userToUserDto;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public String showUser(@PathVariable Integer id, Model model) throws UserNotFoundException {

        User user = userService.get(id);

        model.addAttribute("user", userToUserDto.convert(user));

        return "user/show";
    }

    @GetMapping("/{id}/submit-video")
    public String showFormToSubmitVideos(@PathVariable Integer id, Model model) throws UserNotFoundException{

        User user = userService.get(id);

        UserDto userDto = userToUserDto.convert(user);
        VideoDto videoDto = videoToDto.convert(new Video());

        model.addAttribute("video", videoDto);
        model.addAttribute("user", userDto);

        return "video-form"; // Review
    }

    @PostMapping("/{id}/submit-video")
    public String addVideo (@PathVariable Integer id, @Valid @ModelAttribute VideoDto videoDto, BindingResult bindingResult) throws UserNotFoundException, VideoNotFoundException {

        if (bindingResult.hasErrors()) {
            return "video-form";
        }

        Video video = dtoToVideo.convert(videoDto);

        User user = userService.get(id);
        user.setRanking(user.getRanking() + POINTS_FOR_POSTING_VIDEO);

        userService.addVideo(id, video);
        user.addVideo(video);

        userService.save(user);

        return "video-list";
    }


}
