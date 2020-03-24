package com.sayales.api.dto.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sayales.api.dto.TrackDTO;
import com.sayales.api.dto.TracksDTO;

import java.util.List;
import java.util.Objects;

public class TracksDTOImpl implements TracksDTO {

    private final List<TrackDTO> trackList;

    @JsonCreator
    public TracksDTOImpl(@JsonProperty("tracks") List<TrackDTO> tracks) {
        this.trackList = tracks;
    }

    public List<TrackDTO> getTrackList() {
        return trackList;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TracksDTOImpl tracksDTO = (TracksDTOImpl) o;
        return Objects.equals(trackList, tracksDTO.trackList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackList);
    }

    @Override
    public String toString() {
        return "Tracks{" +
                "trackList=" + trackList +
                '}';
    }
}
