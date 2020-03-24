package com.sayales.domain;

import com.sayales.api.util.LengthUnit;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class LengthUnitDomain {

    @Id
    private String id;

    public LengthUnitDomain() {
    }

    public LengthUnitDomain(LengthUnit lengthUnit) {
        this.id = lengthUnit.getName();
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
        LengthUnitDomain that = (LengthUnitDomain) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
