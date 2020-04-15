package org.academiadecodigo.rhashtafaris.kakathon.services;

import org.academiadecodigo.rhashtafaris.kakathon.exceptions.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    private ResourceDao resourceDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Autowired
    public void setResourceDao(ResourceDao resourceDao) {
        this.resourceDao = resourceDao;
    }

    @Override
    public User get(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public User get(String email) {
        return userDao.findByEmail(email);
    }

    @Transactional
    @Override
    public User save(User user) {
        return userDao.saveOrUpdate(user);
    }

    @Transactional
    @Override
    public void delete(Integer id) throws UserNotFoundException, AssociationExistsException{

        User user = userDao.findById(id);

        if (user == null) {
            throw new UserNotFoundException();
        }

        if (!userDao.getRequests().isEmpty()) {
            throw new AssociationExistsException();
        }

        userDao.delete(id);
    }

    @Override
    public List<User> listUsers() {
        return userDao.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public List<Resource> listResources(Integer id) throws UserNotFoundException {

        User user = userDao.findById(id);

        if (user == null) {
            throw new UserNotFoundException();
        }

        return new ArrayList<>(userDao.findById(id).getResources());
    }

    @Override
    public Resource addResource(Integer id, Resource resource) throws UserNotFoundException, ResourceNotFoundException {

        User user = userDao.getById(id);

        if (user == null) {
            throw new UserNotFoundException();
        }

    }

    @Override
    public void removeResource(Integer id, Resource resource) {

    }

    /*@Override
    public Set<Integer> getResourceId(User user) {
        return null;
    }*/
}
