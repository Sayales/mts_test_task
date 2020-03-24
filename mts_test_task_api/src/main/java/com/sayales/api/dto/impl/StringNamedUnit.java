package com.sayales.api.dto.impl;

import com.sayales.api.util.Unit;

import java.util.Objects;

public abstract class StringNamedUnit implements Unit {

    private final String name;

    public StringNamedUnit(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringNamedUnit that = (StringNamedUnit) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public String getName() {
        return name;
    }
}
