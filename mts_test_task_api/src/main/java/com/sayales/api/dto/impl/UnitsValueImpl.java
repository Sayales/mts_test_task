package com.sayales.api.dto.impl;

import com.sayales.api.util.Unit;
import com.sayales.api.util.UnitsValue;

import java.util.Objects;

public class UnitsValueImpl<U extends Unit, V extends Number> implements UnitsValue<U, V> {

    private final U unit;

    private final V number;

    public UnitsValueImpl(U unit, V number) {
        this.unit = unit;
        this.number = number;
    }


    @Override
    public String toString() {
        return "UnitsValue{" +
                "unit=" + unit +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitsValueImpl<?, ?> that = (UnitsValueImpl<?, ?>) o;
        return Objects.equals(unit, that.unit) &&
                Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, number);
    }

    public U getUnit() {
        return unit;
    }

    public V getValue() {
        return number;
    }
}
