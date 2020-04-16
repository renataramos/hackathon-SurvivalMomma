package org.academiadecodigo.rhashtafaris.kakathon.converters;

import org.academiadecodigo.rhashtafaris.kakathon.dto.LessonDto;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Lesson;
import org.academiadecodigo.rhashtafaris.kakathon.services.LessonService;
import org.springframework.beans.factory.annotation.Autowired;

public class DtoToLesson extends AbstractConverter<LessonDto, Lesson> {

    private LessonService lessonService;

    @Autowired
    public void setLessonService(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    @Override
    public Lesson convert(LessonDto lessonDto) {

        Lesson lesson = (lessonDto.getId()) != null ? lessonService.get(lessonDto.getId()) : new Lesson();
        lesson.setId(lessonDto.getId());
        lesson.setChallenge(lessonDto.getChallenge());
        lesson.setPathImage(lessonDto.getPathImage());
        lesson.setTitle(lessonDto.getTitle());

        return lesson;
    }

}
