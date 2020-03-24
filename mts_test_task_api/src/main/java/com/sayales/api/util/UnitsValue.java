package com.sayales.api.util;

public interface UnitsValue<U extends Unit, V extends Number> {

    U getUnit();

    V getValue();
}
