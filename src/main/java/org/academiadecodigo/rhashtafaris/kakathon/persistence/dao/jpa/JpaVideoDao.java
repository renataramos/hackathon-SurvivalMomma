package org.academiadecodigo.rhashtafaris.kakathon.persistence.dao.jpa;

import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Video;
import org.springframework.stereotype.Repository;


@Repository
public class JpaVideoDao extends GenericJpaDao<Video>   {

    public JpaVideoDao() {
        super(Video.class);
    }
}
