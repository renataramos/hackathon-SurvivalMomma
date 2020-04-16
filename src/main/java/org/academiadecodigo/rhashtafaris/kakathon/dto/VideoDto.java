package org.academiadecodigo.rhashtafaris.kakathon.dto;

import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.User;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class VideoDto {

    private Integer id;

    @NotNull(message = "User is mandatory")
    @NotBlank(message = "User is mandatory")
    private User user;

    @NotNull(message = "Path is mandatory")
    @NotBlank(message = "Path is mandatory")
    private String path;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "VideoDto{" +
                "id=" + id +
                ", user=" + user +
                ", path='" + path + '\'' +
                '}';
    }
}
