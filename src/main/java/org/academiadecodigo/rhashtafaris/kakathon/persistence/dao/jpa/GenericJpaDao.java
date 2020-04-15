package org.academiadecodigo.rhashtafaris.kakathon.persistence.dao.jpa;

import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
}
