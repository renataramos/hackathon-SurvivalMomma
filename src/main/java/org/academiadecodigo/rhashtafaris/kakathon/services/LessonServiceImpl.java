package org.academiadecodigo.rhashtafaris.kakathon.services;

import org.academiadecodigo.rhashtafaris.kakathon.persistence.dao.jpa.JpaLessonDao;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Lesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LessonServiceImpl implements LessonService{

    private JpaLessonDao lessonDao;

    @Autowired
    public void setLessonDao(JpaLessonDao lessonDao) {
        this.lessonDao = lessonDao;
    }

    @Transactional(readOnly = true)
    @Override
    public Lesson get(Integer id) {
        return lessonDao.getById(id);
    }
}
