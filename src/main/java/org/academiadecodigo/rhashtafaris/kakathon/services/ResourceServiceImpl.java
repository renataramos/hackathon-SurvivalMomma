package org.academiadecodigo.rhashtafaris.kakathon.services;

import org.springframework.beans.factory.annotation.Autowired;

public class ResourceServiceImpl implements ResourcesService{

    private ResourceDao resourceDao;

    @Autowired
    public void setResourceDao(ResourceDao resourceDao) {
        this.resourceDao = resourceDao;
    }

    @Override
    public Resource get(Integer id) {
        return resourceDao.findById(id);
    }
}
