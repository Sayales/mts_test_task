package com.sayales.service;

import com.sayales.api.dto.TracksDTO;

public interface TrackService {

    void saveTracks(TracksDTO tracksDTO);

    TracksDTO getTracks();
}
