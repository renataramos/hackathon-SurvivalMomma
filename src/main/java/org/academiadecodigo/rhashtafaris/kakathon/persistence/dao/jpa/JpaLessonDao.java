package org.academiadecodigo.rhashtafaris.kakathon.persistence.dao.jpa;

import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Lesson;
import org.springframework.stereotype.Repository;


@Repository
public class JpaLessonDao extends GenericJpaDao<Lesson>  {

    public JpaLessonDao() {
        super(Lesson.class);
    }
}
