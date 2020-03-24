package com.sayales.domain;

import com.sayales.api.util.SpeedUnit;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class SpeedUnitDomain {

    @Id
    private String id;

    public SpeedUnitDomain() {
    }

    public SpeedUnitDomain(SpeedUnit speedUnit) {
        this.id = speedUnit.getName();
    }


    public String getId() {
        return id;
    }

    public void setId(String name) {
        this.id = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpeedUnitDomain that = (SpeedUnitDomain) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

