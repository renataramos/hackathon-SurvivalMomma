package org.academiadecodigo.rhashtafaris.kakathon.converters;

import org.academiadecodigo.rhashtafaris.kakathon.dto.LessonDto;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Lesson;

public class LessonToDto extends AbstractConverter<Lesson, LessonDto> {

    @Override
    public LessonDto convert (Lesson lesson) {

        LessonDto lessonDto = new LessonDto();
        lessonDto.setId(lesson.getId());
        lessonDto.setPathImage(lesson.getPathImage());
        lessonDto.setTitle(lesson.getTitle());

        return lessonDto;
    }
}
