package com.sayales.api.dto.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.sayales.api.dto.CarDTO;
import com.sayales.api.dto.LengthDTO;
import com.sayales.api.dto.TrackDTO;

import java.util.List;
import java.util.Objects;

@JsonRootName(value = "tracks")
public class TrackDTOImpl implements TrackDTO {

    private final int id;

    private final String name;

    private final String description;

    private final LengthDTO length;

    private final List<CarDTO> cars;

    @JsonCreator
    public TrackDTOImpl(@JsonProperty("id") int id,
                        @JsonProperty("name") String name,
                        @JsonProperty("description") String description,
                        @JsonProperty("length") LengthDTO length,
                        @JsonProperty("cars") List<CarDTO> cars) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.length = length;
        this.cars = cars;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LengthDTO getLength() {
        return length;
    }

    public List<CarDTO> getCars() {
        return cars;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrackDTOImpl trackDTO = (TrackDTOImpl) o;
        return id == trackDTO.id &&
                Objects.equals(name, trackDTO.name) &&
                Objects.equals(description, trackDTO.description) &&
                Objects.equals(length, trackDTO.length) &&
                Objects.equals(cars, trackDTO.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, length, cars);
    }

    @Override
    public String toString() {
        return "Track{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", length=" + length +
                ", cars=" + cars +
                '}';
    }
}
