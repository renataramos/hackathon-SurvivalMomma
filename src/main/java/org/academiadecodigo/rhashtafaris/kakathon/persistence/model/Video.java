package org.academiadecodigo.rhashtafaris.kakathon.persistence.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "videos")
public class Video extends AbstractModel {

    private String path;

    @ManyToOne
    private Client client;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Client getUser() {
        return client;
    }

    public void setUser(Client user) {
        this.client = user;
    }
}
