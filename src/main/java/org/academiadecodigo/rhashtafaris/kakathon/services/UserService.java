package org.academiadecodigo.rhashtafaris.kakathon.services;

import org.academiadecodigo.rhashtafaris.kakathon.exceptions.UserNotFoundException;
import org.academiadecodigo.rhashtafaris.kakathon.exceptions.VideoNotFoundException;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Client;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Video;

import java.util.List;

public interface UserService {

    Client get(Integer id) throws UserNotFoundException;

    Client get(String email) throws UserNotFoundException;

    Client save(Client user);

    void delete(Integer id)  throws UserNotFoundException;

    List<Client> listUsers();

    Video addVideo(Integer id, Video video) throws UserNotFoundException, VideoNotFoundException;

    void removeVideo(Integer id, Integer videoId) throws VideoNotFoundException, UserNotFoundException;

    //List<Video> listVideos(Integer id);
}
