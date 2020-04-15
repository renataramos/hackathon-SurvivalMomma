package org.academiadecodigo.rhashtafaris.kakathon.services;

import org.academiadecodigo.rhashtafaris.kakathon.persistence.dao.jpa.JpaChallengeDao;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Challenge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChallengeServiceImpl implements ChallengeService {

    private JpaChallengeDao challengeDao;

    @Autowired
    public void setChallengeDao(JpaChallengeDao challengeDao) {
        this.challengeDao = challengeDao;
    }

    @Override
    public Challenge get(Integer id) {
        return challengeDao.findById(id);
    }
}
