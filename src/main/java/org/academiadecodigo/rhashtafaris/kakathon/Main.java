package org.academiadecodigo.rhashtafaris.kakathon;

import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Challenge;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Client;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Lesson;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Video;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Client mariana = new Client();
        mariana.setFirstName("Mariana");
        mariana.setLastName("Pereira");
        mariana.setBirthYear("1990");
        mariana.setEmail("mariana@gmail.com");
        mariana.setPassword("1234");
        mariana.setPhone("1231231223");

        Client filipe = new Client();
        filipe.setFirstName("Filipe");
        filipe.setLastName("Zeferino");
        filipe.setBirthYear("1990");
        filipe.setEmail("filipe@gmail.com");
        filipe.setPassword("1234");
        filipe.setPhone("1231231223");

        Video video1 = new Video();
        video1.setPath("https://www.youtube.com/watch?v=D8ba5tt6Sqo");
        video1.setUser(mariana);

        Video video2 = new Video();
        video2.setPath("https://www.youtube.com/watch?v=D8ba5tt6Sqo");
        video2.setUser(filipe);

        Challenge challenge1 = new Challenge();
        challenge1.setOption1("Grab some fresh leaves and light it with a match");
        challenge1.setOption2("Use a magnifying lense next to dry natural fibers");
        challenge1.setOption3("Wait for a miracle!");
        challenge1.setOption4("Use a wood board and a stick and spin, next to dry natural fibers");
        challenge1.setQuestion("how do you start a fire");

        Lesson lesson1 = new Lesson();
        lesson1.setChallenge(challenge1);
        lesson1.setTitle("how do you start a fire");
        lesson1.setPathImage("image1");






    }
}
