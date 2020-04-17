package org.academiadecodigo.rhashtafaris.kakathon.services;

import org.academiadecodigo.rhashtafaris.kakathon.exceptions.UserNotFoundException;
import org.academiadecodigo.rhashtafaris.kakathon.exceptions.VideoNotFoundException;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.dao.jpa.JpaUserDao;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.dao.jpa.JpaVideoDao;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Client;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private JpaUserDao userDao;
    private JpaVideoDao videoDao;

    @Autowired
    public void setUserDao(JpaUserDao userDao) {
        this.userDao = userDao;
    }

    @Autowired
    public void setVideoDao(JpaVideoDao videoDao) {
        this.videoDao = videoDao;
    }

    @Transactional (readOnly = true)
    @Override
    public Client get(Integer id) throws UserNotFoundException {

        Client user = userDao.findById(id);

        if (user == null) {
            throw new UserNotFoundException();
        }

        return userDao.findById(id);
    }

    @Transactional (readOnly = true)
    @Override
    public Client get(String email) throws UserNotFoundException{

        Client user = userDao.findByEmail(email);

        if (user == null) {
            throw new UserNotFoundException();
        }

        return userDao.findByEmail(email);
    }

    @Transactional
    @Override
    public Client save(Client user) {
        return userDao.saveOrUpdate(user);
    }

    @Transactional
    @Override
    public void delete(Integer id) throws UserNotFoundException {

        Client user = userDao.findById(id);

        if (user == null) {
            throw new UserNotFoundException();
        }

        userDao.delete(id);
    }


    @Transactional (readOnly = true)
    @Override
    public List<Client> listUsers() {
        return userDao.findAll();
    }

    /*
    @Transactional(readOnly = true)
    @Override
    public List<Video> listVideos(Integer id) throws UserNotFoundException {

        User user = userDao.findById(id);

        if (user == null) {
            throw new UserNotFoundException();
        }

        return new ArrayList<Video>(userDao.findById(id).getResources());
    }
    */

    @Transactional
    @Override
    public Video addVideo(Integer id, Video video) throws UserNotFoundException, VideoNotFoundException {

        Client user = userDao.findById(id);

        if (user == null) {
            throw new UserNotFoundException();
        }

        user.addVideo(video);
        userDao.saveOrUpdate(user);

        return video;
    }

    @Transactional
    @Override
    public void removeVideo(Integer id, Integer videoId) throws VideoNotFoundException, UserNotFoundException {

        Video video = videoDao.findById(videoId);
        Client user = userDao.findById(id);

        if (video == null){
            throw new VideoNotFoundException();
        }
        if (user == null){
            throw new UserNotFoundException();
        }

        user.removeVideo(video);
        userDao.saveOrUpdate(user);
    }







}
