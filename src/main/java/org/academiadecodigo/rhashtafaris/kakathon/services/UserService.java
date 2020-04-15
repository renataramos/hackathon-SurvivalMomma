package org.academiadecodigo.rhashtafaris.kakathon.services;

public interface UserService {

    User get(Integer id);

    User get(String email);

    User save(User user);

    void delete(Integer id);

    List<User> listUsers();

    List<Video> listVideos(Integer id);

}
