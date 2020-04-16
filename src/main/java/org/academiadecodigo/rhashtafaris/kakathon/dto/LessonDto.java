package org.academiadecodigo.rhashtafaris.kakathon.dto;

import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Challenge;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class LessonDto {

    private Integer id;

    @NotNull(message = "Title is mandatory")
    @NotBlank(message = "Title is mandatory")
    private String title;

    @NotNull(message = "Title is mandatory")
    @NotBlank(message = "Title is mandatory")
    private String pathImage;

    private Challenge challenge;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "LessonDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", pathImage='" + pathImage + '\'' +
                ", challenge='" + challenge + '\'' +
                '}';
    }
}
