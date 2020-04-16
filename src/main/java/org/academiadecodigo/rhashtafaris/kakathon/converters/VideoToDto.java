package org.academiadecodigo.rhashtafaris.kakathon.converters;

import org.academiadecodigo.rhashtafaris.kakathon.dto.VideoDto;
import org.academiadecodigo.rhashtafaris.kakathon.persistence.model.Video;

public class VideoToDto extends AbstractConverter<Video, VideoDto> {

    @Override
    public VideoDto convert(Video video) {

        VideoDto videoDto = new VideoDto();

        videoDto.setId(video.getId());
        videoDto.setPath(video.getPath());
        videoDto.setUser(video.getUser());

        return videoDto;
    }
}
