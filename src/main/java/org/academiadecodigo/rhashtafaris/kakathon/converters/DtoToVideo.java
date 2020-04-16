package org.academiadecodigo.rhashtafaris.kakathon.converters;

import org.academiadecodigo.rhashtafaris.kakathon.dto.VideoDto;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Video;
import org.academiadecodigo.rhashtafaris.kakathon.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DtoToVideo extends AbstractConverter<VideoDto, Video> {

    private VideoService videoService;

    @Autowired
    public void setVideoService(VideoService videoService) {
        this.videoService = videoService;
    }

    @Override
    public Video convert(VideoDto videoDto) {
        Video video = (videoDto.getId()) != null ? videoService.get(videoDto.getId()) : new Video();

        video.setUser(videoDto.getUser());
        video.setPath(videoDto.getPath());

        return video;
    }
}
