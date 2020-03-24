package com.sayales.api.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.sayales.api.dto.impl.TracksDTOImpl;

import java.util.List;

@JsonDeserialize(as = TracksDTOImpl.class)
public interface TracksDTO {

    List<TrackDTO> getTrackList();

}
