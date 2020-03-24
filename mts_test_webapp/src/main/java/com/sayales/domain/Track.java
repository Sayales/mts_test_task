package com.sayales.domain;

import com.sayales.api.dto.TrackDTO;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

@Entity
public class Track {

    @Id
    private int id;

    private String name;

    private String description;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private LengthUnitDomain length;

    private Double lengthValue;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Car> cars;

    public Track() {
    }

    public Track(TrackDTO trackDTO) {
        this.id = trackDTO.getId();
        this.name = trackDTO.getName();
        this.description = trackDTO.getDescription();
        this.length = new LengthUnitDomain(trackDTO.getLength().getUnit());
        this.lengthValue = trackDTO.getLength().getValue();
        this.cars = trackDTO.getCars().stream().map(Car::new).collect(Collectors.toList());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LengthUnitDomain getLength() {
        return length;
    }

    public void setLength(LengthUnitDomain length) {
        this.length = length;
    }

    public Double getLengthValue() {
        return lengthValue;
    }

    public void setLengthValue(Double lengthValue) {
        this.lengthValue = lengthValue;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
