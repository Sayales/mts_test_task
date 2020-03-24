package com.sayales.api.dto.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.sayales.api.dto.CarDTO;
import com.sayales.api.dto.SpeedDTO;

import java.util.Objects;

@JsonRootName(value = "car", namespace = "cars")
public class CarDTOImpl implements CarDTO {

    private final int id;

    private final String code;

    private final String transmission;

    private final String aiState;

    private final SpeedDTOImpl maxSpeed;

    @JsonCreator
    public CarDTOImpl(@JsonProperty("id") int id,
                      @JsonProperty("code") String code,
                      @JsonProperty("transmission") String transmission,
                      @JsonProperty("ai") String aiState,
                      @JsonProperty("max-speed") SpeedDTOImpl maxSpeed) {
        this.id = id;
        this.code = code;
        this.transmission = transmission;
        this.aiState = aiState;
        this.maxSpeed = maxSpeed;
    }


    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getAiState() {
        return aiState;
    }

    public SpeedDTO getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarDTOImpl carDTO = (CarDTOImpl) o;
        return id == carDTO.id &&
                Objects.equals(code, carDTO.code) &&
                Objects.equals(transmission, carDTO.transmission) &&
                Objects.equals(aiState, carDTO.aiState) &&
                Objects.equals(maxSpeed, carDTO.maxSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, transmission, aiState, maxSpeed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", transmission='" + transmission + '\'' +
                ", aiState='" + aiState + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
