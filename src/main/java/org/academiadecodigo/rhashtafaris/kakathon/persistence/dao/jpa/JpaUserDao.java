package org.academiadecodigo.rhashtafaris.kakathon.persistence.dao.jpa;

import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Client;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


@Repository
public class JpaUserDao extends GenericJpaDao<Client>  {

    public JpaUserDao() {
        super(Client.class);
    }

    public Client findByEmail(String email){
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Client> query = builder.createQuery(Client.class);
        Root<Client> root = query.from(Client.class);

        query.select(root).where(builder.like(root.get("id"), "%email%"));

        return em.createQuery(query).getSingleResult();
    }
}
