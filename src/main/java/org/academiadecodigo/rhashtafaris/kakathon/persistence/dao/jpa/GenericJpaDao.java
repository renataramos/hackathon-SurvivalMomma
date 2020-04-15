package org.academiadecodigo.rhashtafaris.kakathon.persistence.dao.jpa;

import org.academiadecodigo.rhashtafaris.kakathon.persistence.dao.Dao;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Model;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public abstract class GenericJpaDao<T extends Model> implements Dao <T> {

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

    public abstract T findById(Integer id);

    public abstract void delete(Integer id);

    public abstract List<T> findAll();

    public abstract T getById(Integer id);

    public abstract T findByEmail(String email);

    public abstract T saveOrUpdate(User user);
}
