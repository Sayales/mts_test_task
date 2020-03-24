package com.sayales.service;

import com.sayales.api.dto.TrackDTO;
import com.sayales.api.dto.TracksDTO;
import com.sayales.api.dto.impl.TracksDTOImpl;
import com.sayales.converter.DTOConverter;
import com.sayales.domain.Track;
import com.sayales.repository.LengthUnitDomainRepository;
import com.sayales.repository.SpeedUnitDomainRepository;
import com.sayales.repository.TrackRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class TrackServiceImpl implements TrackService {

    private final TrackRepository trackRepository;

    private final LengthUnitDomainRepository lengthUnitDomainRepository;

    private final SpeedUnitDomainRepository speedUnitDomainRepository;

    private final DTOConverter dtoConverter;


    public TrackServiceImpl(TrackRepository trackRepository,
                            LengthUnitDomainRepository lengthUnitDomainRepository,
                            SpeedUnitDomainRepository speedUnitDomainRepository, DTOConverter dtoConverter) {
        this.trackRepository = trackRepository;
        this.lengthUnitDomainRepository = lengthUnitDomainRepository;
        this.speedUnitDomainRepository = speedUnitDomainRepository;
        this.dtoConverter = dtoConverter;
    }

    @Transactional
    public void saveTracks(TracksDTO tracksDTO) {
        tracksDTO.getTrackList().forEach(this::saveTrack);
    }

    @Override
    public TracksDTOImpl getTracks() {
        return new TracksDTOImpl(StreamSupport
                .stream(trackRepository
                        .findAll()
                        .spliterator(), false)
                .map(dtoConverter::convertTrack).collect(Collectors.toList()));
    }

    private void saveTrack(TrackDTO trackDTO) {
        Track track = new Track(trackDTO);
        track.getCars().forEach(car -> speedUnitDomainRepository.save(car.getSpeedUnitName()));
        lengthUnitDomainRepository.save(track.getLength());
        trackRepository.save(track);
    }
}
