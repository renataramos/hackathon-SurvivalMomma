package org.academiadecodigo.rhashtafaris.kakathon.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = UserNotFoundException.class)
    public ModelAndView handleUserError (HttpServletRequest request, UserNotFoundException exception) {

        ModelAndView model = new ModelAndView();
        model.setViewName("error");
        model.addObject("request", HttpStatus.NOT_FOUND);
        model.addObject("exception", exception.getMessage());

        return model;
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = VideoNotFoundException.class)
    public ModelAndView handleVideoError (HttpServletRequest request, VideoNotFoundException exception) {

        ModelAndView model = new ModelAndView();
        model.setViewName("error");
        model.addObject("request", HttpStatus.NOT_FOUND);
        model.addObject("exception", exception.getMessage());

        return model;
    }
}
