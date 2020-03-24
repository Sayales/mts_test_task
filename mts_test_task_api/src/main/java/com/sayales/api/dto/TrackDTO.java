package com.sayales.api.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.sayales.api.dto.impl.TrackDTOImpl;

import java.util.List;

@JsonDeserialize(as = TrackDTOImpl.class)
public interface TrackDTO {

    int getId();

    String getName();

    String getDescription();

    LengthDTO getLength();

    List<CarDTO> getCars();
}
