package org.academiadecodigo.rhashtafaris.kakathon.services;

import org.academiadecodigo.rhashtafaris.kakathon.persistence.dao.jpa.JpaVideoDao;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    private JpaVideoDao videoDao;

    @Autowired
    public void setVideoDao(JpaVideoDao resourceDao) {
        this.videoDao = resourceDao;
    }

    @Transactional(readOnly = true)
    @Override
    public Video get(Integer id) {
        return videoDao.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Video> listVideo (){
        return videoDao.findAll();
    }


}
