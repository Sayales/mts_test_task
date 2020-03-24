package com.sayales.domain;

import com.sayales.api.dto.CarDTO;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Car {

    @Id
    private int id;

    private String code;

    private String transmission;

    private String aiState;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private SpeedUnitDomain speedUnitName;

    private Double speedValue;

    public Car() {
    }

    public Car(CarDTO carDTO) {
        this.id = carDTO.getId();
        this.code = carDTO.getCode();
        this.transmission = carDTO.getTransmission();
        this.aiState = carDTO.getAiState();
        this.speedUnitName = new SpeedUnitDomain(carDTO.getMaxSpeed().getUnit());
        this.speedValue = carDTO.getMaxSpeed().getValue();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getAiState() {
        return aiState;
    }

    public void setAiState(String aiState) {
        this.aiState = aiState;
    }

    public SpeedUnitDomain getSpeedUnitName() {
        return speedUnitName;
    }

    public void setSpeedUnitName(SpeedUnitDomain speedUnitName) {
        this.speedUnitName = speedUnitName;
    }

    public Double getSpeedValue() {
        return speedValue;
    }

    public void setSpeedValue(Double speedValue) {
        this.speedValue = speedValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id &&
                Objects.equals(code, car.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code);
    }
}
