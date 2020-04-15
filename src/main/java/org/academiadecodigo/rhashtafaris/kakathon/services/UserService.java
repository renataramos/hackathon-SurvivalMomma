package org.academiadecodigo.rhashtafaris.kakathon.services;

import org.academiadecodigo.rhashtafaris.kakathon.exceptions.UserNotFoundException;
import org.academiadecodigo.rhashtafaris.kakathon.exceptions.VideoNotFoundException;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.User;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Video;

import java.util.List;

public interface UserService {

    User get(Integer id);

    User get(String email);

    User save(User user);

    void delete(Integer id)  throws UserNotFoundException;

    List<User> listUsers();

    Video addVideo(Integer id, Video video) throws UserNotFoundException, VideoNotFoundException;

    void removeVideo(Integer id, Integer videoId) throws VideoNotFoundException, UserNotFoundException;

    //List<Video> listVideos(Integer id);
}
