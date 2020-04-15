package org.academiadecodigo.rhashtafaris.kakathon.services;

import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Video;

import java.util.List;

public interface VideoService {

    Video get(Integer id);

    List<Video> listVideo ();
}
