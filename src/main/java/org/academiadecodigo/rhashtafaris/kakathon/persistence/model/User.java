package org.academiadecodigo.rhashtafaris.kakathon.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User extends AbstractModel {

    private String firstName;
    private String lastName;
    private String birthYear;
    private String password;
    private String phone;
    private String email;
    private Integer ranking;

    @OneToMany(
            cascade = {CascadeType.ALL},
            orphanRemoval = true,
            mappedBy = "user",
            fetch = FetchType.EAGER
    )
    private List<Lesson> lessons = new ArrayList<>();

    /*@OneToMany(
            cascade = {CascadeType.ALL},
            orphanRemoval = true,
            mappedBy = "user",
            fetch = FetchType.EAGER
    )
    private List<Video> videos = new ArrayList<>();*/

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    /*public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }*/
}
