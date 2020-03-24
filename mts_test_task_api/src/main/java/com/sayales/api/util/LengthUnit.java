package com.sayales.api.util;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.sayales.api.dto.impl.LengthUnitImpl;

@JsonDeserialize(as = LengthUnitImpl.class)
public interface LengthUnit extends Unit {
}
