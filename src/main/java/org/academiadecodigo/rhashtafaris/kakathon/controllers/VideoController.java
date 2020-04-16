package org.academiadecodigo.rhashtafaris.kakathon.controllers;

import org.academiadecodigo.rhashtafaris.kakathon.converters.VideoToDto;
import org.academiadecodigo.rhashtafaris.kakathon.dto.VideoDto;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Model;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Video;
import org.academiadecodigo.rhashtafaris.kakathon.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class VideoController {

    private VideoService videoService;
    private VideoToDto videoToDto;

    @Autowired
    public void setVideoService(VideoService videoService) {
        this.videoService = videoService;
    }

    @Autowired
    public void setVideoToDto(VideoToDto videoToDto) {
        this.videoToDto = videoToDto;
    }

    @GetMapping("/video")
    public String showVideos() {

        return "video";

    }
    /*public ModelAndView showVideos() {

        List<VideoDto> videos = new ArrayList<>();

        for (Video video : videoService.listVideo()) {

            VideoDto videoDto = videoToDto.convert(video);
            videos.add(videoDto);
        }

        return new ModelAndView("videos", "videoList", videos);
    }
    */

}
