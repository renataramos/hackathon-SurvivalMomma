package org.academiadecodigo.rhashtafaris.kakathon.persistence.dao.jpa;

import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Challenge;
import org.springframework.stereotype.Repository;


@Repository
public class JpaChallengeDao extends GenericJpaDao<Challenge>  {

    public JpaChallengeDao() {
        super(Challenge.class);
    }
}
