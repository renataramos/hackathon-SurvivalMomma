package org.academiadecodigo.rhashtafaris.kakathon.persistence.dao.jpa;

import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.User;
import org.springframework.stereotype.Repository;


@Repository
public class JpaUserDao extends GenericJpaDao<User>  {

    public JpaUserDao() {
        super(User.class);
    }
}
