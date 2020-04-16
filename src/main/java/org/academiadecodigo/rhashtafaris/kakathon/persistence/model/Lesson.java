package org.academiadecodigo.rhashtafaris.kakathon.persistence.model;

import javax.persistence.*;

@Entity
@Table(name = "lessons")
public class Lesson extends AbstractModel {

    private String title;
    private String pathImage;

    //@OneToOne
    @Embedded
    private Challenge challenge;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPathImage() {
        return pathImage;
    }

    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }

    public Challenge getChallenge() {
        return challenge;
    }

    public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }

}
