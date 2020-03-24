package com.sayales.api.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.sayales.api.dto.impl.CarDTOImpl;

@JsonDeserialize(as = CarDTOImpl.class)
public interface CarDTO {

    int getId();

    String getCode();

    String getTransmission();

    String getAiState();

    SpeedDTO getMaxSpeed();
}
