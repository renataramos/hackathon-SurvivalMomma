package org.academiadecodigo.rhashtafaris.kakathon.persistence.dao.jpa;

import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Model;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public abstract class GenericJpaDao<T extends Model>  {

    protected Class<T> modelType;

    @PersistenceContext
    protected EntityManager em;

    public GenericJpaDao(Class<T> modelType) {
        this.modelType = modelType;
    }

    public Class<T> getModelType() {
        return modelType;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public abstract User findById(Integer id);

    public abstract void delete(Integer id);

    public abstract List<User> findAll();

    public abstract User getById(Integer id);

    public abstract User findByEmail(String email);

    public abstract User saveOrUpdate(User user);
}
