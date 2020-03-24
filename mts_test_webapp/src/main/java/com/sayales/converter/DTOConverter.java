package com.sayales.converter;

import com.sayales.api.dto.CarDTO;
import com.sayales.api.dto.TrackDTO;
import com.sayales.api.dto.impl.*;
import com.sayales.domain.Car;
import com.sayales.domain.Track;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class DTOConverter {

    public CarDTO convertCar(Car car) {
        return new CarDTOImpl(car.getId(),
                car.getCode(),
                car.getTransmission(),
                car.getAiState(),
                new SpeedDTOImpl(new SpeedUnitImpl(car.getSpeedUnitName().getId()),
                        car.getSpeedValue()));
    }


    public TrackDTO convertTrack(Track track) {
        return new TrackDTOImpl(track.getId(), track.getName(),
                track.getDescription(), new LengthDTOImpl(
                new LengthUnitImpl(track.getLength().getId()), track.getLengthValue()
        ), track.getCars().stream().map(this::convertCar).collect(Collectors.toList()));
    }

}
