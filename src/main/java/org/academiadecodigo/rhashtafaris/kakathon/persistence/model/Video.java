package org.academiadecodigo.rhashtafaris.kakathon.persistence.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "videos")
public class Video extends AbstractModel {

    private String path;

    /*@ManyToOne
    private User userAuthor;*/

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /*public User getUserAuthor() {
        return userAuthor;
    }

    public void setUserAuthor(User userAuthor) {
        this.userAuthor = userAuthor;
    }*/
}
