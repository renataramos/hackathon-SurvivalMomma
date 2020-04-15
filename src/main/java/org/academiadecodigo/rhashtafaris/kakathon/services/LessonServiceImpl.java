package org.academiadecodigo.rhashtafaris.kakathon.services;

import org.springframework.beans.factory.annotation.Autowired;

public class LessonServiceImpl implements LessonService{

    private LessonDao lessonDao;

    @Autowired
    public void setLessonDao(LessonDao lessonDao) {
        this.lessonDao = lessonDao;
    }

    @Override
    public Lesson get(Integer id) {
        return lessonDao.getById(id);
    }
}
